package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.BlurredFrameLayout;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
public class DialogsHintCell extends BlurredFrameLayout {
    private final AvatarsImageView avatarsImageView;
    private final ImageView chevronView;
    private final ImageView closeView;
    private final LinearLayout contentView;
    private int height;
    private final TextView messageView;
    private final LinearLayout parentView;
    public final AnimatedEmojiSpan.TextViewEmojis titleView;

    public DialogsHintCell(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout) {
        super(context, sizeNotifierFrameLayout);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f));
        AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
        this.avatarsImageView = avatarsImageView;
        avatarsImageView.setStepFactor(0.56790125f);
        avatarsImageView.setVisibility(8);
        avatarsImageView.setCount(0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.contentView = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), 0);
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(context);
        this.titleView = textViewEmojis;
        textViewEmojis.setEllipsize(TextUtils.TruncateAt.END);
        textViewEmojis.setTextSize(1, 15.0f);
        textViewEmojis.setTypeface(AndroidUtilities.bold());
        textViewEmojis.setSingleLine();
        linearLayout.addView(textViewEmojis, LayoutHelper.createLinear(-2, -2, 0.0f, (LocaleController.isRTL ? 5 : 3) | 48));
        TextView textView = new TextView(context);
        this.messageView = textView;
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 48));
        NotificationCenter.getGlobalInstance().listenGlobal(this, NotificationCenter.emojiLoaded, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                DialogsHintCell.this.lambda$new$0((Object[]) obj);
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.parentView = linearLayout2;
        linearLayout2.setOrientation(0);
        if (LocaleController.isRTL) {
            linearLayout2.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(avatarsImageView, LayoutHelper.createFrame(0, -1.0f, 16, 2.0f, 0.0f, 0.0f, 0.0f));
        } else {
            linearLayout2.addView(avatarsImageView, LayoutHelper.createFrame(0, -1.0f, 16, 0.0f, 0.0f, 2.0f, 0.0f));
            linearLayout2.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, LayoutHelper.createFrame(-1, -1.0f));
        ImageView imageView = new ImageView(context);
        this.chevronView = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        addView(imageView, LayoutHelper.createFrame(16, 16, (LocaleController.isRTL ? 3 : 5) | 16));
        ImageView imageView2 = new ImageView(context);
        this.closeView = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        boolean z = LocaleController.isRTL;
        addView(imageView2, LayoutHelper.createFrame(-2, -2.0f, (z ? 3 : 5) | 16, z ? -8.0f : 0.0f, 0.0f, z ? 0.0f : -8.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        updateColors();
    }

    public void lambda$new$0(Object[] objArr) {
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.titleView;
        if (textViewEmojis != null) {
            textViewEmojis.invalidate();
        }
        TextView textView = this.messageView;
        if (textView != null) {
            textView.invalidate();
        }
    }

    public void setCompact(boolean z) {
        setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(z ? 4.0f : 8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f));
    }

    public void updateColors() {
        this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        TextView textView = this.messageView;
        int i = Theme.key_windowBackgroundWhiteGrayText;
        textView.setTextColor(Theme.getColor(i));
        this.chevronView.setColorFilter(Theme.getColor(i), PorterDuff.Mode.SRC_IN);
        this.closeView.setColorFilter(Theme.getColor(i), PorterDuff.Mode.SRC_IN);
        this.closeView.setBackground(Theme.AdaptiveRipple.filledCircle());
        setBackground(Theme.AdaptiveRipple.filledRect());
    }

    public void setAvatars(int i, ArrayList<TLRPC$User> arrayList) {
        int min = Math.min(3, arrayList == null ? 0 : arrayList.size());
        AvatarsImageView avatarsImageView = this.avatarsImageView;
        boolean z = min != avatarsImageView.avatarsDrawable.count;
        if (min <= 1) {
            avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
            this.avatarsImageView.setSize(AndroidUtilities.dp(32.0f));
        } else {
            avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            this.avatarsImageView.setSize(AndroidUtilities.dp(27.0f));
        }
        this.avatarsImageView.setCount(min);
        this.avatarsImageView.setVisibility(min <= 0 ? 8 : 0);
        this.avatarsImageView.getLayoutParams().width = min <= 1 ? AndroidUtilities.dp(32.0f) : AndroidUtilities.dp(((min - 1) * 16) + 27);
        if (z) {
            this.parentView.requestLayout();
        }
        if (arrayList != null) {
            int i2 = 0;
            while (i2 < 3) {
                this.avatarsImageView.setObject(i2, i, i2 >= arrayList.size() ? null : arrayList.get(i2));
                i2++;
            }
        }
        this.avatarsImageView.commitTransition(false);
    }

    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        this.titleView.setText(charSequence);
        this.titleView.setCompoundDrawables(null, null, null, null);
        this.messageView.setText(charSequence2);
        this.chevronView.setVisibility(0);
        this.closeView.setVisibility(8);
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
                DialogsHintCell.this.lambda$setOnClickListener$1(onClickListener, view);
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
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(0.0f, getHeight() - 1, getWidth(), getHeight() - 1, Theme.dividerPaint);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size <= 0) {
            size = AndroidUtilities.displaySize.x;
        }
        this.contentView.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        int measuredHeight = this.contentView.getMeasuredHeight() + getPaddingTop() + getPaddingBottom() + 1;
        this.height = measuredHeight;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public int height() {
        if (getVisibility() != 0) {
            return 0;
        }
        if (this.height <= 0) {
            this.height = AndroidUtilities.dp(72.0f) + 1;
        }
        return this.height;
    }
}
