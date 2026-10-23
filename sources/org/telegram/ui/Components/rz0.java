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
public final class rz0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final bk0[] E;
    public float F;
    public float G;
    public int H;
    public int I;
    public int J;
    public kr0 K;
    public int f30290a;
    public final Paint f30291b;
    public final Paint f30292c;
    public final Paint d;
    public final Paint e;
    public final RectF f30293f;
    public final qz0 h;
    public final String[] f30294n;
    public final int[] f30295r;
    public final yj0[] f30296s;
    public final yj0[] v;
    public final int[] f30297w;
    public final int[] f30298x;
    public int f30299y;

    public rz0(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f30291b = paint;
        this.f30292c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f30293f = new RectF();
        this.f30294n = r7;
        this.f30295r = r8;
        this.f30296s = new yj0[6];
        this.v = new yj0[6];
        this.f30297w = new int[6];
        this.f30298x = new int[6];
        this.E = new bk0[2];
        this.G = 1.0f;
        String[] strArr = {LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
        int i11 = org.telegram.ui.ActionBar.k6.f21167c9;
        int[] iArr = {i11, i11, i11, i11, org.telegram.ui.ActionBar.k6.Y5, org.telegram.ui.ActionBar.k6.f21186d9};
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
        qz0 qz0Var = new qz0(this, context);
        this.h = qz0Var;
        this.f30290a = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21289j5, false);
        qz0Var.setMinValue(0);
        qz0Var.setDrawDividers(false);
        boolean isEmpty = MessagesController.getInstance(i10).dialogFilters.isEmpty();
        qz0Var.setMaxValue(isEmpty ? 4 : 5);
        qz0Var.setAllItemsCount(isEmpty ? 5 : 6);
        qz0Var.setWrapSelectorWheel(true);
        qz0Var.setFormatter(new pz0(this));
        qz0Var.setOnValueChangedListener(new pz0(this));
        qz0Var.setImportantForAccessibility(2);
        qz0Var.setValue(SharedConfig.getChatSwipeAction(i10));
        addView(qz0Var, w7.z5.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.f30299y = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            this.E[i12] = new ImageView(context);
            addView(this.E[i12], w7.z5.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        yj0 a2 = a(this.h.getValue());
        if (a2 != null) {
            this.E[0].setImageDrawable(a2);
            a2.M(a2.e[0] - 1);
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.E[0], true, 0.5f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.E[1], false, 0.5f, false);
        this.F = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.J = this.h.getValue();
    }

    public final yj0 a(int i10) {
        int i11;
        yj0[] yj0VarArr = this.f30296s;
        if (yj0VarArr[i10] == null) {
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
            yj0VarArr[i10] = new yj0(i11, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return yj0VarArr[i10];
    }

    public final void b() {
        int value;
        if (this.K == null && this.J != (value = this.h.getValue())) {
            this.J = value;
            int i10 = (this.f30299y + 1) % 2;
            yj0 a2 = a(value);
            bk0[] bk0VarArr = this.E;
            if (a2 != null) {
                if (bk0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                bk0VarArr[i10].setAnimation(a2);
                bk0VarArr[i10].d();
            } else {
                bk0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(bk0VarArr[this.f30299y], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(bk0VarArr[i10], true, 0.5f, true);
            this.f30299y = i10;
            kr0 kr0Var = new kr0(this, 13);
            this.K = kr0Var;
            AndroidUtilities.runOnUIThread(kr0Var, 150L);
        }
    }

    public final void c(int i10) {
        yj0[] yj0VarArr = this.f30296s;
        if (yj0VarArr[i10] != null) {
            int f7 = i0.a.f(0.9f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21167c9, false));
            int i11 = org.telegram.ui.ActionBar.k6.f21202e9;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
            yj0 yj0Var = yj0VarArr[i10];
            yj0[] yj0VarArr2 = this.v;
            yj0 yj0Var2 = yj0VarArr2[i10];
            int[] iArr = this.f30298x;
            int[] iArr2 = this.f30297w;
            if (yj0Var != yj0Var2 || x02 != iArr2[i10] || f7 != iArr[i10]) {
                yj0VarArr2[i10] = yj0Var;
                iArr2[i10] = x02;
                iArr[i10] = f7;
                if (i10 == 2) {
                    yj0VarArr[i10].Q(f7, "Arrow");
                    yj0VarArr[i10].Q(x02, "Box2");
                    yj0VarArr[i10].Q(x02, "Box1");
                    return;
                }
                org.telegram.ui.ActionBar.r6.z(this, yj0VarArr[i10], i11, null, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rz0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            qz0 qz0Var = this.h;
            int value = qz0Var.getValue() + 1;
            setContentDescription(this.f30294n[(value > qz0Var.getMaxValue() || value < 0) ? 0 : 0]);
            qz0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.f30294n[this.h.getValue()]);
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
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21289j5, false);
        this.f30290a = x02;
        qz0 qz0Var = this.h;
        qz0Var.setTextColor(x02);
        qz0Var.invalidate();
    }

    @Override
    public final void updateColors() {
        for (int i10 = 0; i10 < this.f30296s.length; i10++) {
            c(i10);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
