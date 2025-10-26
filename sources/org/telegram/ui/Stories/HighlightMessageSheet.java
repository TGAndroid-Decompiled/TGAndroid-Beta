package org.telegram.ui.Stories;

import android.content.Context;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public abstract class HighlightMessageSheet {
    public static int TIER_COLOR1 = 3;
    public static int TIER_COLOR2 = 4;
    public static int TIER_COLOR_BACKGROUND = 5;
    public static int TIER_EMOJIS = 2;
    public static int TIER_LENGTH = 1;
    public static int TIER_PERIOD;
    public static int[] tiers = {10000, 3600, 400, 20, -10787210, -8681059, -14341066, 2000, 1800, 280, 10, -2013375, -1482439, -7666429, 500, 900, 200, 7, -1214690, -1214690, -6606592, 250, 600, 150, 4, -1926647, -1926647, -6668800, 100, 300, 110, 3, -12539616, -12539616, -15244800, 50, 120, 80, 2, -12147733, -12147733, -16756594, 10, 60, 60, 1, -6988581, -6988581, -11991141, 0, 30, 30, 0, -6988581, -6988581, -11991141};

    public static final int getTierOption(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = tiers;
            if (i3 >= iArr.length / 7) {
                return 0;
            }
            int i4 = i3 * 7;
            if (i >= iArr[i4]) {
                return iArr[i4 + 1 + i2];
            }
            i3++;
        }
    }

    public static void open(Context context, int i, String str, TLRPC.TL_textWithEntities tL_textWithEntities, long j, long j2, final Utilities.Callback callback, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        BottomSheet.Builder builder;
        long j3;
        BottomSheet.Builder builder2 = new BottomSheet.Builder(context, false);
        builder2.setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        builder2.setCustomView(linearLayout);
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            i2 = ((AnimatedEmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), AnimatedEmojiSpan.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
        } else {
            i2 = 0;
        }
        if (j2 <= 0) {
            builder = builder2;
            j3 = 100;
        } else {
            builder = builder2;
            j3 = j2;
        }
        int max = (int) Math.max(j, j3);
        int length = (tiers.length / 7) - 1;
        while (true) {
            if (length < 0) {
                break;
            }
            int[] iArr = tiers;
            int i3 = length * 7;
            int i4 = iArr[i3];
            int i5 = i3 + 1;
            int i6 = iArr[i5 + TIER_LENGTH];
            if (i2 <= iArr[i5 + TIER_EMOJIS] && formatTextWithEntities.length() <= i6) {
                max = Math.max(max, i4);
                break;
            }
            length--;
        }
        final long[] jArr = {max};
        final ColoredImageSpan[] coloredImageSpanArr = new ColoredImageSpan[1];
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null);
        final LiveCommentsView.Message message = new LiveCommentsView.Message();
        message.dialogId = UserConfig.getInstance(i).getClientUserId();
        message.text = tL_textWithEntities;
        message.stars = jArr[0];
        final LiveCommentsView.LiveCommentView liveCommentView = new LiveCommentsView.LiveCommentView(context, true);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        final TierValueView tierValueView = new TierValueView(context, "pin in chat", resourcesProvider);
        linearLayout2.addView(tierValueView, LayoutHelper.createLinear(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final TierValueView tierValueView2 = new TierValueView(context, "characters", resourcesProvider);
        linearLayout2.addView(tierValueView2, LayoutHelper.createLinear(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final TierValueView tierValueView3 = new TierValueView(context, "emoji", resourcesProvider);
        linearLayout2.addView(tierValueView3, LayoutHelper.createLinear(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final StarsReactionsSheet.StarsSlider starsSlider = new StarsReactionsSheet.StarsSlider(context) {
            @Override
            public void onValueChanged(int i7) {
                r2[0].run(Integer.valueOf(i7));
            }
        };
        final boolean[] zArr = {true};
        final Utilities.Callback[] callbackArr = {new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                HighlightMessageSheet.lambda$open$0(jArr, buttonWithCounterView, coloredImageSpanArr, message, liveCommentView, tierValueView, tierValueView2, tierValueView3, starsSlider, zArr, (Integer) obj);
            }
        }};
        liveCommentView.set(0L, message);
        int i7 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long j4 = tiers[0];
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            int[] iArr3 = iArr2;
            if (iArr2[i8] >= j) {
                if (i8 > 0 && arrayList.isEmpty() && iArr3[i8] >= j) {
                    arrayList.add(Integer.valueOf((int) j));
                }
                int i9 = iArr3[i8];
                if (i9 > j4) {
                    arrayList.add(Integer.valueOf((int) j4));
                    break;
                } else {
                    arrayList.add(Integer.valueOf(i9));
                    if (iArr3[i8] == j4) {
                        break;
                    }
                }
            }
            i8++;
            iArr2 = iArr3;
            i7 = 9;
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            iArr4[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        starsSlider.setSteps(100, iArr4);
        starsSlider.setValue((int) jArr[0]);
        linearLayout.addView(starsSlider, LayoutHelper.createLinear(-1, -2, 0.0f, -52.0f, 0.0f, -42.0f));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, 56, 16.0f, 0.0f, 16.0f, 0.0f));
        int i11 = Theme.key_dialogTextBlack;
        TextView makeTextView = TextHelper.makeTextView(context, 20.0f, i11, true, resourcesProvider);
        makeTextView.setGravity(17);
        makeTextView.setText("Highlight and Pin");
        linearLayout.addView(makeTextView, LayoutHelper.createLinear(-1, -2, 42.0f, 18.0f, 42.0f, 9.0f));
        TextView makeTextView2 = TextHelper.makeTextView(context, 14.0f, i11, false, resourcesProvider);
        makeTextView2.setGravity(17);
        makeTextView2.setText("Highlight and pin your message by adding Stars for " + str);
        linearLayout.addView(makeTextView2, LayoutHelper.createLinear(-1, -2, 42.0f, 0.0f, 42.0f, 0.0f));
        linearLayout.addView(liveCommentView, LayoutHelper.createLinear(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 16.0f, 0.0f, 16.0f, 12.0f));
        final BottomSheet show = builder.show();
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                HighlightMessageSheet.lambda$open$1(Utilities.Callback.this, jArr, show, view);
            }
        });
    }

    public static void lambda$open$0(long[] jArr, ButtonWithCounterView buttonWithCounterView, ColoredImageSpan[] coloredImageSpanArr, LiveCommentsView.Message message, LiveCommentsView.LiveCommentView liveCommentView, TierValueView tierValueView, TierValueView tierValueView2, TierValueView tierValueView3, StarsReactionsSheet.StarsSlider starsSlider, boolean[] zArr, Integer num) {
        String str;
        long intValue = num.intValue();
        jArr[0] = intValue;
        buttonWithCounterView.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), coloredImageSpanArr), true);
        message.stars = jArr[0];
        liveCommentView.set(0L, message);
        int tierOption = getTierOption(num.intValue(), TIER_PERIOD);
        int tierOption2 = getTierOption(num.intValue(), TIER_LENGTH);
        int tierOption3 = getTierOption(num.intValue(), TIER_EMOJIS);
        if (tierOption >= 60) {
            str = (tierOption / 60) + "m";
        } else {
            str = tierOption + "s";
        }
        tierValueView.set(str);
        tierValueView2.set(LocaleController.formatNumber(tierOption2, ','));
        tierValueView3.set(LocaleController.formatNumber(tierOption3, ','));
        starsSlider.setColor(getTierOption(num.intValue(), TIER_COLOR1), getTierOption(num.intValue(), TIER_COLOR2), true ^ zArr[0]);
        zArr[0] = false;
    }

    public static void lambda$open$1(Utilities.Callback callback, long[] jArr, BottomSheet bottomSheet, View view) {
        callback.run(Long.valueOf(jArr[0]));
        bottomSheet.lambda$new$0();
    }

    public static class TierValueView extends FrameLayout {
        private final TextView subtitleTextView;
        private final AnimatedTextView titleTextView;

        public TierValueView(Context context, CharSequence charSequence, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            int dp = AndroidUtilities.dp(12.0f);
            int i = Theme.key_dialogTextBlack;
            setBackground(Theme.createRoundRectDrawable(dp, Theme.multAlpha(Theme.getColor(i, resourcesProvider), 0.06f)));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
            this.titleTextView = animatedTextView;
            animatedTextView.setAnimationProperties(0.3f, 0L, 200L, CubicBezierInterpolator.EASE_OUT_QUINT);
            animatedTextView.setTextSize(AndroidUtilities.dp(17.0f));
            animatedTextView.setTextColor(Theme.getColor(i, resourcesProvider));
            animatedTextView.setScaleProperty(0.4f);
            animatedTextView.setGravity(17);
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setAllowCancel(true);
            linearLayout.addView(animatedTextView, LayoutHelper.createLinear(-1, 20, 0.0f, 0.0f, 0.0f, 1.66f));
            TextView textView = new TextView(context);
            this.subtitleTextView = textView;
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            textView.setGravity(17);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
            textView.setText(charSequence);
        }

        public void set(CharSequence charSequence) {
            this.titleTextView.setText(charSequence, true);
        }
    }
}
