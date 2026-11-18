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
public abstract class iv0 extends ck0 implements org.telegram.ui.ActionBar.c6 {
    public static final gv0 F3 = new org.telegram.messenger.y2();
    public static final hv0 G3 = new org.telegram.messenger.y2();
    public final c6 A3;
    public final RectF B3;
    public final RectF C3;
    public final RectF D3;
    public boolean E3;
    public float f36211f3;
    public ev0[] f36212g3;
    public final zu0 f36213h3;
    public final c6 f36214i3;
    public Drawable j3;
    public Drawable f36215k3;
    public Paint f36216l3;
    public final Paint f36217m3;
    public int f36218n3;
    public int f36219o3;
    public org.telegram.messenger.x10 f36220p3;
    public org.telegram.messenger.x10 f36221q3;
    public boolean f36222r3;
    public boolean f36223s3;
    public bi.i3 f36224t3;
    public int f36225u3;
    public org.telegram.messenger.x10 f36226v3;
    public float f36227w3;
    public ValueAnimator f36228x3;
    public boolean f36229y3;
    public final c6 f36230z3;

    static {
        new HashSet();
    }

    public iv0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f36211f3 = 6.5f;
        this.f36212g3 = null;
        lr lrVar = lr.h;
        this.f36214i3 = new c6(this, 360L, lrVar);
        Paint paint = new Paint(1);
        this.f36217m3 = paint;
        this.f36225u3 = -1;
        this.f36227w3 = 0.0f;
        this.f36229y3 = true;
        this.f36230z3 = new c6(this, 350L, lrVar);
        this.A3 = new c6(this, 350L, lrVar);
        this.B3 = new RectF();
        this.C3 = new RectF();
        this.D3 = new RectF();
        setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
        zu0 zu0Var = new zu0(this);
        this.f36213h3 = zu0Var;
        setAdapter(zu0Var);
        v4.c0 c0Var = new v4.c0();
        setLayoutManager(c0Var);
        c0Var.j1(0);
        setSelectorRadius(org.telegram.messenger.g0.L(15.0f));
        setSelectorType(1);
        int i10 = org.telegram.ui.ActionBar.n6.f29488i6;
        org.telegram.ui.ActionBar.u6.l(this, 20, i10, i6Var);
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(i10, this.f34074o2));
        setWillNotDraw(false);
        setOnItemClickListener(new n(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        F3.c(org.telegram.messenger.j10.f24773t0, Integer.valueOf(i7), new hi.d8(this, currentTimeMillis, 3));
    }

    public static void A1(iv0 iv0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        iv0Var.f36212g3 = new ev0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i7 = 0; i7 < tL_messages_emojiGroups.groups.size(); i7++) {
            ev0[] ev0VarArr = iv0Var.f36212g3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i7);
            ?? obj = new Object();
            obj.f34810c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f34808a = "premium";
            } else {
                obj.f34808a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f34809b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            ev0VarArr[i7] = obj;
        }
        iv0Var.f36212g3 = iv0Var.E1(iv0Var.f36212g3);
        iv0Var.f36213h3.f();
        iv0Var.setCategoriesShownT(0.0f);
        boolean z11 = iv0Var.f36229y3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        iv0Var.J1(z11, z10);
    }

    public static void B1(iv0 iv0Var, float f10) {
        iv0Var.setCategoriesShownT(f10);
    }

    public static void C1(View view, RectF rectF) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f10 = 1.0f;
        float width = (view.getWidth() / 2.0f) - org.telegram.messenger.g0.L(1.0f);
        if (view instanceof dv0) {
            dv0 dv0Var = (dv0) view;
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, dv0Var.F, 0.15f, 0.85f) * dv0Var.E;
        }
        float f11 = width * f10;
        rectF.set(left - f11, top - f11, left + f11, top + f11);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof dv0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f36218n3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f10) {
        this.f36227w3 = f10;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof dv0) {
                float s5 = org.telegram.messenger.g0.s(f10, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s5 > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((dv0) childAt).j();
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
        int L = (org.telegram.messenger.g0.L(34.0f) * this.f36225u3) + ((-getScrollToStartWidth()) - Math.max(0, this.f36219o3));
        scrollBy(L, 0);
        post(new ap0((hi.d2) this, L));
    }

    public final void G1() {
        w0(-getScrollToStartWidth(), 0, lr.h);
    }

    public void H1(int i7) {
        boolean z10;
        if (this.f36225u3 < 0 && i7 >= 0) {
            this.A3.e(true, i7);
        }
        this.f36225u3 = i7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof dv0) {
                int R = RecyclerView.R(childAt);
                dv0 dv0Var = (dv0) childAt;
                if (this.f36225u3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dv0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void I1(ev0 ev0Var) {
        int i7;
        if (this.f36212g3 != null) {
            i7 = 0;
            while (true) {
                ev0[] ev0VarArr = this.f36212g3;
                if (i7 >= ev0VarArr.length) {
                    break;
                } else if (ev0VarArr[i7] == ev0Var) {
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
        this.f36229y3 = z10;
        ?? r52 = z10;
        if (this.f36212g3 == null) {
            r52 = 0;
        }
        if (this.f36227w3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f36228x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36228x3 = null;
        }
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f36227w3;
            if (r52 != 0) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f36228x3 = ofFloat;
            ofFloat.addUpdateListener(new e60(this, 23));
            this.f36228x3.addListener(new q60(this, 23));
            this.f36228x3.setInterpolator(lr.h);
            ValueAnimator valueAnimator2 = this.f36228x3;
            ev0[] ev0VarArr = this.f36212g3;
            if (ev0VarArr == null) {
                length = 5;
            } else {
                length = ev0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f36228x3.start();
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
            if (!(E instanceof dv0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iv0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f36225u3;
    }

    public ev0 getSelectedCategory() {
        int i7;
        ev0[] ev0VarArr = this.f36212g3;
        if (ev0VarArr != null && (i7 = this.f36225u3) >= 0 && i7 < ev0VarArr.length) {
            return ev0VarArr[i7];
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
            if (childAt instanceof dv0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f36219o3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f36222r3;
        if (z12 != z11) {
            this.f36222r3 = z11;
            org.telegram.messenger.x10 x10Var2 = this.f36220p3;
            if (x10Var2 != null) {
                if (z11) {
                    i10 = Math.max(0, getScrollToStartWidth() - (this.f36218n3 - this.f36219o3));
                }
                x10Var2.a(Integer.valueOf(i10));
            }
            invalidate();
        } else if (z12 && (x10Var = this.f36220p3) != null) {
            x10Var.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f36218n3 - this.f36219o3))));
        }
        if (this.f36223s3 != z10) {
            this.f36223s3 = z10;
            org.telegram.messenger.x10 x10Var3 = this.f36221q3;
            if (x10Var3 != null) {
                x10Var3.a(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.f36229y3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bi.i3 i3Var = this.f36224t3;
        if (i3Var != null) {
            i3Var.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        if (this.f36216l3 == null) {
            this.f36216l3 = new Paint(1);
        }
        this.f36216l3.setColor(i7);
        Drawable mutate = getContext().getResources().getDrawable(2131231227).mutate();
        this.j3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i7, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231226).mutate();
        this.f36215k3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i7, mode));
    }

    public void setDontOccupyWidth(int i7) {
        this.f36219o3 = i7;
    }

    public void setOnCategoryClick(org.telegram.messenger.x10 x10Var) {
        this.f36226v3 = x10Var;
    }

    public void setOnScrollFully(org.telegram.messenger.x10 x10Var) {
        this.f36221q3 = x10Var;
    }

    public void setOnScrollIntoOccupiedWidth(org.telegram.messenger.x10 x10Var) {
        this.f36220p3 = x10Var;
    }

    public void setShownButtonsAtStart(float f10) {
        this.f36211f3 = f10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f36217m3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29488i6, this.f34074o2));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public ev0[] E1(ev0[] ev0VarArr) {
        return ev0VarArr;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
