package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RenderNode;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ProfileActivity;

public class ProfileSuggestionView extends FrameLayout {
    private int activeCount;
    private ProfileActivity.AvatarImageView avatarView;
    private final Path clipAvatarPath;
    public float clipHeight;
    private final Path clipPath;
    public final ImageView closeView;
    private float currentHeight;
    private boolean ignoreRect;
    public boolean isOpeningLayout;
    private final FrameLayout layout;
    private RenderNode renderNode;
    private float renderNodeScale;
    private float renderNodeTranslateY;
    private final Theme.ResourcesProvider resourcesProvider;
    private final TextView subtitleView;
    private final LinearLayout textLayout;
    private final TextView titleView;

    public ProfileSuggestionView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.clipHeight = -1.0f;
        this.clipAvatarPath = new Path();
        this.clipPath = new Path();
        this.isOpeningLayout = true;
        this.activeCount = 0;
        this.ignoreRect = false;
        this.currentHeight = 0.0f;
        this.resourcesProvider = resourcesProvider;
        FrameLayout frameLayout = new FrameLayout(context);
        this.layout = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f));
        frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), Theme.multAlpha(0.175f, -16777216)));
        addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f, 119, 12.0f, 13.0f, 12.0f, 13.0f));
        ScaleStateListAnimator.apply(frameLayout, 0.025f, 1.2f);
        LinearLayout linearLayout = new LinearLayout(context);
        this.textLayout = linearLayout;
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 26.0f, 0.0f));
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(Emoji.replaceEmoji(LocaleController.getString(R.string.PasskeyPopupTitle), textView.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 3.0f), context);
        this.subtitleView = textViewM;
        textViewM.setTextSize(1, 13.0f);
        textViewM.setTextColor(Theme.multAlpha(0.75f, -1));
        textViewM.setSingleLine();
        textViewM.setLines(1);
        textViewM.setEllipsize(TextUtils.TruncateAt.END);
        textViewM.setText(LocaleController.getString(R.string.PasskeyPopupText));
        NotificationCenter.listenEmojiLoading(textViewM);
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.closeView = imageView;
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(0.85f, -1), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 21));
        ScaleStateListAnimator.apply(imageView);
        setWillNotDraw(false);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.clipHeight >= 0.0f || this.currentHeight < getHeight()) {
            float f = this.currentHeight;
            float f2 = this.clipHeight;
            float fMin = Math.min(f, f2 >= 0.0f ? f2 - getY() : getHeight());
            if (fMin <= 0.0f) {
                return;
            } else {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), fMin);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.clipHeight >= 0.0f || this.currentHeight < getHeight()) {
            float f = this.currentHeight;
            float f2 = this.clipHeight;
            if (motionEvent.getY() > Math.min(f, f2 >= 0.0f ? f2 - getY() : getHeight())) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void drawingBlur(RenderNode renderNode, ProfileActivity.AvatarImageView avatarImageView, float f, float f2) {
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(88.0f), 1073741824));
    }

    public void updatePosition(float f, float f2) {
        this.currentHeight = f2;
        float fClamp01 = Utilities.clamp01(AndroidUtilities.ilerp(f2, 0.0f, getHeight()));
        this.layout.setAlpha(fClamp01);
        this.layout.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, fClamp01));
        this.layout.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, fClamp01));
        setTranslationY(f);
        invalidate();
    }

    public void drawingBlur(boolean z) {
    }
}
