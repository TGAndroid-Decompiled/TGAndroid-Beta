package org.telegram.ui.Stories;

import android.content.Context;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticLambda331;
import org.telegram.messenger.MessagesController$$ExternalSyntheticLambda63;
import org.telegram.messenger.R;
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

    public static int[] getDefaultTiers() {
        return new int[]{10000, 3600, 400, 20, -10787210, -8681059, -14341066, 2000, 1800, 280, 10, -2013375, -1482439, -7666429, 500, 900, 200, 7, -1214690, -1214690, -6606592, 250, 600, 150, 4, -1926647, -1926647, -6668800, 100, 300, 110, 3, -12539616, -12539616, -15244800, 50, 120, 80, 2, -12147733, -12147733, -16756594, 10, 60, 60, 1, -6988581, -6988581, -11991141, 0, 30, 30, 0, -6988581, -6988581, -11991141};
    }

    public static int[] parseTiers(org.telegram.tgnet.TLRPC.TL_jsonArray r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.HighlightMessageSheet.parseTiers(org.telegram.tgnet.TLRPC$TL_jsonArray):int[]");
    }

    public static boolean tiersEqual(int[] iArr, int[] iArr2) {
        if (iArr == null && iArr2 == null) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] parseTiersString(String str) {
        if (str == null || str.length() == 0) {
            return getDefaultTiers();
        }
        try {
            return DesugarArrays.stream(str.split(",")).mapToInt(new MessagesController$$ExternalSyntheticLambda331()).toArray();
        } catch (Exception e) {
            FileLog.e(e);
            return getDefaultTiers();
        }
    }

    public static String tiersToString(int[] iArr) {
        return (String) DesugarArrays.stream(iArr).mapToObj(new MessagesController$$ExternalSyntheticLambda63()).collect(Collectors.joining(","));
    }

    public static int getTierOption(int i, int i2, int i3) {
        int[] iArr = MessagesController.getInstance(i).starsGroupcallMessageLimits;
        for (int i4 = 0; i4 < iArr.length / 7; i4++) {
            int i5 = i4 * 7;
            if (i2 >= iArr[i5]) {
                return iArr[i5 + 1 + i3];
            }
        }
        return 0;
    }

    public static int getMaxLength(int i) {
        int[] iArr = MessagesController.getInstance(i).starsGroupcallMessageLimits;
        if (iArr == null) {
            return 400;
        }
        int length = iArr.length;
        int i2 = TIER_LENGTH + 1;
        if (length <= i2) {
            return 400;
        }
        return iArr[i2];
    }

    public static void open(Context context, final int i, long j, String str, TLRPC.TL_textWithEntities tL_textWithEntities, long j2, long j3, final Utilities.Callback callback, Theme.ResourcesProvider resourcesProvider) {
        int length;
        LiveCommentsView.LiveCommentView liveCommentView;
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        builder.setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        builder.setCustomView(linearLayout);
        int[] iArr = MessagesController.getInstance(i).starsGroupcallMessageLimits;
        CharSequence textWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false, new TextPaint());
        if (textWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) textWithEntities;
            length = ((AnimatedEmojiSpan[]) spannable.getSpans(0, textWithEntities.length(), AnimatedEmojiSpan.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, textWithEntities.length(), Emoji.EmojiSpan.class)).length;
        } else {
            length = 0;
        }
        int iMax = (int) Math.max(j2, j3 <= 0 ? 100L : j3);
        int length2 = (iArr.length / 7) - 1;
        while (true) {
            if (length2 < 0) {
                break;
            }
            int i2 = length2 * 7;
            int i3 = iArr[i2];
            int i4 = i2 + 1;
            int i5 = iArr[i4 + TIER_LENGTH];
            if (length <= iArr[i4 + TIER_EMOJIS] && textWithEntities.length() <= i5) {
                iMax = Math.max(iMax, i3);
                break;
            }
            length2--;
        }
        final long[] jArr = {iMax};
        final ColoredImageSpan[] coloredImageSpanArr = new ColoredImageSpan[1];
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null);
        final LiveCommentsView.Message message = new LiveCommentsView.Message();
        message.dialogId = j;
        message.text = tL_textWithEntities;
        message.stars = jArr[0];
        final LiveCommentsView.LiveCommentView liveCommentView2 = new LiveCommentsView.LiveCommentView(context, i, true);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        final TierValueView tierValueView = new TierValueView(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), resourcesProvider);
        linearLayout2.addView(tierValueView, LayoutHelper.createLinear(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final TierValueView tierValueView2 = new TierValueView(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), resourcesProvider);
        linearLayout2.addView(tierValueView2, LayoutHelper.createLinear(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final TierValueView tierValueView3 = new TierValueView(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), resourcesProvider);
        linearLayout2.addView(tierValueView3, LayoutHelper.createLinear(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final StarsReactionsSheet.StarsSlider starsSlider = new StarsReactionsSheet.StarsSlider(context, resourcesProvider) {
            @Override
            public void onValueChanged(int i6) {
                callbackArr[0].run(Integer.valueOf(i6));
            }
        };
        final boolean[] zArr = {true};
        final Utilities.Callback[] callbackArr = {new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                HighlightMessageSheet.lambda$open$0(jArr, buttonWithCounterView, coloredImageSpanArr, message, liveCommentView2, i, tierValueView, tierValueView2, tierValueView3, starsSlider, zArr, (Integer) obj);
            }
        }};
        liveCommentView2.set(message);
        int i6 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i7 = MessagesController.getInstance(i).starsGroupcallMessageAmountMax;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (true) {
            if (i8 >= i6) {
                liveCommentView = liveCommentView2;
                break;
            }
            liveCommentView = liveCommentView2;
            if (iArr2[i8] >= j2) {
                if (i8 > 0 && arrayList.isEmpty() && iArr2[i8] > j2) {
                    arrayList.add(Integer.valueOf((int) j2));
                }
                int i9 = iArr2[i8];
                if (i9 > i7) {
                    arrayList.add(Integer.valueOf(i7));
                    break;
                } else {
                    arrayList.add(Integer.valueOf(i9));
                    if (iArr2[i8] == i7) {
                        break;
                    }
                }
            }
            i8++;
            liveCommentView2 = liveCommentView;
            i6 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) arrayList.get(arrayList.size() - 1)).intValue() < i7) {
            arrayList.add(Integer.valueOf(i7));
        }
        int[] iArr3 = new int[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            iArr3[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        starsSlider.setSteps(100, iArr3);
        starsSlider.setValue((int) jArr[0]);
        linearLayout.addView(starsSlider, LayoutHelper.createLinear(-1, -2, 0.0f, -52.0f, 0.0f, -42.0f));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, 56, 16.0f, 0.0f, 16.0f, 0.0f));
        int i11 = Theme.key_dialogTextBlack;
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i11, true, resourcesProvider);
        textViewMakeTextView.setGravity(17);
        textViewMakeTextView.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 42.0f, 18.0f, 42.0f, 9.0f));
        TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i11, false, resourcesProvider);
        textViewMakeTextView2.setGravity(17);
        textViewMakeTextView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LiveStoryHighlightText, str)));
        linearLayout.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 42.0f, 0.0f, 42.0f, 0.0f));
        linearLayout.addView(liveCommentView, LayoutHelper.createLinear(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 16.0f, 0.0f, 16.0f, 12.0f));
        final BottomSheet bottomSheetShow = builder.show();
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                HighlightMessageSheet.lambda$open$1(callback, jArr, bottomSheetShow, view);
            }
        });
    }

    public static void lambda$open$0(long[] jArr, ButtonWithCounterView buttonWithCounterView, ColoredImageSpan[] coloredImageSpanArr, LiveCommentsView.Message message, LiveCommentsView.LiveCommentView liveCommentView, int i, TierValueView tierValueView, TierValueView tierValueView2, TierValueView tierValueView3, StarsReactionsSheet.StarsSlider starsSlider, boolean[] zArr, Integer num) {
        long jIntValue = num.intValue();
        jArr[0] = jIntValue;
        buttonWithCounterView.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(jIntValue, ',')), coloredImageSpanArr), true);
        message.stars = jArr[0];
        liveCommentView.set(message);
        int tierOption = getTierOption(i, num.intValue(), TIER_PERIOD);
        int tierOption2 = getTierOption(i, num.intValue(), TIER_LENGTH);
        int tierOption3 = getTierOption(i, num.intValue(), TIER_EMOJIS);
        tierValueView.set(tierOption >= 60 ? LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(tierOption / 60)) : LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(tierOption)));
        tierValueView2.set(LocaleController.formatNumber(tierOption2, ','));
        tierValueView3.set(LocaleController.formatNumber(tierOption3, ','));
        starsSlider.setColor(getTierOption(i, num.intValue(), TIER_COLOR1), getTierOption(i, num.intValue(), TIER_COLOR2), !zArr[0]);
        zArr[0] = false;
    }

    public static void lambda$open$1(Utilities.Callback callback, long[] jArr, BottomSheet bottomSheet, View view) {
        callback.run(Long.valueOf(jArr[0]));
        bottomSheet.lambda$new$0();
    }

    static class TierValueView extends FrameLayout {
        private final TextView subtitleTextView;
        private final AnimatedTextView titleTextView;

        public TierValueView(Context context, CharSequence charSequence, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            int iDp = AndroidUtilities.dp(12.0f);
            int i = Theme.key_dialogTextBlack;
            setBackground(Theme.createRoundRectDrawable(iDp, Theme.multAlpha(Theme.getColor(i, resourcesProvider), 0.06f)));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
            this.titleTextView = animatedTextView;
            animatedTextView.setAnimationProperties(0.6f, 0L, 450L, CubicBezierInterpolator.EASE_OUT_QUINT);
            animatedTextView.setTextSize(AndroidUtilities.dp(17.0f));
            animatedTextView.setTextColor(Theme.getColor(i, resourcesProvider));
            animatedTextView.setScaleProperty(0.7f);
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
