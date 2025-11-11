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
import java.util.Iterator;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
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

    public static int[] parseTiers(TLRPC.TL_jsonArray tL_jsonArray) {
        char c;
        int i;
        char c2;
        int i2;
        int[] iArr = new int[tL_jsonArray.value.size() * 7];
        for (int i3 = 0; i3 < tL_jsonArray.value.size(); i3++) {
            TLRPC.JSONValue jSONValue = tL_jsonArray.value.get(i3);
            if (jSONValue instanceof TLRPC.TL_jsonObject) {
                Iterator<TLRPC.TL_jsonObjectValue> it = ((TLRPC.TL_jsonObject) jSONValue).value.iterator();
                while (it.hasNext()) {
                    TLRPC.TL_jsonObjectValue next = it.next();
                    TLRPC.JSONValue jSONValue2 = next.value;
                    if (jSONValue2 instanceof TLRPC.TL_jsonNumber) {
                        int i4 = (int) ((TLRPC.TL_jsonNumber) jSONValue2).value;
                        String str = next.key;
                        str.hashCode();
                        switch (str.hashCode()) {
                            case -1544802595:
                                if (str.equals("text_length_max")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -1186480213:
                                if (str.equals("pin_period")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 109757537:
                                if (str.equals("stars")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 1686749675:
                                if (str.equals("emoji_max")) {
                                    c = 3;
                                    break;
                                }
                                break;
                        }
                        c = 65535;
                        switch (c) {
                            case 0:
                                i = 2;
                                break;
                            case 1:
                                i = 1;
                                break;
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 3;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                        if (i >= 0) {
                            iArr[(i3 * 7) + i] = i4;
                        }
                    } else if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                        String str2 = ((TLRPC.TL_jsonString) jSONValue2).value;
                        String str3 = next.key;
                        str3.hashCode();
                        switch (str3.hashCode()) {
                            case -1354842834:
                                if (str3.equals("color1")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case -1354842833:
                                if (str3.equals("color2")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case -628825439:
                                if (str3.equals("color_bg")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                        }
                        c2 = 65535;
                        switch (c2) {
                            case 0:
                                i2 = 4;
                                break;
                            case 1:
                                i2 = 5;
                                break;
                            case 2:
                                i2 = 6;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                        if (i2 >= 0) {
                            try {
                                iArr[(i3 * 7) + i2] = (int) Long.parseLong("FF" + str2, 16);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                    }
                }
            }
        }
        return iArr;
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
            return DesugarArrays.stream(str.split(",")).mapToInt(new ToIntFunction() {
                @Override
                public final int applyAsInt(Object obj) {
                    return Integer.parseInt((String) obj);
                }
            }).toArray();
        } catch (Exception e) {
            FileLog.e(e);
            return getDefaultTiers();
        }
    }

    public static String tiersToString(int[] iArr) {
        return (String) DesugarArrays.stream(iArr).mapToObj(new IntFunction() {
            @Override
            public final Object apply(int i) {
                return String.valueOf(i);
            }
        }).collect(Collectors.joining(","));
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
        int i2;
        LiveCommentsView.LiveCommentView liveCommentView;
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        builder.setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        builder.setCustomView(linearLayout);
        int[] iArr = MessagesController.getInstance(i).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            i2 = ((AnimatedEmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), AnimatedEmojiSpan.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
        } else {
            i2 = 0;
        }
        int max = (int) Math.max(j2, j3 <= 0 ? 100L : j3);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length < 0) {
                break;
            }
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
            public void onValueChanged(int i7) {
                r3[0].run(Integer.valueOf(i7));
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
        int i7 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i8 = MessagesController.getInstance(i).starsGroupcallMessageAmountMax;
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (true) {
            if (i9 >= i7) {
                liveCommentView = liveCommentView2;
                break;
            }
            liveCommentView = liveCommentView2;
            if (iArr2[i9] >= j2) {
                if (i9 > 0 && arrayList.isEmpty() && iArr2[i9] > j2) {
                    arrayList.add(Integer.valueOf((int) j2));
                }
                int i10 = iArr2[i9];
                if (i10 > i8) {
                    arrayList.add(Integer.valueOf(i8));
                    break;
                } else {
                    arrayList.add(Integer.valueOf(i10));
                    if (iArr2[i9] == i8) {
                        break;
                    }
                }
            }
            i9++;
            liveCommentView2 = liveCommentView;
            i7 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) arrayList.get(arrayList.size() - 1)).intValue() < i8) {
            arrayList.add(Integer.valueOf(i8));
        }
        int[] iArr3 = new int[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            iArr3[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        starsSlider.setSteps(100, iArr3);
        starsSlider.setValue((int) jArr[0]);
        linearLayout.addView(starsSlider, LayoutHelper.createLinear(-1, -2, 0.0f, -52.0f, 0.0f, -42.0f));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, 56, 16.0f, 0.0f, 16.0f, 0.0f));
        int i12 = Theme.key_dialogTextBlack;
        TextView makeTextView = TextHelper.makeTextView(context, 20.0f, i12, true, resourcesProvider);
        makeTextView.setGravity(17);
        makeTextView.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(makeTextView, LayoutHelper.createLinear(-1, -2, 42.0f, 18.0f, 42.0f, 9.0f));
        TextView makeTextView2 = TextHelper.makeTextView(context, 14.0f, i12, false, resourcesProvider);
        makeTextView2.setGravity(17);
        makeTextView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LiveStoryHighlightText, str)));
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

    public static void lambda$open$0(long[] jArr, ButtonWithCounterView buttonWithCounterView, ColoredImageSpan[] coloredImageSpanArr, LiveCommentsView.Message message, LiveCommentsView.LiveCommentView liveCommentView, int i, TierValueView tierValueView, TierValueView tierValueView2, TierValueView tierValueView3, StarsReactionsSheet.StarsSlider starsSlider, boolean[] zArr, Integer num) {
        String str;
        long intValue = num.intValue();
        jArr[0] = intValue;
        buttonWithCounterView.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), coloredImageSpanArr), true);
        message.stars = jArr[0];
        liveCommentView.set(message);
        int tierOption = getTierOption(i, num.intValue(), TIER_PERIOD);
        int tierOption2 = getTierOption(i, num.intValue(), TIER_LENGTH);
        int tierOption3 = getTierOption(i, num.intValue(), TIER_EMOJIS);
        if (tierOption >= 60) {
            str = (tierOption / 60) + "m";
        } else {
            str = tierOption + "s";
        }
        tierValueView.set(str);
        tierValueView2.set(LocaleController.formatNumber(tierOption2, ','));
        tierValueView3.set(LocaleController.formatNumber(tierOption3, ','));
        starsSlider.setColor(getTierOption(i, num.intValue(), TIER_COLOR1), getTierOption(i, num.intValue(), TIER_COLOR2), !zArr[0]);
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
