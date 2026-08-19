package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class UnconfirmedAuthHintCell extends FrameLayout {
    private final LinearLayout buttonsLayout;
    private int height;
    private final LinearLayout linearLayout;
    private final TextView messageTextView;
    private final TextViewWithLoading noButton;
    private final TextView titleTextView;
    private final TextViewWithLoading yesButton;

    public static void m1517$r8$lambda$BxLL04nNHETLUQ16lksruDUVQc(ArrayList arrayList) {
    }

    public UnconfirmedAuthHintCell(Context context) {
        super(context);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.titleTextView = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.UnconfirmedAuthTitle));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(context);
        this.messageTextView = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(AndroidUtilities.dpf2(2.0f), 1.0f);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.buttonsLayout = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(context), LayoutHelper.createLinear(-2, 1, 17.0f, 1));
        TextViewWithLoading textViewWithLoading = new TextViewWithLoading(context);
        this.yesButton = textViewWithLoading;
        textViewWithLoading.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        textViewWithLoading.setTypeface(AndroidUtilities.bold());
        textViewWithLoading.setTextSize(1, 14.22f);
        textViewWithLoading.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
        linearLayout2.addView(textViewWithLoading, LayoutHelper.createLinear(-2, 30));
        linearLayout2.addView(new Space(context), LayoutHelper.createLinear(-2, 1, 17.0f, 1));
        TextViewWithLoading textViewWithLoading2 = new TextViewWithLoading(context);
        this.noButton = textViewWithLoading2;
        textViewWithLoading2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        textViewWithLoading2.setTypeface(AndroidUtilities.bold());
        textViewWithLoading2.setTextSize(1, 14.22f);
        textViewWithLoading2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
        linearLayout2.addView(textViewWithLoading2, LayoutHelper.createLinear(-2, 30));
        linearLayout2.addView(new Space(context), LayoutHelper.createLinear(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 28.0f, 4.0f, 28.0f, 8.0f));
        addView(linearLayout, LayoutHelper.createFrame(-1, -1, 119));
        updateColors();
    }

    public void set(final BaseFragment baseFragment, final int i) {
        final ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList = MessagesController.getInstance(i).getUnconfirmedAuthController().auths;
        this.yesButton.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
        final boolean z = false;
        this.yesButton.setLoading(false, false);
        this.noButton.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
        this.noButton.setLoading(false, false);
        if (arrayList != null && arrayList.size() == 1) {
            UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth = arrayList.get(0);
            this.titleTextView.setText(LocaleController.getString(unconfirmedAuth.bot ? R.string.UnconfirmedAuthTitleBot : R.string.UnconfirmedAuthTitle));
            String str = "" + unconfirmedAuth.device;
            if (!TextUtils.isEmpty(unconfirmedAuth.location) && !str.isEmpty()) {
                str = str + ", ";
            }
            String str2 = str + unconfirmedAuth.location;
            if (unconfirmedAuth.bot) {
                this.messageTextView.setText(LocaleController.formatString(R.string.UnconfirmedAuthSingleBot, "@" + DialogObject.getShortName(unconfirmedAuth.bot_id), str2));
                z = true;
            } else {
                this.messageTextView.setText(LocaleController.formatString(R.string.UnconfirmedAuthSingle, str2));
            }
        } else if (arrayList != null && arrayList.size() > 1) {
            this.titleTextView.setText(LocaleController.getString(R.string.UnconfirmedAuthTitle));
            String str3 = arrayList.get(0).location;
            for (int i2 = 1; i2 < arrayList.size(); i2++) {
                if (!TextUtils.equals(str3, arrayList.get(i2).location)) {
                    str3 = null;
                    break;
                }
            }
            if (str3 == null) {
                this.messageTextView.setText(LocaleController.formatPluralString("UnconfirmedAuthMultiple", arrayList.size(), new Object[0]));
            } else {
                this.messageTextView.setText(LocaleController.formatPluralString("UnconfirmedAuthMultipleFrom", arrayList.size(), str3));
            }
        }
        this.yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                UnconfirmedAuthHintCell.$r8$lambda$ZEICsbdb9MQnlCJ70APeGLR_RYQ(baseFragment, z, i, arrayList, view);
            }
        });
        this.noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                UnconfirmedAuthHintCell.$r8$lambda$Wbi6klv8qNLjst2cn7KK7XY8ba8(this.f$0, i, arrayList, view);
            }
        });
    }

    public static void $r8$lambda$ZEICsbdb9MQnlCJ70APeGLR_RYQ(final BaseFragment baseFragment, boolean z, int i, ArrayList arrayList, View view) {
        String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
        int i2 = Theme.key_undo_cancelColor;
        SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(string, i2, 0, new Runnable() {
            @Override
            public final void run() {
                UnconfirmedAuthHintCell.$r8$lambda$aR9eE_PuztcHAvmgfUDXWLIRfig(baseFragment);
            }
        });
        SpannableString spannableString = new SpannableString(">");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.attach_arrow_right);
        coloredImageSpan.setOverrideColor(Theme.getColor(i2));
        coloredImageSpan.setScale(0.7f, 0.7f);
        coloredImageSpan.setWidth(AndroidUtilities.dp(12.0f));
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
        AndroidUtilities.replaceCharSequence(">", spannableStringBuilderReplaceSingleTag, spannableString);
        BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(z ? R.string.UnconfirmedAuthConfirmedBot : R.string.UnconfirmedAuthConfirmed), spannableStringBuilderReplaceSingleTag).show();
        MessagesController.getInstance(i).getUnconfirmedAuthController().confirm(arrayList, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                UnconfirmedAuthHintCell.m1517$r8$lambda$BxLL04nNHETLUQ16lksruDUVQc((ArrayList) obj);
            }
        });
        MessagesController.getInstance(i).getUnconfirmedAuthController().cleanup();
    }

    public static void $r8$lambda$aR9eE_PuztcHAvmgfUDXWLIRfig(BaseFragment baseFragment) {
        Bulletin.hideVisible();
        baseFragment.presentFragment(new SessionsActivity(0));
    }

    public static void $r8$lambda$Wbi6klv8qNLjst2cn7KK7XY8ba8(final UnconfirmedAuthHintCell unconfirmedAuthHintCell, final int i, ArrayList arrayList, View view) {
        unconfirmedAuthHintCell.noButton.setLoading(true);
        MessagesController.getInstance(i).getUnconfirmedAuthController().deny(arrayList, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                UnconfirmedAuthHintCell.m1516$r8$lambda$1BUkAiR1j7HMXFvSH7w9Sv39rc(this.f$0, i, (ArrayList) obj);
            }
        });
    }

    public static void m1516$r8$lambda$1BUkAiR1j7HMXFvSH7w9Sv39rc(UnconfirmedAuthHintCell unconfirmedAuthHintCell, int i, ArrayList arrayList) {
        unconfirmedAuthHintCell.getClass();
        if (LaunchActivity.isActive) {
            unconfirmedAuthHintCell.showLoginPreventedSheet(arrayList);
        }
        unconfirmedAuthHintCell.noButton.setLoading(false);
        MessagesController.getInstance(i).getUnconfirmedAuthController().cleanup();
    }

    public void updateColors() {
        this.titleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        this.messageTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
        TextViewWithLoading textViewWithLoading = this.yesButton;
        int i = Theme.key_windowBackgroundWhiteValueText;
        textViewWithLoading.setTextColor(Theme.getColor(i));
        this.yesButton.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(Theme.getColor(i), Theme.isCurrentThemeDark() ? 0.3f : 0.15f), 7, AndroidUtilities.dp(8.0f)));
        TextViewWithLoading textViewWithLoading2 = this.noButton;
        int i2 = Theme.key_text_RedBold;
        textViewWithLoading2.setTextColor(Theme.getColor(i2));
        this.noButton.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(Theme.getColor(i2), Theme.isCurrentThemeDark() ? 0.3f : 0.15f), 7, AndroidUtilities.dp(8.0f)));
    }

    static class TextViewWithLoading extends TextView {
        private boolean loading;
        private final AnimatedFloat loadingT;
        private CircularProgressDrawable progressDrawable;

        public TextViewWithLoading(Context context) {
            super(context);
            this.loadingT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        public void setLoading(boolean z) {
            setLoading(z, true);
        }

        public void setLoading(boolean z, boolean z2) {
            this.loading = z;
            boolean z3 = true;
            if (!z2) {
                this.loadingT.set(z, true);
            }
            if (!isPressed() && !z) {
                z3 = false;
            }
            super.setPressed(z3);
            invalidate();
        }

        @Override
        public void setPressed(boolean z) {
            super.setPressed(z || this.loading);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Canvas canvas2;
            float f = this.loadingT.set(this.loading);
            if (f > 0.0f) {
                if (f < 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f) * 255.0f), 31);
                    float f2 = 1.0f - (0.2f * f);
                    canvas2.scale(f2, f2, getWidth() / 2.0f, getHeight() / 2.0f);
                    canvas2.translate(0.0f, AndroidUtilities.dp(-12.0f) * f);
                    super.onDraw(canvas2);
                    canvas2.restore();
                } else {
                    canvas2 = canvas;
                }
                if (this.progressDrawable == null) {
                    CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(2.0f), getCurrentTextColor());
                    this.progressDrawable = circularProgressDrawable;
                    circularProgressDrawable.setCallback(this);
                }
                this.progressDrawable.setColor(getCurrentTextColor());
                float f3 = 1.0f - f;
                this.progressDrawable.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (AndroidUtilities.dp(12.0f) * f3)), getWidth() / 2, (getHeight() / 2) + ((int) (f3 * AndroidUtilities.dp(12.0f))));
                this.progressDrawable.setAlpha((int) (f * 255.0f));
                this.progressDrawable.draw(canvas2);
                invalidate();
                return;
            }
            super.onDraw(canvas);
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return this.progressDrawable == drawable || super.verifyDrawable(drawable);
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size <= 0) {
            size = AndroidUtilities.displaySize.x;
        }
        this.linearLayout.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        int measuredHeight = this.linearLayout.getMeasuredHeight() + getPaddingTop() + getPaddingBottom() + 1;
        this.height = measuredHeight;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void showLoginPreventedSheet(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            BulletinFactory.of(Bulletin.BulletinWindow.make(getContext()), null).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RLottieImageView rLottieImageView = new RLottieImageView(getContext());
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        rLottieImageView.setAnimation(R.raw.ic_ban, 50, 50);
        rLottieImageView.playAnimation();
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_windowBackgroundWhiteValueText)));
        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(80, 80, 17, 0, 14, 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 28.0f, 14.0f, 28.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        if (arrayList.size() == 1) {
            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, from((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
        } else {
            String str = "\n";
            for (int i = 0; i < Math.min(arrayList.size(), 10); i++) {
                str = str + "• " + from((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i)) + "\n";
            }
            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
        }
        textView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 40.0f, 9.0f, 40.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
        int iDp = AndroidUtilities.dp(12.0f);
        int i2 = Theme.key_text_RedBold;
        frameLayout.setBackground(Theme.createRoundRectDrawable(iDp, Theme.multAlpha(Theme.getColor(i2), Theme.isCurrentThemeDark() ? 0.2f : 0.15f)));
        TextView textView3 = new TextView(getContext());
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        textView3.setTextColor(Theme.getColor(i2));
        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
        frameLayout.addView(textView3, LayoutHelper.createFrame(-1, -1, 119));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 14.0f, 19.0f, 14.0f, 0.0f));
        final ButtonWithCounterView round = new ButtonWithCounterView(getContext(), null).setRound();
        ScaleStateListAnimator.apply(round, 0.02f, 1.5f);
        round.setText(LocaleController.getString(R.string.GotIt), false);
        linearLayout.addView(round, LayoutHelper.createLinear(-1, 48, 14.0f, 20.0f, 14.0f, 4.0f));
        final BottomSheet bottomSheetShow = new BottomSheet.Builder(getContext()).setCustomView(linearLayout).show();
        bottomSheetShow.setCanDismissWithSwipe(false);
        bottomSheetShow.setCanDismissWithTouchOutside(false);
        round.setTimer(5, new Runnable() {
            @Override
            public final void run() {
                UnconfirmedAuthHintCell.m1519$r8$lambda$sjRWXBHKvFpazvxwtiyIFnxmFs(bottomSheetShow);
            }
        });
        round.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                UnconfirmedAuthHintCell.m1518$r8$lambda$FmPsg7Mq8dur9rHWnNTbvXVYpo(round, bottomSheetShow, view);
            }
        });
    }

    public static void m1519$r8$lambda$sjRWXBHKvFpazvxwtiyIFnxmFs(BottomSheet bottomSheet) {
        bottomSheet.setCanDismissWithSwipe(true);
        bottomSheet.setCanDismissWithTouchOutside(true);
    }

    public static void m1518$r8$lambda$FmPsg7Mq8dur9rHWnNTbvXVYpo(ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, View view) {
        if (buttonWithCounterView.isTimerActive()) {
            AndroidUtilities.shakeViewSpring(buttonWithCounterView, 3.0f);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        } else {
            bottomSheet.dismiss();
        }
    }

    private static String from(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth) {
        if (unconfirmedAuth == null) {
            return "";
        }
        String str = "" + unconfirmedAuth.device;
        if (!TextUtils.isEmpty(unconfirmedAuth.location) && !str.isEmpty()) {
            str = str + ", ";
        }
        return str + unconfirmedAuth.location;
    }
}
