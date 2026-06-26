package org.telegram.ui.community.cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;

public class CommunityLinkView2 extends FrameLayout implements Theme.Colorable {
    private final ImageView arrowView;
    public final BackupImageView avatarView;
    private final Drawable communityCardsDrawable;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView subtitleView;
    public final TextView titleView;

    public CommunityLinkView2(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        this.communityCardsDrawable = context.getResources().getDrawable(R.drawable.community_cards).mutate();
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(7.3125f));
        addView(backupImageView, LayoutHelper.createFrame(26, 26.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        TextView textView2 = new TextView(context);
        this.subtitleView = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 19, 58.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.arrowView = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        DrawableUtils.drawCommunityCardDrawable(canvas, this.communityCardsDrawable, this.avatarView.getLeft() + (this.avatarView.getWidth() / 2.0f), this.avatarView.getTop() + (this.avatarView.getHeight() / 2.0f), this.avatarView.getHeight());
        super.dispatchDraw(canvas);
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : null;
        if (paint == null) {
            paint = Theme.dividerPaint;
        }
        canvas.drawLine(AndroidUtilities.dp(58.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
    }

    public void setTitle(CharSequence charSequence) {
        this.titleView.setText(charSequence);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.subtitleView.setText(charSequence);
    }

    public void setChat(int i, TLRPC.Chat chat) {
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(chat.id);
        setTitle(DialogObject.getShortName(chat));
        setSubtitle(LocaleController.formatPluralString("CommunityWithChats", chatFull != null ? chatFull.linked_peers.size() : 0, new Object[0]));
        this.avatarView.setForUserOrChat(chat, new AvatarDrawable(chat));
    }

    @Override
    public void updateColors() {
        ImageView imageView = this.arrowView;
        int i = Theme.key_windowBackgroundWhiteGrayText2;
        imageView.setColorFilter(Theme.getColor(i, this.resourcesProvider));
        TextView textView = this.titleView;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i2, this.resourcesProvider));
        this.subtitleView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        this.communityCardsDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
    }
}
