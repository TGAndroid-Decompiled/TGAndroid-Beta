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
public abstract class kv0 extends ek0 implements org.telegram.ui.ActionBar.c6 {
    public static final iv0 F3 = new org.telegram.messenger.y2();
    public static final jv0 G3 = new org.telegram.messenger.y2();
    public final c6 A3;
    public final RectF B3;
    public final RectF C3;
    public final RectF D3;
    public boolean E3;
    public float f36898f3;
    public gv0[] f36899g3;
    public final bv0 f36900h3;
    public final c6 f36901i3;
    public Drawable j3;
    public Drawable f36902k3;
    public Paint f36903l3;
    public final Paint f36904m3;
    public int f36905n3;
    public int f36906o3;
    public org.telegram.messenger.w10 f36907p3;
    public org.telegram.messenger.w10 f36908q3;
    public boolean f36909r3;
    public boolean f36910s3;
    public bi.o3 f36911t3;
    public int f36912u3;
    public org.telegram.messenger.w10 f36913v3;
    public float f36914w3;
    public ValueAnimator f36915x3;
    public boolean f36916y3;
    public final c6 f36917z3;

    static {
        new HashSet();
    }

    public kv0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f36898f3 = 6.5f;
        this.f36899g3 = null;
        kr krVar = kr.h;
        this.f36901i3 = new c6(this, 360L, krVar);
        Paint paint = new Paint(1);
        this.f36904m3 = paint;
        this.f36912u3 = -1;
        this.f36914w3 = 0.0f;
        this.f36916y3 = true;
        this.f36917z3 = new c6(this, 350L, krVar);
        this.A3 = new c6(this, 350L, krVar);
        this.B3 = new RectF();
        this.C3 = new RectF();
        this.D3 = new RectF();
        setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
        bv0 bv0Var = new bv0(this);
        this.f36900h3 = bv0Var;
        setAdapter(bv0Var);
        v4.c0 c0Var = new v4.c0();
        setLayoutManager(c0Var);
        c0Var.j1(0);
        setSelectorRadius(org.telegram.messenger.g0.L(15.0f));
        setSelectorType(1);
        int i10 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.ActionBar.u6.l(this, 20, i10, i6Var);
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(i10, this.f34767o2));
        setWillNotDraw(false);
        setOnItemClickListener(new n(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        F3.c(org.telegram.messenger.i10.f24637t0, Integer.valueOf(i7), new hi.x8(this, currentTimeMillis, 3));
    }

    public static void A1(kv0 kv0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        kv0Var.f36899g3 = new gv0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i7 = 0; i7 < tL_messages_emojiGroups.groups.size(); i7++) {
            gv0[] gv0VarArr = kv0Var.f36899g3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i7);
            ?? obj = new Object();
            obj.f35562c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f35560a = "premium";
            } else {
                obj.f35560a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f35561b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            gv0VarArr[i7] = obj;
        }
        kv0Var.f36899g3 = kv0Var.E1(kv0Var.f36899g3);
        kv0Var.f36900h3.f();
        kv0Var.setCategoriesShownT(0.0f);
        boolean z11 = kv0Var.f36916y3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        kv0Var.J1(z11, z10);
    }

    public static void B1(kv0 kv0Var, float f10) {
        kv0Var.setCategoriesShownT(f10);
    }

    public static void C1(View view, RectF rectF) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f10 = 1.0f;
        float width = (view.getWidth() / 2.0f) - org.telegram.messenger.g0.L(1.0f);
        if (view instanceof fv0) {
            fv0 fv0Var = (fv0) view;
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, fv0Var.F, 0.15f, 0.85f) * fv0Var.E;
        }
        float f11 = width * f10;
        rectF.set(left - f11, top - f11, left + f11, top + f11);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof fv0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f36905n3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f10) {
        this.f36914w3 = f10;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof fv0) {
                float s5 = org.telegram.messenger.g0.s(f10, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s5 > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((fv0) childAt).j();
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
        int L = (org.telegram.messenger.g0.L(34.0f) * this.f36912u3) + ((-getScrollToStartWidth()) - Math.max(0, this.f36906o3));
        scrollBy(L, 0);
        post(new bp0((hi.k2) this, L));
    }

    public final void G1() {
        w0(-getScrollToStartWidth(), 0, kr.h);
    }

    public void H1(int i7) {
        boolean z10;
        if (this.f36912u3 < 0 && i7 >= 0) {
            this.A3.e(true, i7);
        }
        this.f36912u3 = i7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof fv0) {
                int R = RecyclerView.R(childAt);
                fv0 fv0Var = (fv0) childAt;
                if (this.f36912u3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fv0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void I1(gv0 gv0Var) {
        int i7;
        if (this.f36899g3 != null) {
            i7 = 0;
            while (true) {
                gv0[] gv0VarArr = this.f36899g3;
                if (i7 >= gv0VarArr.length) {
                    break;
                } else if (gv0VarArr[i7] == gv0Var) {
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
        this.f36916y3 = z10;
        ?? r52 = z10;
        if (this.f36899g3 == null) {
            r52 = 0;
        }
        if (this.f36914w3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f36915x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36915x3 = null;
        }
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f36914w3;
            if (r52 != 0) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f36915x3 = ofFloat;
            ofFloat.addUpdateListener(new e60(this, 23));
            this.f36915x3.addListener(new p60(this, 23));
            this.f36915x3.setInterpolator(kr.h);
            ValueAnimator valueAnimator2 = this.f36915x3;
            gv0[] gv0VarArr = this.f36899g3;
            if (gv0VarArr == null) {
                length = 5;
            } else {
                length = gv0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f36915x3.start();
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
            if (!(E instanceof fv0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kv0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f36912u3;
    }

    public gv0 getSelectedCategory() {
        int i7;
        gv0[] gv0VarArr = this.f36899g3;
        if (gv0VarArr != null && (i7 = this.f36912u3) >= 0 && i7 < gv0VarArr.length) {
            return gv0VarArr[i7];
        }
        return null;
    }

    @Override
    public final void l0(int i7) {
        boolean z10;
        boolean z11;
        org.telegram.messenger.w10 w10Var;
        int i10 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z11 = true;
            if (childAt instanceof fv0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f36906o3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f36909r3;
        if (z12 != z11) {
            this.f36909r3 = z11;
            org.telegram.messenger.w10 w10Var2 = this.f36907p3;
            if (w10Var2 != null) {
                if (z11) {
                    i10 = Math.max(0, getScrollToStartWidth() - (this.f36905n3 - this.f36906o3));
                }
                w10Var2.a(Integer.valueOf(i10));
            }
            invalidate();
        } else if (z12 && (w10Var = this.f36907p3) != null) {
            w10Var.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f36905n3 - this.f36906o3))));
        }
        if (this.f36910s3 != z10) {
            this.f36910s3 = z10;
            org.telegram.messenger.w10 w10Var3 = this.f36908q3;
            if (w10Var3 != null) {
                w10Var3.a(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.f36916y3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bi.o3 o3Var = this.f36911t3;
        if (o3Var != null) {
            o3Var.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        if (this.f36903l3 == null) {
            this.f36903l3 = new Paint(1);
        }
        this.f36903l3.setColor(i7);
        Drawable mutate = getContext().getResources().getDrawable(2131231230).mutate();
        this.j3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i7, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231229).mutate();
        this.f36902k3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i7, mode));
    }

    public void setDontOccupyWidth(int i7) {
        this.f36906o3 = i7;
    }

    public void setOnCategoryClick(org.telegram.messenger.w10 w10Var) {
        this.f36913v3 = w10Var;
    }

    public void setOnScrollFully(org.telegram.messenger.w10 w10Var) {
        this.f36908q3 = w10Var;
    }

    public void setOnScrollIntoOccupiedWidth(org.telegram.messenger.w10 w10Var) {
        this.f36907p3 = w10Var;
    }

    public void setShownButtonsAtStart(float f10) {
        this.f36898f3 = f10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f36904m3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29543i6, this.f34767o2));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public gv0[] E1(gv0[] gv0VarArr) {
        return gv0VarArr;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
