package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.ClickableAnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class ProfileHoursCell extends LinearLayout {
    private ImageView arrowView;
    private boolean expanded;
    private boolean firstAfterAttach;
    private final TextView[] labelText;
    private TextView[] labelTimeText;
    private final ViewGroup[] lines;
    private boolean needDivider;
    private final Theme.ResourcesProvider resourcesProvider;
    private ClickableAnimatedTextView switchText;
    private TextView textView;
    private final TextView[][] timeText;
    private int todayLinesCount;
    private int todayLinesHeight;
    private FrameLayout todayTimeContainer;
    private FrameLayout todayTimeTextContainer;
    private LinearLayout todayTimeTextContainer2;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ProfileHoursCell profileHoursCell = (ProfileHoursCell) view;
            profileHoursCell.setId(uItem.id);
            profileHoursCell.setOnTimezoneSwitchClick(uItem.clickCallback);
            profileHoursCell.set((TL_account.TL_businessWorkHours) uItem.object, uItem.locked, uItem.accent, z);
        }

        @Override
        public final boolean contentsEquals(UItem uItem, UItem uItem2) {
            return uItem.accent == uItem2.accent && uItem.locked == uItem2.locked;
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new ProfileHoursCell(context, resourcesProvider);
        }

        @Override
        public final boolean equals(UItem uItem, UItem uItem2) {
            return uItem.id == uItem2.id;
        }
    }

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
                ActionBar.AnonymousClass8 anonymousClass8 = new ActionBar.AnonymousClass8(context, 3);
                anonymousClass8.setMinimumHeight(AndroidUtilities.dp(60.0f));
                TextView textView = new TextView(context);
                this.textView = textView;
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                this.textView.setTextSize(1, 16.0f);
                anonymousClass8.addView(this.textView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.labelText[i] = new TextView(context);
                this.labelText[i].setGravity(LocaleController.isRTL ? 5 : 3);
                this.labelText[i].setTextSize(1, 13.0f);
                this.labelText[i].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
                anonymousClass8.addView(this.labelText[i], LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
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
                this.arrowView.setScaleX(0.6f);
                this.arrowView.setScaleY(0.6f);
                this.arrowView.setImageResource(R.drawable.arrow_more);
                this.arrowView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider), PorterDuff.Mode.SRC_IN));
                this.todayTimeTextContainer.addView(this.arrowView, LayoutHelper.createFrameRelatively(20.0f, 20.0f, 8388629));
                this.todayTimeTextContainer2.addView(this.todayTimeTextContainer, LayoutHelper.createLinearRelatively(-1.0f, -1.0f, 119));
                ClickableAnimatedTextView clickableAnimatedTextView = new ClickableAnimatedTextView(context);
                this.switchText = clickableAnimatedTextView;
                clickableAnimatedTextView.getDrawable().updateAll = true;
                this.switchText.setTextSize(AndroidUtilities.dp(13.0f));
                this.switchText.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                this.switchText.setGravity(LocaleController.isRTL ? 3 : 5);
                ClickableAnimatedTextView clickableAnimatedTextView2 = this.switchText;
                int iDp = AndroidUtilities.dp(8.0f);
                int i5 = Theme.key_windowBackgroundWhiteBlueText2;
                int iMultAlpha = Theme.multAlpha(0.1f, processColor(Theme.getColor(i5, resourcesProvider)));
                int iMultAlpha2 = Theme.multAlpha(0.22f, processColor(Theme.getColor(i5, resourcesProvider)));
                clickableAnimatedTextView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, iMultAlpha, iMultAlpha2, iMultAlpha2));
                this.switchText.setTextColor(processColor(Theme.getColor(i5, resourcesProvider)));
                this.switchText.getDrawable().setScaleProperty(0.6f);
                this.switchText.setVisibility(8);
                this.todayTimeTextContainer2.addView(this.switchText, LayoutHelper.createLinearRelatively(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.todayTimeContainer = frameLayout;
                frameLayout.addView(this.todayTimeTextContainer2, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                anonymousClass8.addView(this.todayTimeContainer, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.lines[i] = anonymousClass8;
                addView(anonymousClass8, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup viewGroupM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
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
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public void onDraw(Canvas canvas) {
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
    public void onMeasure(int i, int i2) {
        int iDp;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (!this.expanded) {
            int iDp2 = AndroidUtilities.dp(60.0f);
            if (this.todayLinesCount > 2 || this.switchText.getVisibility() == 0) {
                iDp = AndroidUtilities.dp(this.switchText.getVisibility() == 0 ? 21.0f : 0.0f) + AndroidUtilities.dp(15.0f) + this.todayLinesHeight;
            } else {
                iDp = 0;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max(iDp2, iDp) + (this.needDivider ? 1 : 0), 1073741824);
        }
        super.onMeasure(iMakeMeasureSpec, i2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableAnimatedTextView clickableAnimatedTextView = this.switchText;
        if (clickableAnimatedTextView == null || clickableAnimatedTextView.getVisibility() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return this.switchText.getClickBounds().contains((int) ((((motionEvent.getX() - this.lines[0].getX()) - this.todayTimeContainer.getX()) - this.todayTimeTextContainer.getX()) - this.switchText.getX()), (int) ((((motionEvent.getY() - this.lines[0].getY()) - this.todayTimeContainer.getY()) - this.todayTimeTextContainer.getY()) - this.switchText.getY()));
    }

    public int processColor(int i) {
        return i;
    }

    public void set(TL_account.TL_businessWorkHours tL_businessWorkHours, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z6;
        float f;
        boolean z7 = z;
        this.expanded = z7;
        this.needDivider = z3;
        if (tL_businessWorkHours == null) {
            return;
        }
        int i5 = 1;
        if (!tL_businessWorkHours.weekly_open.isEmpty()) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i6 < tL_businessWorkHours.weekly_open.size()) {
                    TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = tL_businessWorkHours.weekly_open.get(i6);
                    if (tL_businessWeeklyOpen.start_minute <= i7 + 1) {
                        i7 = tL_businessWeeklyOpen.end_minute;
                        i6++;
                    }
                } else if (i7 >= 10079) {
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
        int i8 = 8;
        this.arrowView.setVisibility(z4 ? 8 : 0);
        this.todayTimeTextContainer2.setTranslationX(z4 ? AndroidUtilities.dp(11.0f) : 0.0f);
        TLRPC.TL_timezone tL_timezoneFindTimezone = TimezonesController.getInstance(UserConfig.selectedAccount).findTimezone(tL_businessWorkHours.timezone_id);
        Calendar calendar = Calendar.getInstance();
        int offset = ((calendar.getTimeZone().getOffset(System.currentTimeMillis()) / 1000) - (tL_timezoneFindTimezone == null ? 0 : tL_timezoneFindTimezone.utc_offset)) / 60;
        ClickableAnimatedTextView clickableAnimatedTextView = this.switchText;
        if (offset != 0 && !z4) {
            i8 = 0;
        }
        clickableAnimatedTextView.setVisibility(i8);
        boolean z8 = offset == 0 ? false : z2;
        invalidate();
        if (this.firstAfterAttach) {
            this.labelTimeText[0].setAlpha((z7 || z8) ? 0.0f : 1.0f);
            this.labelTimeText[1].setAlpha((z7 || !z8) ? 0.0f : 1.0f);
            this.arrowView.setRotation(z7 ? 180.0f : 0.0f);
        } else {
            ViewPropertyAnimator duration = this.labelTimeText[0].animate().alpha((z7 || z8) ? 0.0f : 1.0f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.labelTimeText[1].animate().alpha((z7 || !z8) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            this.timeText[0][0].animate().alpha(z7 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            this.timeText[0][1].animate().alpha(z7 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            this.arrowView.animate().rotation(z7 ? 180.0f : 0.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
        }
        int i9 = 0;
        while (i9 < this.timeText.length) {
            int i10 = 0;
            while (true) {
                TextView[] textViewArr = this.timeText[i9];
                if (i10 < textViewArr.length) {
                    if (i9 == 0 && !z7) {
                        f = 0.0f;
                    } else if ((i10 == i5) == z8) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    if (this.firstAfterAttach) {
                        textViewArr[i10].setAlpha(f);
                    } else {
                        textViewArr[i10].animate().alpha(f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                    }
                    i10++;
                    i5 = 1;
                }
            }
            i9++;
            i5 = 1;
        }
        ClickableAnimatedTextView clickableAnimatedTextView2 = this.switchText;
        if (clickableAnimatedTextView2 != null) {
            clickableAnimatedTextView2.setText(LocaleController.getString(z8 ? R.string.BusinessHoursProfileSwitchMy : R.string.BusinessHoursProfileSwitchLocal), (LocaleController.isRTL || this.firstAfterAttach) ? false : true);
        }
        this.firstAfterAttach = false;
        ArrayList[] daysHours = OpeningHoursActivity.getDaysHours(new ArrayList(tL_businessWorkHours.weekly_open));
        int i11 = (calendar.get(7) + 5) % 7;
        int i12 = calendar.get(11);
        int i13 = calendar.get(12);
        ArrayList arrayList = new ArrayList(tL_businessWorkHours.weekly_open);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i14 = 0;
        while (i14 < arrayList.size()) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i14);
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen3 = new TL_account.TL_businessWeeklyOpen();
            if (offset != 0) {
                int i15 = tL_businessWeeklyOpen2.start_minute;
                int i16 = i15 % 1440;
                int i17 = tL_businessWeeklyOpen2.end_minute;
                z6 = z7;
                int i18 = (i17 - i15) + i16;
                if (i16 == 0 && (i18 == 1440 || i18 == 1439)) {
                    tL_businessWeeklyOpen3.start_minute = i15;
                    tL_businessWeeklyOpen3.end_minute = i17;
                    arrayList2.add(tL_businessWeeklyOpen3);
                }
                i14++;
                z7 = z6;
            } else {
                z6 = z7;
            }
            tL_businessWeeklyOpen3.start_minute = tL_businessWeeklyOpen2.start_minute + offset;
            tL_businessWeeklyOpen3.end_minute = tL_businessWeeklyOpen2.end_minute + offset;
            arrayList2.add(tL_businessWeeklyOpen3);
            int i19 = tL_businessWeeklyOpen3.start_minute;
            if (i19 < 0) {
                int i20 = tL_businessWeeklyOpen3.end_minute;
                if (i20 < 0) {
                    tL_businessWeeklyOpen3.start_minute = i19 + 10080;
                    tL_businessWeeklyOpen3.end_minute = i20 + 10080;
                } else {
                    tL_businessWeeklyOpen3.start_minute = 0;
                    TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen4 = new TL_account.TL_businessWeeklyOpen();
                    tL_businessWeeklyOpen4.start_minute = tL_businessWeeklyOpen2.start_minute + 10080 + offset;
                    tL_businessWeeklyOpen4.end_minute = 10079;
                    arrayList2.add(tL_businessWeeklyOpen4);
                }
            } else {
                int i21 = tL_businessWeeklyOpen3.end_minute;
                if (i21 > 10080) {
                    if (i19 > 10080) {
                        tL_businessWeeklyOpen3.start_minute = i19 - 10080;
                        tL_businessWeeklyOpen3.end_minute = i21 - 10080;
                    } else {
                        tL_businessWeeklyOpen3.end_minute = 10079;
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen5 = new TL_account.TL_businessWeeklyOpen();
                        tL_businessWeeklyOpen5.start_minute = 0;
                        tL_businessWeeklyOpen5.end_minute = (tL_businessWeeklyOpen2.end_minute + offset) - 10079;
                        arrayList2.add(tL_businessWeeklyOpen5);
                    }
                }
                i14++;
                z7 = z6;
            }
            i14++;
            z7 = z6;
        }
        boolean z9 = z7;
        Collections.sort(arrayList2, new Theme$$ExternalSyntheticLambda5(29));
        int i22 = (i11 * 1440) + (i12 * 60) + i13;
        int i23 = 0;
        while (true) {
            if (i23 >= arrayList2.size()) {
                z5 = false;
                break;
            }
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen6 = (TL_account.TL_businessWeeklyOpen) arrayList2.get(i23);
            int i24 = tL_businessWeeklyOpen6.start_minute;
            if ((i22 >= i24 && i22 <= tL_businessWeeklyOpen6.end_minute) || (((i3 = i22 + 10080) >= i24 && i3 <= tL_businessWeeklyOpen6.end_minute) || ((i4 = i22 - 10080) >= i24 && i4 <= tL_businessWeeklyOpen6.end_minute))) {
                z5 = true;
                break;
            }
            i23++;
        }
        ArrayList[] daysHours2 = OpeningHoursActivity.getDaysHours(arrayList2);
        this.textView.setText(LocaleController.getString(z5 ? R.string.BusinessHoursProfileNowOpen : R.string.BusinessHoursProfileNowClosed));
        this.textView.setTextColor(Theme.getColor(z5 ? Theme.key_avatar_nameInMessageGreen : Theme.key_text_RedRegular, this.resourcesProvider));
        int i25 = this.todayLinesHeight;
        int i26 = this.todayLinesCount;
        this.todayLinesCount = 1;
        this.todayLinesHeight = 0;
        int i27 = 0;
        while (i27 < 2) {
            ArrayList[] arrayListArr = i27 == 0 ? daysHours : daysHours2;
            int i28 = 0;
            while (i28 < 7) {
                int i29 = (i11 + i28) % 7;
                if (i28 == 0) {
                    this.labelText[i28].setText(LocaleController.getString(R.string.BusinessHoursProfile));
                } else {
                    String displayName = DayOfWeek.values()[i29].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
                    this.labelText[i28].setText(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
                    this.timeText[i28][0].setVisibility(z9 ? 0 : 4);
                    this.timeText[i28][1].setVisibility(z9 ? 0 : 4);
                    this.labelText[i28].setVisibility(z9 ? 0 : 4);
                }
                int i30 = 0;
                while (true) {
                    if (i30 < (i28 == 0 ? 2 : 1)) {
                        TextView textView = i30 == 0 ? this.timeText[i28][i27] : this.labelTimeText[i27];
                        if (i28 == 0 && !z5 && i30 == 1) {
                            int i31 = 0;
                            while (true) {
                                i = i30;
                                if (i31 >= arrayList2.size()) {
                                    i2 = -1;
                                    break;
                                }
                                i2 = ((TL_account.TL_businessWeeklyOpen) arrayList2.get(i31)).start_minute;
                                if (i22 < i2) {
                                    break;
                                }
                                i31++;
                                i30 = i;
                            }
                            if (i2 == -1 && !arrayList2.isEmpty()) {
                                i2 = ((TL_account.TL_businessWeeklyOpen) arrayList2.get(0)).start_minute;
                            }
                            if (i2 == -1) {
                                textView.setText(LocaleController.getString(R.string.BusinessHoursProfileClose));
                            } else {
                                int i32 = i2 < i22 ? (10080 - i22) + i2 : i2 - i22;
                                if (i32 < 60) {
                                    textView.setText(LocaleController.formatPluralString("BusinessHoursProfileOpensInMinutes", i32, new Object[0]));
                                } else if (i32 < 1440) {
                                    textView.setText(LocaleController.formatPluralString("BusinessHoursProfileOpensInHours", (int) Math.ceil(i32 / 60.0f), new Object[0]));
                                } else {
                                    i29 = i29;
                                    textView.setText(LocaleController.formatPluralString("BusinessHoursProfileOpensInDays", (int) Math.ceil((i32 / 60.0f) / 24.0f), new Object[0]));
                                }
                            }
                        } else {
                            i = i30;
                            i29 = i29;
                            if (z4) {
                                textView.setText(LocaleController.getString(R.string.BusinessHoursProfileFullOpen));
                            } else if (arrayListArr[i29].isEmpty()) {
                                textView.setText(LocaleController.getString(R.string.BusinessHoursProfileClose));
                            } else if (OpeningHoursActivity.isFull(arrayListArr[i29])) {
                                textView.setText(LocaleController.getString(R.string.BusinessHoursProfileOpen));
                            } else {
                                StringBuilder sb = new StringBuilder();
                                for (int i33 = 0; i33 < arrayListArr[i29].size(); i33++) {
                                    if (i33 > 0) {
                                        sb.append("\n");
                                    }
                                    sb.append(arrayListArr[i29].get(i33));
                                }
                                int size = arrayListArr[i29].size();
                                textView.setText(sb);
                                if (i28 == 0) {
                                    this.todayLinesCount = Math.max(this.todayLinesCount, size);
                                    this.todayLinesHeight = Math.max(this.todayLinesHeight, textView.getLineHeight() * size);
                                }
                            }
                        }
                        i30 = i + 1;
                        i29 = i29;
                    }
                }
                i28++;
                z5 = z5;
                z4 = z4;
            }
            i27++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.todayTimeContainer.getLayoutParams();
        float f2 = 6.0f;
        layoutParams.topMargin = AndroidUtilities.dp((this.todayLinesCount > 2 || this.switchText.getVisibility() == 0) ? 6.0f : 12.0f);
        if (this.todayLinesCount <= 2 && this.switchText.getVisibility() != 0) {
            f2 = 12.0f;
        }
        layoutParams.bottomMargin = AndroidUtilities.dp(f2);
        layoutParams.gravity = ((this.todayLinesCount > 2 || this.switchText.getVisibility() == 0) ? 16 : 80) | (LocaleController.isRTL ? 3 : 5);
        if (i26 == this.todayLinesCount && i25 == this.todayLinesHeight) {
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

    public void updateColors() {
        ClickableAnimatedTextView clickableAnimatedTextView = this.switchText;
        int iDp = AndroidUtilities.dp(8.0f);
        int i = Theme.key_windowBackgroundWhiteBlueText2;
        int iMultAlpha = Theme.multAlpha(0.1f, processColor(Theme.getColor(i, this.resourcesProvider)));
        int iMultAlpha2 = Theme.multAlpha(0.22f, processColor(Theme.getColor(i, this.resourcesProvider)));
        clickableAnimatedTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, iMultAlpha, iMultAlpha2, iMultAlpha2));
        this.switchText.setTextColor(processColor(Theme.getColor(i, this.resourcesProvider)));
    }
}
