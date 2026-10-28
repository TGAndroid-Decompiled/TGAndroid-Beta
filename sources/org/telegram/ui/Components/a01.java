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
public final class a01 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final bk0[] E;
    public float F;
    public float G;
    public int H;
    public int I;
    public int J;
    public np0 K;
    public int f26377a;
    public final Paint f26378b;
    public final Paint f26379c;
    public final Paint d;
    public final Paint e;
    public final RectF f26380f;
    public final zz0 h;
    public final String[] f26381n;
    public final int[] f26382r;
    public final yj0[] f26383s;
    public final yj0[] v;
    public final int[] f26384w;
    public final int[] f26385x;
    public int f26386y;

    public a01(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f26378b = paint;
        this.f26379c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f26380f = new RectF();
        this.f26381n = r7;
        this.f26382r = r8;
        this.f26383s = new yj0[6];
        this.v = new yj0[6];
        this.f26384w = new int[6];
        this.f26385x = new int[6];
        this.E = new bk0[2];
        this.G = 1.0f;
        String[] strArr = {LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
        int i11 = org.telegram.ui.ActionBar.y6.f23341c9;
        int[] iArr = {i11, i11, i11, i11, org.telegram.ui.ActionBar.y6.Y5, org.telegram.ui.ActionBar.y6.f23360d9};
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
        zz0 zz0Var = new zz0(this, context);
        this.h = zz0Var;
        this.f26377a = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23465j5, false);
        zz0Var.setMinValue(0);
        zz0Var.setDrawDividers(false);
        boolean isEmpty = MessagesController.getInstance(i10).dialogFilters.isEmpty();
        zz0Var.setMaxValue(isEmpty ? 4 : 5);
        zz0Var.setAllItemsCount(isEmpty ? 5 : 6);
        zz0Var.setWrapSelectorWheel(true);
        zz0Var.setFormatter(new yz0(this));
        zz0Var.setOnValueChangedListener(new yz0(this));
        zz0Var.setImportantForAccessibility(2);
        zz0Var.setValue(SharedConfig.getChatSwipeAction(i10));
        addView(zz0Var, kb1.h(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.f26386y = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            this.E[i12] = new ImageView(context);
            addView(this.E[i12], kb1.h(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
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
        yj0[] yj0VarArr = this.f26383s;
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
            int i10 = (this.f26386y + 1) % 2;
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
            AndroidUtilities.updateViewVisibilityAnimated(bk0VarArr[this.f26386y], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(bk0VarArr[i10], true, 0.5f, true);
            this.f26386y = i10;
            np0 np0Var = new np0(this, 18);
            this.K = np0Var;
            AndroidUtilities.runOnUIThread(np0Var, 150L);
        }
    }

    public final void c(int i10) {
        yj0[] yj0VarArr = this.f26383s;
        if (yj0VarArr[i10] != null) {
            int f7 = i0.a.f(0.9f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23341c9, false));
            int i11 = org.telegram.ui.ActionBar.y6.f23379e9;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            yj0 yj0Var = yj0VarArr[i10];
            yj0[] yj0VarArr2 = this.v;
            yj0 yj0Var2 = yj0VarArr2[i10];
            int[] iArr = this.f26385x;
            int[] iArr2 = this.f26384w;
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
                org.telegram.ui.ActionBar.f7.y(this, yj0VarArr[i10], i11, null, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a01.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            zz0 zz0Var = this.h;
            int value = zz0Var.getValue() + 1;
            setContentDescription(this.f26381n[(value > zz0Var.getMaxValue() || value < 0) ? 0 : 0]);
            zz0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.f26381n[this.h.getValue()]);
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
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23465j5, false);
        this.f26377a = x02;
        zz0 zz0Var = this.h;
        zz0Var.setTextColor(x02);
        zz0Var.invalidate();
    }

    @Override
    public final void updateColors() {
        for (int i10 = 0; i10 < this.f26383s.length; i10++) {
            c(i10);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
