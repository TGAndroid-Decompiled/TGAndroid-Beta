package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.spoilers.SpoilerEffect;

public final class ChatReplyContainer$Layout extends FrameLayout implements Theme.Colorable {
    public boolean active;
    public boolean hasSpoiler;
    public final ImageView icon;
    public final ChatActivity.AnonymousClass69 image;
    public final SimpleTextView name;
    public final SimpleTextView obj;
    public final SimpleTextView objHint;
    public final Theme.ResourcesProvider resourcesProvider;

    public ChatReplyContainer$Layout(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        ImageView imageView = new ImageView(context);
        this.icon = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, LayoutHelper.createFrame(52, 46, 51));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.name = simpleTextView;
        simpleTextView.setTextSize(14);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        addView(simpleTextView, LayoutHelper.createFrame(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.obj = simpleTextView2;
        simpleTextView2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(simpleTextView2);
        addView(simpleTextView2, LayoutHelper.createFrame(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        SimpleTextView simpleTextView3 = new SimpleTextView(context);
        this.objHint = simpleTextView3;
        simpleTextView3.setTextSize(14);
        simpleTextView3.setText(LocaleController.getString(R.string.TapForForwardingOptions), false);
        simpleTextView3.setAlpha(0.0f);
        addView(simpleTextView3, LayoutHelper.createFrame(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        ChatActivity.AnonymousClass69 anonymousClass69 = new ChatActivity.AnonymousClass69(this, context, new SpoilerEffect());
        this.image = anonymousClass69;
        anonymousClass69.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(anonymousClass69, LayoutHelper.createFrame(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors$1();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.active) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void updateColors$1() {
        int i = Theme.key_chat_replyPanelIcons;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.icon.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        this.name.setTextColor(Theme.getColor(Theme.key_chat_replyPanelName, resourcesProvider));
        int i2 = Theme.key_glass_defaultText;
        int color = Theme.getColor(i2, resourcesProvider);
        SimpleTextView simpleTextView = this.obj;
        simpleTextView.setTextColor(color);
        simpleTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        this.objHint.setTextColor(Theme.getColor(i2, resourcesProvider));
    }
}
