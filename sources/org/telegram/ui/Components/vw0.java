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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheFetcher;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class vw0 extends ml0 {
    public static final tw0 f29407x3 = new CacheFetcher();
    public static final uw0 y3 = new CacheFetcher();
    public float X2;
    public rw0[] Y2;
    public final mw0 Z2;
    public final e6 f29408a3;
    public Drawable f29409b3;
    public Drawable f29410c3;
    public Paint f29411d3;
    public final Paint f29412e3;
    public int f29413f3;
    public int f29414g3;
    public Utilities.Callback f29415h3;
    public Utilities.Callback f29416i3;
    public boolean j3;
    public boolean f29417k3;
    public ci.bb f29418l3;
    public int f29419m3;
    public Utilities.Callback f29420n3;
    public float f29421o3;
    public ValueAnimator f29422p3;
    public boolean f29423q3;
    public final e6 f29424r3;
    public final e6 f29425s3;
    public final RectF f29426t3;
    public final RectF f29427u3;
    public final RectF f29428v3;
    public boolean f29429w3;

    static {
        new HashSet();
    }

    public vw0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.X2 = 6.5f;
        this.Y2 = null;
        rr rrVar = rr.h;
        this.f29408a3 = new e6(this, 360L, rrVar);
        Paint paint = new Paint(1);
        this.f29412e3 = paint;
        this.f29419m3 = -1;
        this.f29421o3 = 0.0f;
        this.f29423q3 = true;
        this.f29424r3 = new e6(this, 350L, rrVar);
        this.f29425s3 = new e6(this, 350L, rrVar);
        this.f29426t3 = new RectF();
        this.f29427u3 = new RectF();
        this.f29428v3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        mw0 mw0Var = new mw0(this);
        this.Z2 = mw0Var;
        setAdapter(mw0Var);
        s4.c0 c0Var = new s4.c0();
        setLayoutManager(c0Var);
        c0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.h6.f18878i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(i11, this.f26222p2));
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(i11, this.f26222p2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        f29407x3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ci.p9(this, currentTimeMillis, 2));
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof qw0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f29413f3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f29421o3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof qw0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((qw0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void x1(vw0 vw0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        vw0Var.Y2 = new rw0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            rw0[] rw0VarArr = vw0Var.Y2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f27739c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f27737a = "premium";
            } else {
                obj.f27737a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f27738b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            rw0VarArr[i10] = obj;
        }
        vw0Var.Y2 = vw0Var.B1(vw0Var.Y2);
        vw0Var.Z2.l();
        vw0Var.setCategoriesShownT(0.0f);
        boolean z11 = vw0Var.f29423q3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        vw0Var.G1(z11, z10);
    }

    public static void y1(vw0 vw0Var, float f7) {
        vw0Var.setCategoriesShownT(f7);
    }

    public static void z1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof qw0) {
            qw0 qw0Var = (qw0) view;
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, qw0Var.E, 0.15f, 0.85f) * qw0Var.f27475y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    public abstract boolean A1();

    public final void C1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f29419m3) + ((-getScrollToStartWidth()) - Math.max(0, this.f29414g3));
        scrollBy(dp, 0);
        post(new kd((ci.k2) this, dp, 10));
    }

    public final void D1() {
        v0(-getScrollToStartWidth(), 0, rr.h);
    }

    public void E1(int i10) {
        boolean z10;
        if (this.f29419m3 < 0 && i10 >= 0) {
            this.f29425s3.d(i10, true);
        }
        this.f29419m3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof qw0) {
                int R = RecyclerView.R(childAt);
                qw0 qw0Var = (qw0) childAt;
                if (this.f29419m3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qw0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void F1(rw0 rw0Var) {
        int i10;
        if (this.Y2 != null) {
            i10 = 0;
            while (true) {
                rw0[] rw0VarArr = this.Y2;
                if (i10 >= rw0VarArr.length) {
                    break;
                } else if (rw0VarArr[i10] == rw0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            E1(i10);
        }
        i10 = -1;
        E1(i10);
    }

    public final void G1(boolean z10, boolean z11) {
        int length;
        this.f29423q3 = z10;
        ?? r52 = z10;
        if (this.Y2 == null) {
            r52 = 0;
        }
        if (this.f29421o3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f29422p3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f29422p3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f29421o3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f29422p3 = ofFloat;
            ofFloat.addUpdateListener(new i70(this, 23));
            this.f29422p3.addListener(new jd0(this, 16));
            this.f29422p3.setInterpolator(rr.h);
            ValueAnimator valueAnimator2 = this.f29422p3;
            rw0[] rw0VarArr = this.Y2;
            if (rw0VarArr == null) {
                length = 5;
            } else {
                length = rw0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f29422p3.start();
            return;
        }
        if (r52 != 0) {
            f7 = 1.0f;
        }
        setCategoriesShownT(f7);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof qw0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vw0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f29419m3;
    }

    public rw0 getSelectedCategory() {
        int i10;
        rw0[] rw0VarArr = this.Y2;
        if (rw0VarArr != null && (i10 = this.f29419m3) >= 0 && i10 < rw0VarArr.length) {
            return rw0VarArr[i10];
        }
        return null;
    }

    @Override
    public final void k0(int i10, int i11) {
        boolean z10;
        boolean z11;
        Utilities.Callback callback;
        int i12 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z11 = true;
            if (childAt instanceof qw0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f29414g3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.j3;
        if (z12 != z11) {
            this.j3 = z11;
            Utilities.Callback callback2 = this.f29415h3;
            if (callback2 != null) {
                if (z11) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.f29413f3 - this.f29414g3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z12 && (callback = this.f29415h3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f29413f3 - this.f29414g3))));
        }
        if (this.f29417k3 != z10) {
            this.f29417k3 = z10;
            Utilities.Callback callback3 = this.f29416i3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        G1(this.f29423q3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci.bb bbVar = this.f29418l3;
        if (bbVar != null) {
            bbVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f29411d3 == null) {
            this.f29411d3 = new Paint(1);
        }
        this.f29411d3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.f29409b3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f29410c3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f29414g3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<rw0> callback) {
        this.f29420n3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f29416i3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f29415h3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.X2 = f7;
    }

    public rw0[] B1(rw0[] rw0VarArr) {
        return rw0VarArr;
    }
}
