package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wz extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f34559a;
    public int f34560b;
    public final View f34561c;
    public final FrameLayout d;
    public final w4.c e;
    public final h2 f34562f;
    public final int h;
    public float f34563n;
    public float f34564r;
    public float f34565s;
    public boolean v;
    public boolean f34566w;
    public boolean f34567x;
    public int f34568y;

    public wz(Context context, r71 r71Var, org.telegram.ui.ActionBar.u6 u6Var, h2 h2Var) {
        super(context);
        int i10;
        boolean z10;
        this.f34568y = -1;
        this.f34561c = r71Var;
        this.f34562f = h2Var;
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        addView(r71Var, gb1.g(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        int dp = AndroidUtilities.dp(20.0f);
        int i11 = org.telegram.ui.ActionBar.y6.f23356d6;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        frameLayout.setBackground(c02);
        r0.b bVar = null;
        org.telegram.ui.ActionBar.f7.k(frameLayout, c02, N, null, u6Var);
        frameLayout.setElevation(AndroidUtilities.dp(4.0f));
        addView(frameLayout, gb1.i(40, 40, 49));
        w4.c cVar = new w4.c(context);
        this.e = cVar;
        float f7 = cVar.f50799c.getDisplayMetrics().density;
        float f10 = 2.5f * f7;
        w4.b bVar2 = cVar.f50797a;
        bVar2.h = f10;
        bVar2.f50778b.setStrokeWidth(f10);
        bVar2.f50790q = 7.5f * f7;
        bVar2.a(0);
        bVar2.f50791r = (int) (10.0f * f7);
        bVar2.f50792s = (int) (5.0f * f7);
        cVar.invalidateSelf();
        float dp2 = AndroidUtilities.dp(2.25f);
        bVar2.h = dp2;
        bVar2.f50778b.setStrokeWidth(dp2);
        cVar.invalidateSelf();
        this.f34559a = u6Var;
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
        this.f34560b = w02;
        bVar2.f50782i = new int[]{w02};
        bVar2.a(0);
        bVar2.a(0);
        cVar.invalidateSelf();
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(cVar);
        frameLayout.addView(imageView, gb1.i(32, 32, 17));
        frameLayout.setImportantForAccessibility(2);
        String string = LocaleController.getString(R.string.Refresh);
        p1 p1Var = new p1(21, this, h2Var);
        ArrayList e = r0.i0.e(r71Var);
        int i12 = 0;
        while (true) {
            if (i12 < e.size()) {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((s0.c) e.get(i12)).f47649a).getLabel())) {
                    i10 = ((s0.c) e.get(i12)).a();
                    break;
                }
                i12++;
            } else {
                int i13 = -1;
                int i14 = 0;
                while (true) {
                    int[] iArr = r0.i0.d;
                    if (i14 >= 32 || i13 != -1) {
                        break;
                    }
                    int i15 = iArr[i14];
                    boolean z11 = true;
                    for (int i16 = 0; i16 < e.size(); i16++) {
                        if (((s0.c) e.get(i16)).a() != i15) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 &= z10;
                    }
                    if (z11) {
                        i13 = i15;
                    }
                    i14++;
                }
                i10 = i13;
            }
        }
        if (i10 != -1) {
            s0.c cVar2 = new s0.c(null, i10, string, p1Var, null);
            View.AccessibilityDelegate d = r0.i0.d(r71Var);
            if (d != null) {
                if (d instanceof r0.a) {
                    bVar = ((r0.a) d).f47072a;
                } else {
                    bVar = new r0.b(d);
                }
            }
            r0.i0.k(r71Var, bVar == null ? new r0.b() : bVar);
            int a2 = cVar2.a();
            ArrayList e10 = r0.i0.e(r71Var);
            int i17 = 0;
            while (true) {
                if (i17 >= e10.size()) {
                    break;
                } else if (((s0.c) e10.get(i17)).a() == a2) {
                    e10.remove(i17);
                    break;
                } else {
                    i17++;
                }
            }
            r0.i0.e(r71Var).add(cVar2);
            r0.i0.g(0, r71Var);
        }
        b();
    }

    public final void a(boolean z10) {
        this.v = false;
        this.f34566w = false;
        this.f34568y = -1;
        getParent().requestDisallowInterceptTouchEvent(false);
        if (z10) {
            setRefreshing(true);
            this.f34562f.run();
            return;
        }
        setRefreshing(false);
    }

    public final void b() {
        FrameLayout frameLayout = this.d;
        frameLayout.setVisibility(4);
        frameLayout.setTranslationY(-AndroidUtilities.dp(48.0f));
        frameLayout.setAlpha(0.0f);
        this.e.stop();
        this.f34565s = 0.0f;
        this.f34561c.setTranslationY(0.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f34567x) {
            w4.c cVar = this.e;
            if (!cVar.d.isRunning()) {
                cVar.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        this.e.stop();
        this.d.animate().cancel();
        this.f34561c.animate().cancel();
        this.v = false;
        this.f34566w = false;
        this.f34568y = -1;
        if (!this.f34567x) {
            b();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wz.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f34566w) {
            return super.onTouchEvent(motionEvent);
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.f34568y);
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = false;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3 && actionMasked != 5 && actionMasked != 6) {
                    return true;
                }
                a(false);
                return true;
            } else if (findPointerIndex < 0) {
                a(false);
                return true;
            } else {
                this.f34565s = Math.min(AndroidUtilities.dp(112.0f), Math.max(0.0f, ((motionEvent.getY(findPointerIndex) - this.f34564r) - this.h) * 0.5f));
                FrameLayout frameLayout = this.d;
                frameLayout.animate().cancel();
                frameLayout.setVisibility(0);
                frameLayout.setAlpha(Math.min(1.0f, this.f34565s / AndroidUtilities.dp(48.0f)));
                frameLayout.setTranslationY((this.f34565s - AndroidUtilities.dp(40.0f)) / 2.0f);
                View view = this.f34561c;
                view.animate().cancel();
                view.setTranslationY(this.f34565s);
                float max = (Math.max(Math.min(1.0f, this.f34565s / AndroidUtilities.dp(72.0f)) - 0.4f, 0.0f) * 5.0f) / 3.0f;
                w4.c cVar = this.e;
                w4.b bVar = cVar.f50797a;
                w4.b bVar2 = cVar.f50797a;
                if (!bVar.f50787n) {
                    bVar.f50787n = true;
                }
                cVar.invalidateSelf();
                if (max != bVar2.f50789p) {
                    bVar2.f50789p = max;
                }
                cVar.invalidateSelf();
                bVar2.e = 0.0f;
                bVar2.f50780f = 0.8f * max;
                cVar.invalidateSelf();
                bVar2.f50781g = org.telegram.ui.d3.e(max, 0.4f, -0.25f, 0.5f, Math.max(0.0f, this.f34565s - AndroidUtilities.dp(72.0f)) / AndroidUtilities.dp(80.0f));
                cVar.invalidateSelf();
                return true;
            }
        }
        if (this.f34565s >= AndroidUtilities.dp(72.0f)) {
            z10 = true;
        }
        a(z10);
        return true;
    }

    public void setRefreshing(boolean z10) {
        boolean z11 = this.f34567x;
        this.f34567x = z10;
        FrameLayout frameLayout = this.d;
        frameLayout.animate().cancel();
        View view = this.f34561c;
        view.animate().cancel();
        if (z10) {
            frameLayout.setVisibility(0);
            if (!z11) {
                this.e.start();
            }
            frameLayout.animate().translationY(AndroidUtilities.dp(16.0f)).alpha(1.0f).setDuration(180L).start();
            view.animate().translationY(AndroidUtilities.dp(72.0f)).setDuration(180L).start();
            return;
        }
        view.animate().translationY(0.0f).setDuration(180L).start();
        frameLayout.animate().translationY(-AndroidUtilities.dp(20.0f)).alpha(0.0f).setDuration(180L).withEndAction(new bq(this, 18)).start();
    }

    @Override
    public final void updateColors() {
        w4.c cVar = this.e;
        if (cVar != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.f34559a);
                if (w02 != this.f34560b) {
                    this.f34560b = w02;
                    w4.b bVar = cVar.f50797a;
                    bVar.f50782i = new int[]{w02};
                    bVar.a(0);
                    bVar.a(0);
                    cVar.invalidateSelf();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
