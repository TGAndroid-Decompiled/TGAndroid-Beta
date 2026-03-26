package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;

public class DialogsHintCell extends FrameLayout {
    private final AvatarsImageView avatarsImageView;
    private final ImageView chevronView;
    private final ImageView closeView;
    private final LinearLayout contentView;
    private int height;
    public final BackupImageView imageView;
    public final LinkSpanDrawable.LinksTextView messageView;
    private final LinearLayout parentView;
    public boolean titleIsError;
    public final AnimatedEmojiSpan.TextViewEmojis titleView;

    public void setCompact(boolean z) {
    }

    public DialogsHintCell(Context context) {
        super(context);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
        this.avatarsImageView = avatarsImageView;
        avatarsImageView.setStepFactor(0.56790125f);
        avatarsImageView.setVisibility(8);
        avatarsImageView.setCount(0);
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.contentView = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), 0);
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(context);
        this.titleView = textViewEmojis;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textViewEmojis.setEllipsize(truncateAt);
        textViewEmojis.setTextSize(1, 14.0f);
        textViewEmojis.setTypeface(AndroidUtilities.bold());
        textViewEmojis.setMaxLines(5);
        linearLayout.addView(textViewEmojis, LayoutHelper.createLinear(-2, -2, 0.0f, (LocaleController.isRTL ? 5 : 3) | 48));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        this.messageView = linksTextView;
        linksTextView.setTextSize(1, 13.0f);
        linksTextView.setEllipsize(truncateAt);
        linksTextView.setMaxLines(5);
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 48));
        NotificationCenter.getGlobalInstance().listenGlobal(this, NotificationCenter.emojiLoaded, new Utilities.Callback() {
            @Override
            public final void run(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                this.f$0.lambda$new$0((Object[]) obj);
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.parentView = linearLayout2;
        linearLayout2.setOrientation(0);
        if (LocaleController.isRTL) {
            linearLayout2.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(avatarsImageView, LayoutHelper.createFrame(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(backupImageView, LayoutHelper.createFrame(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(backupImageView, LayoutHelper.createFrame(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(avatarsImageView, LayoutHelper.createFrame(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, LayoutHelper.createFrame(-1, -1.0f));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.chevronView = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        addView(imageView, LayoutHelper.createFrame(16, 16.0f, (LocaleController.isRTL ? 3 : 5) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.closeView = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(imageView2, LayoutHelper.createFrame(36, 36.0f, (LocaleController.isRTL ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
    }

    public void lambda$new$0(Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.titleView;
        if (textViewEmojis != null) {
            textViewEmojis.invalidate();
        }
        LinkSpanDrawable.LinksTextView linksTextView = this.messageView;
        if (linksTextView != null) {
            linksTextView.invalidate();
        }
    }

    public void updateColors() {
        this.titleView.setTextColor(Theme.getColor(this.titleIsError ? Theme.key_text_RedBold : Theme.key_windowBackgroundWhiteBlackText));
        LinkSpanDrawable.LinksTextView linksTextView = this.messageView;
        int i = Theme.key_windowBackgroundWhiteGrayText;
        linksTextView.setTextColor(Theme.getColor(i));
        this.messageView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn));
        ImageView imageView = this.chevronView;
        int color = Theme.getColor(i);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(color, mode);
        this.closeView.setColorFilter(Theme.getColor(i), mode);
        this.closeView.setBackground(Theme.AdaptiveRipple.filledCircle());
    }

    public void setAvatars(int i, ArrayList arrayList) {
        int iMin = Math.min(3, arrayList == null ? 0 : arrayList.size());
        AvatarsImageView avatarsImageView = this.avatarsImageView;
        boolean z = iMin != avatarsImageView.avatarsDrawable.count;
        if (iMin <= 1) {
            avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
            this.avatarsImageView.setSize(AndroidUtilities.dp(36.0f));
        } else {
            avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
            this.avatarsImageView.setSize(AndroidUtilities.dp(30.0f));
        }
        this.avatarsImageView.setCount(iMin);
        this.avatarsImageView.setVisibility(iMin <= 0 ? 8 : 0);
        this.avatarsImageView.getLayoutParams().width = iMin <= 1 ? AndroidUtilities.dp(36.0f) : AndroidUtilities.dp(((iMin - 1) * 18) + 30);
        if (z) {
            this.parentView.requestLayout();
        }
        if (arrayList != null) {
            int i2 = 0;
            while (i2 < 3) {
                this.avatarsImageView.setObject(i2, i, i2 >= arrayList.size() ? null : (TLObject) arrayList.get(i2));
                i2++;
            }
        }
        this.avatarsImageView.commitTransition(false);
    }

    public void clear() {
        setCompact(false);
        setAvatars(UserConfig.selectedAccount, null);
        this.imageView.setVisibility(8);
        this.imageView.clearImage();
    }

    public void showImage() {
        this.imageView.setVisibility(0);
    }

    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        setText(charSequence, charSequence2, true, false);
    }

    public void setText(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.titleIsError = z2;
        this.titleView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        this.titleView.setText(charSequence);
        this.titleView.setCompoundDrawables(null, null, null, null);
        this.messageView.setText(charSequence2);
        this.chevronView.setVisibility(z ? 0 : 8);
        this.closeView.setVisibility(8);
        int iDp = z ? AndroidUtilities.dp(24.0f) : 0;
        LinearLayout linearLayout = this.contentView;
        boolean z3 = LocaleController.isRTL;
        int i = z3 ? iDp : 0;
        if (z3) {
            iDp = 0;
        }
        linearLayout.setPadding(i, 0, iDp, 0);
        updateColors();
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.chevronView.setVisibility(4);
        this.closeView.setVisibility(0);
        this.closeView.setOnClickListener(onClickListener);
    }

    @Override
    public void setOnClickListener(final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$setOnClickListener$1(onClickListener, view);
            }
        });
    }

    public void lambda$setOnClickListener$1(View.OnClickListener onClickListener, View view) {
        if (getAlpha() <= 0.5f || onClickListener == null) {
            return;
        }
        onClickListener.onClick(view);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.contentView;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        int measuredHeight = this.contentView.getMeasuredHeight() + getPaddingTop() + getPaddingBottom();
        this.height = measuredHeight;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        this.closeView.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.avatarsImageView.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.imageView.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.chevronView.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
    }
}
