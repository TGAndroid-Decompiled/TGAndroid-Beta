package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.ClickableAnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.PhotoViewer;

public abstract class ProfileHoursCell extends LinearLayout {
    public final ImageView arrowView;
    public boolean expanded;
    public boolean firstAfterAttach;
    public final TextView[] labelText;
    public final TextView[] labelTimeText;
    public final ViewGroup[] lines;
    public boolean needDivider;
    public final Theme.ResourcesProvider resourcesProvider;
    public final ClickableAnimatedTextView switchText;
    public final TextView textView;
    public final TextView[][] timeText;
    public int todayLinesCount;
    public int todayLinesHeight;
    public final FrameLayout todayTimeContainer;
    public final FrameLayout todayTimeTextContainer;
    public final LinearLayout todayTimeTextContainer2;

    public ProfileHoursCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.labelTimeText = new TextView[2];
        this.lines = new ViewGroup[7];
        this.labelText = new TextView[7];
        this.timeText = new TextView[7][];
        this.todayLinesCount = 1;
        this.todayLinesHeight = 0;
        this.firstAfterAttach = true;
        this.resourcesProvider = resourcesProvider;
        setOrientation(1);
        setClipChildren(false);
        int i = 0;
        for (int i2 = 7; i < i2; i2 = 7) {
            if (i == 0) {
                ViewGroup anonymousClass19 = new PhotoViewer.AnonymousClass19(context, 6);
                anonymousClass19.setMinimumHeight(AndroidUtilities.dp(60.0f));
                TextView textView = new TextView(context);
                this.textView = textView;
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                textView.setTextSize(1, 16.0f);
                anonymousClass19.addView(textView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.labelText[i] = new TextView(context);
                this.labelText[i].setGravity(LocaleController.isRTL ? 5 : 3);
                this.labelText[i].setTextSize(1, 13.0f);
                this.labelText[i].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
                anonymousClass19.addView(this.labelText[i], LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.todayTimeTextContainer2 = linearLayout;
                linearLayout.setOrientation(1);
                this.todayTimeTextContainer = new FrameLayout(context);
                this.timeText[i] = new TextView[2];
                for (int i3 = 0; i3 < 2; i3++) {
                    this.timeText[i][i3] = new TextView(context);
                    this.timeText[i][i3].setTextSize(1, 14.0f);
                    this.timeText[i][i3].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
                    this.timeText[i][i3].setGravity(LocaleController.isRTL ? 3 : 5);
                    this.todayTimeTextContainer.addView(this.timeText[i][i3], LayoutHelper.createFrameRelatively(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i4 = 0; i4 < 2; i4++) {
                    this.labelTimeText[i4] = new TextView(context);
                    this.labelTimeText[i4].setTextSize(1, 14.0f);
                    this.labelTimeText[i4].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
                    this.labelTimeText[i4].setGravity(LocaleController.isRTL ? 3 : 5);
                    this.todayTimeTextContainer.addView(this.labelTimeText[i4], LayoutHelper.createFrameRelatively(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.arrowView = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(R.drawable.arrow_more);
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider), PorterDuff.Mode.SRC_IN));
                this.todayTimeTextContainer.addView(imageView, LayoutHelper.createFrameRelatively(20.0f, 20.0f, 8388629));
                this.todayTimeTextContainer2.addView(this.todayTimeTextContainer, new LinearLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(-1.0f), Gravity.getAbsoluteGravity(119, LocaleController.isRTL ? 1 : 0)));
                ClickableAnimatedTextView clickableAnimatedTextView = new ClickableAnimatedTextView(context);
                this.switchText = clickableAnimatedTextView;
                clickableAnimatedTextView.getDrawable().updateAll = true;
                clickableAnimatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
                clickableAnimatedTextView.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                clickableAnimatedTextView.setGravity(LocaleController.isRTL ? 3 : 5);
                int iDp = AndroidUtilities.dp(8.0f);
                int i5 = Theme.key_windowBackgroundWhiteBlueText2;
                int iMultAlpha = Theme.multAlpha(0.1f, Theme.getColor(i5, resourcesProvider));
                int iMultAlpha2 = Theme.multAlpha(0.22f, Theme.getColor(i5, resourcesProvider));
                clickableAnimatedTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, iMultAlpha, iMultAlpha2, iMultAlpha2));
                clickableAnimatedTextView.setTextColor(Theme.getColor(i5, resourcesProvider));
                clickableAnimatedTextView.getDrawable().scaleAmplitude = 0.6f;
                clickableAnimatedTextView.setVisibility(8);
                this.todayTimeTextContainer2.addView(clickableAnimatedTextView, LayoutHelper.createLinearRelatively(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.todayTimeContainer = frameLayout;
                frameLayout.addView(this.todayTimeTextContainer2, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                anonymousClass19.addView(frameLayout, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.lines[i] = anonymousClass19;
                addView(anonymousClass19, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup viewGroupM = zzkf.m(context, 0);
                this.labelText[i] = new TextView(context);
                this.labelText[i].setTextSize(1, 14.0f);
                this.labelText[i].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                this.labelText[i].setGravity(LocaleController.isRTL ? 5 : 3);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.timeText[i] = new TextView[2];
                for (int i6 = 0; i6 < 2; i6++) {
                    this.timeText[i][i6] = new TextView(context);
                    this.timeText[i][i6].setTextSize(1, 14.0f);
                    this.timeText[i][i6].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
                    this.timeText[i][i6].setGravity(LocaleController.isRTL ? 3 : 5);
                    frameLayout2.addView(this.timeText[i][i6], LayoutHelper.createFrame(-1, -1, 119));
                }
                if (LocaleController.isRTL) {
                    viewGroupM.addView(frameLayout2, LayoutHelper.createLinear(-2, -1, 51));
                    viewGroupM.addView(this.labelText[i], LayoutHelper.createLinear(-1, -1, 53));
                } else {
                    viewGroupM.addView(this.labelText[i], LayoutHelper.createLinear(-2, -1, 51));
                    viewGroupM.addView(frameLayout2, LayoutHelper.createLinear(-1, -1, 53));
                }
                this.lines[i] = viewGroupM;
                addView(viewGroupM, LayoutHelper.createLinearRelatively(-1.0f, -2.0f, 51, 18.0f, i == 1 ? 1.0f : 11.66f, 28.0f, i == 6 ? 16.66f : 0.0f));
            }
            i++;
        }
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.needDivider) {
            Paint themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider);
            if (themePaint == null) {
                themePaint = Theme.dividerPaint;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 21.33f : 0.0f), getMeasuredHeight(), themePaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int iDp;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (!this.expanded) {
            int iDp2 = AndroidUtilities.dp(60.0f);
            int i3 = this.todayLinesCount;
            ClickableAnimatedTextView clickableAnimatedTextView = this.switchText;
            if (i3 > 2 || clickableAnimatedTextView.getVisibility() == 0) {
                iDp = AndroidUtilities.dp(clickableAnimatedTextView.getVisibility() == 0 ? 21.0f : 0.0f) + AndroidUtilities.dp(15.0f) + this.todayLinesHeight;
            } else {
                iDp = 0;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max(iDp2, iDp) + (this.needDivider ? 1 : 0), 1073741824);
        }
        super.onMeasure(iMakeMeasureSpec, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableAnimatedTextView clickableAnimatedTextView = this.switchText;
        if (clickableAnimatedTextView == null || clickableAnimatedTextView.getVisibility() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        float x = motionEvent.getX();
        ViewGroup[] viewGroupArr = this.lines;
        float x2 = x - viewGroupArr[0].getX();
        FrameLayout frameLayout = this.todayTimeContainer;
        float x3 = x2 - frameLayout.getX();
        FrameLayout frameLayout2 = this.todayTimeTextContainer;
        return clickableAnimatedTextView.getClickBounds().contains((int) ((x3 - frameLayout2.getX()) - clickableAnimatedTextView.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - clickableAnimatedTextView.getY()));
    }

    public final void set(TL_account.TL_businessWorkHours tL_businessWorkHours, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        boolean z6;
        ArrayList[] arrayListArr;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        boolean z7 = z;
        this.expanded = z7;
        this.needDivider = z3;
        if (tL_businessWorkHours == null) {
            return;
        }
        int i8 = 1;
        if (!tL_businessWorkHours.weekly_open.isEmpty()) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (i9 < tL_businessWorkHours.weekly_open.size()) {
                    TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = tL_businessWorkHours.weekly_open.get(i9);
                    if (tL_businessWeeklyOpen.start_minute <= i10 + 1) {
                        i10 = tL_businessWeeklyOpen.end_minute;
                        i9++;
                    }
                } else if (i10 >= 10079) {
                    z4 = true;
                    break;
                }
                z4 = false;
                break;
            }
        }
        z4 = false;
        break;
        if (z4) {
            this.expanded = false;
            z7 = false;
        }
        int i11 = 8;
        int i12 = z4 ? 8 : 0;
        ImageView imageView = this.arrowView;
        imageView.setVisibility(i12);
        this.todayTimeTextContainer2.setTranslationX(z4 ? AndroidUtilities.dp(11.0f) : 0.0f);
        TLRPC.TL_timezone tL_timezoneFindTimezone = TimezonesController.getInstance(UserConfig.selectedAccount).findTimezone(tL_businessWorkHours.timezone_id);
        Calendar calendar = Calendar.getInstance();
        int offset = ((calendar.getTimeZone().getOffset(System.currentTimeMillis()) / 1000) - (tL_timezoneFindTimezone == null ? 0 : tL_timezoneFindTimezone.utc_offset)) / 60;
        if (offset != 0 && !z4) {
            i11 = 0;
        }
        ClickableAnimatedTextView clickableAnimatedTextView = this.switchText;
        clickableAnimatedTextView.setVisibility(i11);
        boolean z8 = offset == 0 ? false : z2;
        invalidate();
        boolean z9 = this.firstAfterAttach;
        TextView[] textViewArr = this.labelTimeText;
        TextView[][] textViewArr2 = this.timeText;
        if (z9) {
            textViewArr[0].setAlpha((z7 || z8) ? 0.0f : 1.0f);
            textViewArr[1].setAlpha((z7 || !z8) ? 0.0f : 1.0f);
            imageView.setRotation(z7 ? 180.0f : 0.0f);
        } else {
            ViewPropertyAnimator duration = textViewArr[0].animate().alpha((z7 || z8) ? 0.0f : 1.0f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            textViewArr[1].animate().alpha((z7 || !z8) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            textViewArr2[0][0].animate().alpha(z7 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            textViewArr2[0][1].animate().alpha(z7 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            imageView.animate().rotation(z7 ? 180.0f : 0.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
        }
        int i13 = 0;
        while (i13 < textViewArr2.length) {
            int i14 = 0;
            while (true) {
                TextView[] textViewArr3 = textViewArr2[i13];
                if (i14 < textViewArr3.length) {
                    if (i13 == 0 && !z7) {
                        f = 0.0f;
                    } else if ((i14 == i8) == z8) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    if (this.firstAfterAttach) {
                        textViewArr3[i14].setAlpha(f);
                    } else {
                        textViewArr3[i14].animate().alpha(f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                    }
                    i14++;
                    i8 = 1;
                }
            }
            i13++;
            i8 = 1;
        }
        clickableAnimatedTextView.setText(LocaleController.getString(z8 ? R.string.BusinessHoursProfileSwitchMy : R.string.BusinessHoursProfileSwitchLocal), (LocaleController.isRTL || this.firstAfterAttach) ? false : true, true);
        this.firstAfterAttach = false;
        ArrayList[] daysHours = OpeningHoursActivity.getDaysHours(new ArrayList(tL_businessWorkHours.weekly_open));
        int i15 = (calendar.get(7) + 5) % 7;
        int i16 = calendar.get(11);
        int i17 = calendar.get(12);
        ArrayList arrayList = new ArrayList(tL_businessWorkHours.weekly_open);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i18 = 0;
        while (i18 < arrayList.size()) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i18);
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen3 = new TL_account.TL_businessWeeklyOpen();
            boolean z10 = z7;
            if (offset != 0) {
                int i19 = tL_businessWeeklyOpen2.start_minute;
                z6 = z4;
                int i20 = i19 % 1440;
                int i21 = tL_businessWeeklyOpen2.end_minute;
                arrayListArr = daysHours;
                int i22 = (i21 - i19) + i20;
                if (i20 == 0) {
                    i4 = i17;
                    if (i22 == 1440 || i22 == 1439) {
                        tL_businessWeeklyOpen3.start_minute = i19;
                        tL_businessWeeklyOpen3.end_minute = i21;
                        arrayList2.add(tL_businessWeeklyOpen3);
                    }
                    i18++;
                    z7 = z10;
                    z4 = z6;
                    i17 = i4;
                    daysHours = arrayListArr;
                }
                tL_businessWeeklyOpen3.start_minute = tL_businessWeeklyOpen2.start_minute + offset;
                tL_businessWeeklyOpen3.end_minute = tL_businessWeeklyOpen2.end_minute + offset;
                arrayList2.add(tL_businessWeeklyOpen3);
                i5 = tL_businessWeeklyOpen3.start_minute;
                if (i5 < 0) {
                    i7 = tL_businessWeeklyOpen3.end_minute;
                    if (i7 < 0) {
                        tL_businessWeeklyOpen3.start_minute = i5 + 10080;
                        tL_businessWeeklyOpen3.end_minute = i7 + 10080;
                    } else {
                        tL_businessWeeklyOpen3.start_minute = 0;
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen4 = new TL_account.TL_businessWeeklyOpen();
                        tL_businessWeeklyOpen4.start_minute = tL_businessWeeklyOpen2.start_minute + 10080 + offset;
                        tL_businessWeeklyOpen4.end_minute = 10079;
                        arrayList2.add(tL_businessWeeklyOpen4);
                    }
                } else {
                    i6 = tL_businessWeeklyOpen3.end_minute;
                    if (i6 <= 10080) {
                        if (i5 > 10080) {
                            tL_businessWeeklyOpen3.start_minute = i5 - 10080;
                            tL_businessWeeklyOpen3.end_minute = i6 - 10080;
                        } else {
                            tL_businessWeeklyOpen3.end_minute = 10079;
                            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen5 = new TL_account.TL_businessWeeklyOpen();
                            tL_businessWeeklyOpen5.start_minute = 0;
                            tL_businessWeeklyOpen5.end_minute = (tL_businessWeeklyOpen2.end_minute + offset) - 10079;
                            arrayList2.add(tL_businessWeeklyOpen5);
                        }
                    }
                    i18++;
                    z7 = z10;
                    z4 = z6;
                    i17 = i4;
                    daysHours = arrayListArr;
                }
                i18++;
                z7 = z10;
                z4 = z6;
                i17 = i4;
                daysHours = arrayListArr;
            } else {
                z6 = z4;
                arrayListArr = daysHours;
            }
            i4 = i17;
            tL_businessWeeklyOpen3.start_minute = tL_businessWeeklyOpen2.start_minute + offset;
            tL_businessWeeklyOpen3.end_minute = tL_businessWeeklyOpen2.end_minute + offset;
            arrayList2.add(tL_businessWeeklyOpen3);
            i5 = tL_businessWeeklyOpen3.start_minute;
            if (i5 < 0) {
                i7 = tL_businessWeeklyOpen3.end_minute;
                if (i7 < 0) {
                    tL_businessWeeklyOpen3.start_minute = i5 + 10080;
                    tL_businessWeeklyOpen3.end_minute = i7 + 10080;
                } else {
                    tL_businessWeeklyOpen3.start_minute = 0;
                    TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen6 = new TL_account.TL_businessWeeklyOpen();
                    tL_businessWeeklyOpen6.start_minute = tL_businessWeeklyOpen2.start_minute + 10080 + offset;
                    tL_businessWeeklyOpen6.end_minute = 10079;
                    arrayList2.add(tL_businessWeeklyOpen6);
                }
            } else {
                i6 = tL_businessWeeklyOpen3.end_minute;
                if (i6 <= 10080) {
                    if (i5 > 10080) {
                        tL_businessWeeklyOpen3.start_minute = i5 - 10080;
                        tL_businessWeeklyOpen3.end_minute = i6 - 10080;
                    } else {
                        tL_businessWeeklyOpen3.end_minute = 10079;
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen7 = new TL_account.TL_businessWeeklyOpen();
                        tL_businessWeeklyOpen7.start_minute = 0;
                        tL_businessWeeklyOpen7.end_minute = (tL_businessWeeklyOpen2.end_minute + offset) - 10079;
                        arrayList2.add(tL_businessWeeklyOpen7);
                    }
                }
                i18++;
                z7 = z10;
                z4 = z6;
                i17 = i4;
                daysHours = arrayListArr;
            }
            i18++;
            z7 = z10;
            z4 = z6;
            i17 = i4;
            daysHours = arrayListArr;
        }
        boolean z11 = z7;
        boolean z12 = z4;
        ArrayList[] arrayListArr2 = daysHours;
        Collections.sort(arrayList2, new Theme$$ExternalSyntheticLambda5(29));
        int i23 = (i15 * 1440) + (i16 * 60) + i17;
        int i24 = 0;
        while (true) {
            if (i24 >= arrayList2.size()) {
                z5 = false;
                break;
            }
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen8 = (TL_account.TL_businessWeeklyOpen) arrayList2.get(i24);
            int i25 = tL_businessWeeklyOpen8.start_minute;
            if ((i23 >= i25 && i23 <= tL_businessWeeklyOpen8.end_minute) || (((i2 = i23 + 10080) >= i25 && i2 <= tL_businessWeeklyOpen8.end_minute) || ((i3 = i23 - 10080) >= i25 && i3 <= tL_businessWeeklyOpen8.end_minute))) {
                z5 = true;
                break;
            }
            i24++;
        }
        ArrayList[] daysHours2 = OpeningHoursActivity.getDaysHours(arrayList2);
        String string = LocaleController.getString(z5 ? R.string.BusinessHoursProfileNowOpen : R.string.BusinessHoursProfileNowClosed);
        TextView textView = this.textView;
        textView.setText(string);
        textView.setTextColor(Theme.getColor(z5 ? Theme.key_avatar_nameInMessageGreen : Theme.key_text_RedRegular, this.resourcesProvider));
        int i26 = this.todayLinesHeight;
        int i27 = this.todayLinesCount;
        this.todayLinesCount = 1;
        this.todayLinesHeight = 0;
        int i28 = 0;
        while (i28 < 2) {
            ArrayList[] arrayListArr3 = i28 == 0 ? arrayListArr2 : daysHours2;
            int i29 = 0;
            while (i29 < 7) {
                int i30 = (i15 + i29) % 7;
                TextView[] textViewArr4 = this.labelText;
                if (i29 == 0) {
                    textViewArr4[i29].setText(LocaleController.getString(R.string.BusinessHoursProfile));
                } else {
                    String displayName = DayOfWeek.values()[i30].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
                    textViewArr4[i29].setText(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
                    textViewArr2[i29][0].setVisibility(z11 ? 0 : 4);
                    textViewArr2[i29][1].setVisibility(z11 ? 0 : 4);
                    textViewArr4[i29].setVisibility(z11 ? 0 : 4);
                }
                int i31 = 0;
                while (true) {
                    if (i31 < (i29 == 0 ? 2 : 1)) {
                        TextView textView2 = i31 == 0 ? textViewArr2[i29][i28] : textViewArr[i28];
                        if (i29 == 0 && !z5 && i31 == 1) {
                            int i32 = 0;
                            while (true) {
                                if (i32 >= arrayList2.size()) {
                                    i = -1;
                                    break;
                                }
                                i = ((TL_account.TL_businessWeeklyOpen) arrayList2.get(i32)).start_minute;
                                if (i23 < i) {
                                    break;
                                } else {
                                    i32++;
                                }
                            }
                            if (i == -1 && !arrayList2.isEmpty()) {
                                i = ((TL_account.TL_businessWeeklyOpen) arrayList2.get(0)).start_minute;
                            }
                            if (i == -1) {
                                textView2.setText(LocaleController.getString(R.string.BusinessHoursProfileClose));
                            } else {
                                int i33 = i < i23 ? (10080 - i23) + i : i - i23;
                                if (i33 < 60) {
                                    textView2.setText(LocaleController.formatPluralString("BusinessHoursProfileOpensInMinutes", i33, new Object[0]));
                                } else if (i33 < 1440) {
                                    textView2.setText(LocaleController.formatPluralString("BusinessHoursProfileOpensInHours", (int) Math.ceil(i33 / 60.0f), new Object[0]));
                                } else {
                                    textViewArr2 = textViewArr2;
                                    textView2.setText(LocaleController.formatPluralString("BusinessHoursProfileOpensInDays", (int) Math.ceil((i33 / 60.0f) / 24.0f), new Object[0]));
                                }
                            }
                        } else {
                            textViewArr2 = textViewArr2;
                            if (z12) {
                                textView2.setText(LocaleController.getString(R.string.BusinessHoursProfileFullOpen));
                            } else if (arrayListArr3[i30].isEmpty()) {
                                textView2.setText(LocaleController.getString(R.string.BusinessHoursProfileClose));
                            } else if (OpeningHoursActivity.isFull(arrayListArr3[i30])) {
                                textView2.setText(LocaleController.getString(R.string.BusinessHoursProfileOpen));
                            } else {
                                StringBuilder sb = new StringBuilder();
                                for (int i34 = 0; i34 < arrayListArr3[i30].size(); i34++) {
                                    if (i34 > 0) {
                                        sb.append("\n");
                                    }
                                    sb.append(arrayListArr3[i30].get(i34));
                                }
                                int size = arrayListArr3[i30].size();
                                textView2.setText(sb);
                                if (i29 == 0) {
                                    this.todayLinesCount = Math.max(this.todayLinesCount, size);
                                    this.todayLinesHeight = Math.max(this.todayLinesHeight, textView2.getLineHeight() * size);
                                }
                            }
                        }
                        i31++;
                        textViewArr2 = textViewArr2;
                    }
                }
                i29++;
                daysHours2 = daysHours2;
                i15 = i15;
                z5 = z5;
            }
            i28++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.todayTimeContainer.getLayoutParams();
        float f2 = 6.0f;
        layoutParams.topMargin = AndroidUtilities.dp((this.todayLinesCount > 2 || clickableAnimatedTextView.getVisibility() == 0) ? 6.0f : 12.0f);
        if (this.todayLinesCount <= 2 && clickableAnimatedTextView.getVisibility() != 0) {
            f2 = 12.0f;
        }
        layoutParams.bottomMargin = AndroidUtilities.dp(f2);
        layoutParams.gravity = ((this.todayLinesCount > 2 || clickableAnimatedTextView.getVisibility() == 0) ? 16 : 80) | (LocaleController.isRTL ? 3 : 5);
        if (i27 == this.todayLinesCount && i26 == this.todayLinesHeight) {
            return;
        }
        requestLayout();
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        ClickableAnimatedTextView clickableAnimatedTextView = this.switchText;
        if (clickableAnimatedTextView != null) {
            clickableAnimatedTextView.setOnClickListener(onClickListener);
        }
    }
}
