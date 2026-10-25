package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class zz0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final ak0[] E;
    public float F;
    public float G;
    public int H;
    public int I;
    public int J;
    public mp0 K;
    public int f35442a;
    public final Paint f35443b;
    public final Paint f35444c;
    public final Paint d;
    public final Paint e;
    public final RectF f35445f;
    public final yz0 h;
    public final String[] f35446n;
    public final int[] f35447r;
    public final xj0[] f35448s;
    public final xj0[] v;
    public final int[] f35449w;
    public final int[] f35450x;
    public int f35451y;

    public zz0(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f35443b = paint;
        this.f35444c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f35445f = new RectF();
        this.f35446n = r7;
        this.f35447r = r8;
        this.f35448s = new xj0[6];
        this.v = new xj0[6];
        this.f35449w = new int[6];
        this.f35450x = new int[6];
        this.E = new ak0[2];
        this.G = 1.0f;
        String[] strArr = {LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
        int i11 = org.telegram.ui.ActionBar.y6.f23338c9;
        int[] iArr = {i11, i11, i11, i11, org.telegram.ui.ActionBar.y6.Y5, org.telegram.ui.ActionBar.y6.f23357d9};
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint2.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(5.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        yz0 yz0Var = new yz0(this, context);
        this.h = yz0Var;
        this.f35442a = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23462j5, false);
        yz0Var.setMinValue(0);
        yz0Var.setDrawDividers(false);
        boolean isEmpty = MessagesController.getInstance(i10).dialogFilters.isEmpty();
        yz0Var.setMaxValue(isEmpty ? 4 : 5);
        yz0Var.setAllItemsCount(isEmpty ? 5 : 6);
        yz0Var.setWrapSelectorWheel(true);
        yz0Var.setFormatter(new xz0(this));
        yz0Var.setOnValueChangedListener(new xz0(this));
        yz0Var.setImportantForAccessibility(2);
        yz0Var.setValue(SharedConfig.getChatSwipeAction(i10));
        addView(yz0Var, gb1.h(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.f35451y = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            this.E[i12] = new ImageView(context);
            addView(this.E[i12], gb1.h(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        xj0 a2 = a(this.h.getValue());
        if (a2 != null) {
            this.E[0].setImageDrawable(a2);
            a2.M(a2.e[0] - 1);
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.E[0], true, 0.5f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.E[1], false, 0.5f, false);
        this.F = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.J = this.h.getValue();
    }

    public final xj0 a(int i10) {
        int i11;
        xj0[] xj0VarArr = this.f35448s;
        if (xj0VarArr[i10] == null) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                i11 = R.raw.swipe_pin;
                            } else {
                                i11 = R.raw.swipe_disabled;
                            }
                        } else {
                            i11 = R.raw.swipe_delete;
                        }
                    } else {
                        i11 = R.raw.swipe_mute;
                    }
                } else {
                    i11 = R.raw.chats_archive;
                }
            } else {
                i11 = R.raw.swipe_read;
            }
            xj0VarArr[i10] = new xj0(i11, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return xj0VarArr[i10];
    }

    public final void b() {
        int value;
        if (this.K == null && this.J != (value = this.h.getValue())) {
            this.J = value;
            int i10 = (this.f35451y + 1) % 2;
            xj0 a2 = a(value);
            ak0[] ak0VarArr = this.E;
            if (a2 != null) {
                if (ak0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                ak0VarArr[i10].setAnimation(a2);
                ak0VarArr[i10].d();
            } else {
                ak0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(ak0VarArr[this.f35451y], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(ak0VarArr[i10], true, 0.5f, true);
            this.f35451y = i10;
            mp0 mp0Var = new mp0(this, 18);
            this.K = mp0Var;
            AndroidUtilities.runOnUIThread(mp0Var, 150L);
        }
    }

    public final void c(int i10) {
        xj0[] xj0VarArr = this.f35448s;
        if (xj0VarArr[i10] != null) {
            int f7 = i0.a.f(0.9f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23338c9, false));
            int i11 = org.telegram.ui.ActionBar.y6.f23376e9;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            xj0 xj0Var = xj0VarArr[i10];
            xj0[] xj0VarArr2 = this.v;
            xj0 xj0Var2 = xj0VarArr2[i10];
            int[] iArr = this.f35450x;
            int[] iArr2 = this.f35449w;
            if (xj0Var != xj0Var2 || x02 != iArr2[i10] || f7 != iArr[i10]) {
                xj0VarArr2[i10] = xj0Var;
                iArr2[i10] = x02;
                iArr[i10] = f7;
                if (i10 == 2) {
                    xj0VarArr[i10].Q(f7, "Arrow");
                    xj0VarArr[i10].Q(x02, "Box2");
                    xj0VarArr[i10].Q(x02, "Box1");
                    return;
                }
                org.telegram.ui.ActionBar.f7.y(this, xj0VarArr[i10], i11, null, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zz0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            yz0 yz0Var = this.h;
            int value = yz0Var.getValue() + 1;
            setContentDescription(this.f35446n[(value > yz0Var.getMaxValue() || value < 0) ? 0 : 0]);
            yz0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.f35446n[this.h.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        updateColors();
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23462j5, false);
        this.f35442a = x02;
        yz0 yz0Var = this.h;
        yz0Var.setTextColor(x02);
        yz0Var.invalidate();
    }

    @Override
    public final void updateColors() {
        for (int i10 = 0; i10 < this.f35448s.length; i10++) {
            c(i10);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
