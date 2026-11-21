package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class lv0 extends ek0 implements org.telegram.ui.ActionBar.b6 {
    public static final jv0 F3 = new org.telegram.messenger.y2();
    public static final kv0 G3 = new org.telegram.messenger.y2();
    public final d6 A3;
    public final RectF B3;
    public final RectF C3;
    public final RectF D3;
    public boolean E3;
    public float f37285f3;
    public hv0[] f37286g3;
    public final cv0 f37287h3;
    public final d6 f37288i3;
    public Drawable j3;
    public Drawable f37289k3;
    public Paint f37290l3;
    public final Paint f37291m3;
    public int f37292n3;
    public int f37293o3;
    public org.telegram.messenger.x10 f37294p3;
    public org.telegram.messenger.x10 f37295q3;
    public boolean f37296r3;
    public boolean f37297s3;
    public bi.m3 f37298t3;
    public int f37299u3;
    public org.telegram.messenger.x10 f37300v3;
    public float f37301w3;
    public ValueAnimator f37302x3;
    public boolean f37303y3;
    public final d6 f37304z3;

    static {
        new HashSet();
    }

    public lv0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f37285f3 = 6.5f;
        this.f37286g3 = null;
        nr nrVar = nr.h;
        this.f37288i3 = new d6(this, 360L, nrVar);
        Paint paint = new Paint(1);
        this.f37291m3 = paint;
        this.f37299u3 = -1;
        this.f37301w3 = 0.0f;
        this.f37303y3 = true;
        this.f37304z3 = new d6(this, 350L, nrVar);
        this.A3 = new d6(this, 350L, nrVar);
        this.B3 = new RectF();
        this.C3 = new RectF();
        this.D3 = new RectF();
        setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
        cv0 cv0Var = new cv0(this);
        this.f37287h3 = cv0Var;
        setAdapter(cv0Var);
        v4.c0 c0Var = new v4.c0();
        setLayoutManager(c0Var);
        c0Var.j1(0);
        setSelectorRadius(org.telegram.messenger.g0.L(15.0f));
        setSelectorType(1);
        int i10 = org.telegram.ui.ActionBar.m6.f29470i6;
        org.telegram.ui.ActionBar.t6.l(this, 20, i10, h6Var);
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, this.f34875o2));
        setWillNotDraw(false);
        setOnItemClickListener(new o(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        F3.c(org.telegram.messenger.j10.f24798t0, Integer.valueOf(i7), new hi.c8(this, currentTimeMillis, 3));
    }

    public static void A1(lv0 lv0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        lv0Var.f37286g3 = new hv0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i7 = 0; i7 < tL_messages_emojiGroups.groups.size(); i7++) {
            hv0[] hv0VarArr = lv0Var.f37286g3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i7);
            ?? obj = new Object();
            obj.f35986c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f35984a = "premium";
            } else {
                obj.f35984a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f35985b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            hv0VarArr[i7] = obj;
        }
        lv0Var.f37286g3 = lv0Var.E1(lv0Var.f37286g3);
        lv0Var.f37287h3.f();
        lv0Var.setCategoriesShownT(0.0f);
        boolean z11 = lv0Var.f37303y3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        lv0Var.J1(z11, z10);
    }

    public static void B1(lv0 lv0Var, float f10) {
        lv0Var.setCategoriesShownT(f10);
    }

    public static void C1(View view, RectF rectF) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f10 = 1.0f;
        float width = (view.getWidth() / 2.0f) - org.telegram.messenger.g0.L(1.0f);
        if (view instanceof gv0) {
            gv0 gv0Var = (gv0) view;
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, gv0Var.F, 0.15f, 0.85f) * gv0Var.E;
        }
        float f11 = width * f10;
        rectF.set(left - f11, top - f11, left + f11, top + f11);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof gv0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f37292n3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f10) {
        this.f37301w3 = f10;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof gv0) {
                float s5 = org.telegram.messenger.g0.s(f10, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s5 > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((gv0) childAt).j();
                }
                childAt.setAlpha(s5);
                childAt.setScaleX(s5);
                childAt.setScaleY(s5);
            }
        }
        invalidate();
    }

    public abstract boolean D1();

    public final void F1() {
        int L = (org.telegram.messenger.g0.L(34.0f) * this.f37299u3) + ((-getScrollToStartWidth()) - Math.max(0, this.f37293o3));
        scrollBy(L, 0);
        post(new cp0((hi.c2) this, L));
    }

    public final void G1() {
        w0(-getScrollToStartWidth(), 0, nr.h);
    }

    public void H1(int i7) {
        boolean z10;
        if (this.f37299u3 < 0 && i7 >= 0) {
            this.A3.e(true, i7);
        }
        this.f37299u3 = i7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof gv0) {
                int R = RecyclerView.R(childAt);
                gv0 gv0Var = (gv0) childAt;
                if (this.f37299u3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gv0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void I1(hv0 hv0Var) {
        int i7;
        if (this.f37286g3 != null) {
            i7 = 0;
            while (true) {
                hv0[] hv0VarArr = this.f37286g3;
                if (i7 >= hv0VarArr.length) {
                    break;
                } else if (hv0VarArr[i7] == hv0Var) {
                    break;
                } else {
                    i7++;
                }
            }
            H1(i7);
        }
        i7 = -1;
        H1(i7);
    }

    public final void J1(boolean z10, boolean z11) {
        int length;
        this.f37303y3 = z10;
        ?? r52 = z10;
        if (this.f37286g3 == null) {
            r52 = 0;
        }
        if (this.f37301w3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f37302x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37302x3 = null;
        }
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f37301w3;
            if (r52 != 0) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f37302x3 = ofFloat;
            ofFloat.addUpdateListener(new h60(this, 23));
            this.f37302x3.addListener(new s60(this, 23));
            this.f37302x3.setInterpolator(nr.h);
            ValueAnimator valueAnimator2 = this.f37302x3;
            hv0[] hv0VarArr = this.f37286g3;
            if (hv0VarArr == null) {
                length = 5;
            } else {
                length = hv0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f37302x3.start();
            return;
        }
        if (r52 != 0) {
            f10 = 1.0f;
        }
        setCategoriesShownT(f10);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof gv0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lv0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f37299u3;
    }

    public hv0 getSelectedCategory() {
        int i7;
        hv0[] hv0VarArr = this.f37286g3;
        if (hv0VarArr != null && (i7 = this.f37299u3) >= 0 && i7 < hv0VarArr.length) {
            return hv0VarArr[i7];
        }
        return null;
    }

    @Override
    public final void l0(int i7) {
        boolean z10;
        boolean z11;
        org.telegram.messenger.x10 x10Var;
        int i10 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z11 = true;
            if (childAt instanceof gv0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f37293o3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f37296r3;
        if (z12 != z11) {
            this.f37296r3 = z11;
            org.telegram.messenger.x10 x10Var2 = this.f37294p3;
            if (x10Var2 != null) {
                if (z11) {
                    i10 = Math.max(0, getScrollToStartWidth() - (this.f37292n3 - this.f37293o3));
                }
                x10Var2.a(Integer.valueOf(i10));
            }
            invalidate();
        } else if (z12 && (x10Var = this.f37294p3) != null) {
            x10Var.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f37292n3 - this.f37293o3))));
        }
        if (this.f37297s3 != z10) {
            this.f37297s3 = z10;
            org.telegram.messenger.x10 x10Var3 = this.f37295q3;
            if (x10Var3 != null) {
                x10Var3.a(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.f37303y3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bi.m3 m3Var = this.f37298t3;
        if (m3Var != null) {
            m3Var.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        if (this.f37290l3 == null) {
            this.f37290l3 = new Paint(1);
        }
        this.f37290l3.setColor(i7);
        Drawable mutate = getContext().getResources().getDrawable(2131231227).mutate();
        this.j3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i7, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231226).mutate();
        this.f37289k3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i7, mode));
    }

    public void setDontOccupyWidth(int i7) {
        this.f37293o3 = i7;
    }

    public void setOnCategoryClick(org.telegram.messenger.x10 x10Var) {
        this.f37300v3 = x10Var;
    }

    public void setOnScrollFully(org.telegram.messenger.x10 x10Var) {
        this.f37295q3 = x10Var;
    }

    public void setOnScrollIntoOccupiedWidth(org.telegram.messenger.x10 x10Var) {
        this.f37294p3 = x10Var;
    }

    public void setShownButtonsAtStart(float f10) {
        this.f37285f3 = f10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f37291m3.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29470i6, this.f34875o2));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public hv0[] E1(hv0[] hv0VarArr) {
        return hv0VarArr;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
