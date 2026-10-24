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
public final class qz0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ak0[] E;
    public float F;
    public float G;
    public int H;
    public int I;
    public int J;
    public jr0 K;
    public int f30013a;
    public final Paint f30014b;
    public final Paint f30015c;
    public final Paint d;
    public final Paint e;
    public final RectF f30016f;
    public final pz0 h;
    public final String[] f30017n;
    public final int[] f30018r;
    public final xj0[] f30019s;
    public final xj0[] v;
    public final int[] f30020w;
    public final int[] f30021x;
    public int f30022y;

    public qz0(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f30014b = paint;
        this.f30015c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f30016f = new RectF();
        this.f30017n = r7;
        this.f30018r = r8;
        this.f30019s = new xj0[6];
        this.v = new xj0[6];
        this.f30020w = new int[6];
        this.f30021x = new int[6];
        this.E = new ak0[2];
        this.G = 1.0f;
        String[] strArr = {LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
        int i11 = org.telegram.ui.ActionBar.k6.f21168c9;
        int[] iArr = {i11, i11, i11, i11, org.telegram.ui.ActionBar.k6.Y5, org.telegram.ui.ActionBar.k6.f21187d9};
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
        pz0 pz0Var = new pz0(this, context);
        this.h = pz0Var;
        this.f30013a = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21290j5, false);
        pz0Var.setMinValue(0);
        pz0Var.setDrawDividers(false);
        boolean isEmpty = MessagesController.getInstance(i10).dialogFilters.isEmpty();
        pz0Var.setMaxValue(isEmpty ? 4 : 5);
        pz0Var.setAllItemsCount(isEmpty ? 5 : 6);
        pz0Var.setWrapSelectorWheel(true);
        pz0Var.setFormatter(new oz0(this));
        pz0Var.setOnValueChangedListener(new oz0(this));
        pz0Var.setImportantForAccessibility(2);
        pz0Var.setValue(SharedConfig.getChatSwipeAction(i10));
        addView(pz0Var, w7.z5.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.f30022y = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            this.E[i12] = new ImageView(context);
            addView(this.E[i12], w7.z5.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
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
        xj0[] xj0VarArr = this.f30019s;
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
            int i10 = (this.f30022y + 1) % 2;
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
            AndroidUtilities.updateViewVisibilityAnimated(ak0VarArr[this.f30022y], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(ak0VarArr[i10], true, 0.5f, true);
            this.f30022y = i10;
            jr0 jr0Var = new jr0(this, 13);
            this.K = jr0Var;
            AndroidUtilities.runOnUIThread(jr0Var, 150L);
        }
    }

    public final void c(int i10) {
        xj0[] xj0VarArr = this.f30019s;
        if (xj0VarArr[i10] != null) {
            int f7 = i0.a.f(0.9f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21168c9, false));
            int i11 = org.telegram.ui.ActionBar.k6.f21203e9;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
            xj0 xj0Var = xj0VarArr[i10];
            xj0[] xj0VarArr2 = this.v;
            xj0 xj0Var2 = xj0VarArr2[i10];
            int[] iArr = this.f30021x;
            int[] iArr2 = this.f30020w;
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
                org.telegram.ui.ActionBar.r6.z(this, xj0VarArr[i10], i11, null, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qz0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            pz0 pz0Var = this.h;
            int value = pz0Var.getValue() + 1;
            setContentDescription(this.f30017n[(value > pz0Var.getMaxValue() || value < 0) ? 0 : 0]);
            pz0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.f30017n[this.h.getValue()]);
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
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21290j5, false);
        this.f30013a = x02;
        pz0 pz0Var = this.h;
        pz0Var.setTextColor(x02);
        pz0Var.invalidate();
    }

    @Override
    public final void updateColors() {
        for (int i10 = 0; i10 < this.f30019s.length; i10++) {
            c(i10);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
