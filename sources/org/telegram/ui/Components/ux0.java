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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class ux0 extends mm0 implements org.telegram.ui.ActionBar.b6 {
    public static final sx0 y3 = new CacheFetcher();
    public static final tx0 f31230z3 = new CacheFetcher();
    public float Y2;
    public qx0[] Z2;
    public final lx0 f31231a3;
    public final f6 f31232b3;
    public Drawable f31233c3;
    public Drawable f31234d3;
    public Paint f31235e3;
    public final Paint f31236f3;
    public int f31237g3;
    public int f31238h3;
    public Utilities.Callback f31239i3;
    public Utilities.Callback f31240j3;
    public boolean f31241k3;
    public boolean f31242l3;
    public ai.jc f31243m3;
    public int f31244n3;
    public Utilities.Callback f31245o3;
    public float f31246p3;
    public ValueAnimator f31247q3;
    public boolean f31248r3;
    public final f6 f31249s3;
    public final f6 f31250t3;
    public final RectF f31251u3;
    public final RectF f31252v3;
    public final RectF f31253w3;
    public boolean f31254x3;

    static {
        new HashSet();
    }

    public ux0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.Y2 = 6.5f;
        this.Z2 = null;
        bs bsVar = bs.h;
        this.f31232b3 = new f6(this, 360L, bsVar);
        Paint paint = new Paint(1);
        this.f31236f3 = paint;
        this.f31244n3 = -1;
        this.f31246p3 = 0.0f;
        this.f31248r3 = true;
        this.f31249s3 = new f6(this, 350L, bsVar);
        this.f31250t3 = new f6(this, 350L, bsVar);
        this.f31251u3 = new RectF();
        this.f31252v3 = new RectF();
        this.f31253w3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        lx0 lx0Var = new lx0(this);
        this.f31231a3 = lx0Var;
        setAdapter(lx0Var);
        s4.b0 b0Var = new s4.b0();
        setLayoutManager(b0Var);
        b0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.k6.f21272i6;
        org.telegram.ui.ActionBar.r6.m(this, 20, i11, g6Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i11, this.f28705n2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        y3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ei.c9(this, currentTimeMillis, 2));
    }

    public static void D1(ux0 ux0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        ux0Var.Z2 = new qx0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            qx0[] qx0VarArr = ux0Var.Z2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f30026c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f30024a = "premium";
            } else {
                obj.f30024a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f30025b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            qx0VarArr[i10] = obj;
        }
        ux0Var.Z2 = ux0Var.H1(ux0Var.Z2);
        ux0Var.f31231a3.l();
        ux0Var.setCategoriesShownT(0.0f);
        boolean z11 = ux0Var.f31248r3;
        if (System.currentTimeMillis() - j10 > 16) {
            z10 = true;
        }
        ux0Var.M1(z11, z10);
    }

    public static void E1(ux0 ux0Var, float f7) {
        ux0Var.setCategoriesShownT(f7);
    }

    public static void F1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof px0) {
            px0 px0Var = (px0) view;
            f7 = com.google.android.gms.internal.play_billing.k3.y(1.0f, px0Var.E, 0.15f, 0.85f) * px0Var.f29693y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof px0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f31237g3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f31246p3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof px0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((px0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public abstract boolean G1();

    public final void I1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f31244n3) + ((-getScrollToStartWidth()) - Math.max(0, this.f31238h3));
        scrollBy(dp, 0);
        post(new d2((ei.g2) this, dp, 12));
    }

    public final void J1() {
        v0(-getScrollToStartWidth(), 0, bs.h);
    }

    public void K1(int i10) {
        boolean z10;
        if (this.f31244n3 < 0 && i10 >= 0) {
            this.f31250t3.d(i10, true);
        }
        this.f31244n3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof px0) {
                int R = RecyclerView.R(childAt);
                px0 px0Var = (px0) childAt;
                if (this.f31244n3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                px0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void L1(qx0 qx0Var) {
        int i10;
        if (this.Z2 != null) {
            i10 = 0;
            while (true) {
                qx0[] qx0VarArr = this.Z2;
                if (i10 >= qx0VarArr.length) {
                    break;
                } else if (qx0VarArr[i10] == qx0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            K1(i10);
        }
        i10 = -1;
        K1(i10);
    }

    public final void M1(boolean z10, boolean z11) {
        int length;
        this.f31248r3 = z10;
        ?? r52 = z10;
        if (this.Z2 == null) {
            r52 = 0;
        }
        if (this.f31246p3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f31247q3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f31247q3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f31246p3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f31247q3 = ofFloat;
            ofFloat.addUpdateListener(new d80(this, 24));
            this.f31247q3.addListener(new i60(this, 23));
            this.f31247q3.setInterpolator(bs.h);
            ValueAnimator valueAnimator2 = this.f31247q3;
            qx0[] qx0VarArr = this.Z2;
            if (qx0VarArr == null) {
                length = 5;
            } else {
                length = qx0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f31247q3.start();
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
            if (!(E instanceof px0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ux0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f31244n3;
    }

    public qx0 getSelectedCategory() {
        int i10;
        qx0[] qx0VarArr = this.Z2;
        if (qx0VarArr != null && (i10 = this.f31244n3) >= 0 && i10 < qx0VarArr.length) {
            return qx0VarArr[i10];
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
            if (childAt instanceof px0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f31238h3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f31241k3;
        if (z12 != z11) {
            this.f31241k3 = z11;
            Utilities.Callback callback2 = this.f31239i3;
            if (callback2 != null) {
                if (z11) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.f31237g3 - this.f31238h3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z12 && (callback = this.f31239i3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f31237g3 - this.f31238h3))));
        }
        if (this.f31242l3 != z10) {
            this.f31242l3 = z10;
            Utilities.Callback callback3 = this.f31240j3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        M1(this.f31248r3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ai.jc jcVar = this.f31243m3;
        if (jcVar != null) {
            jcVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f31235e3 == null) {
            this.f31235e3 = new Paint(1);
        }
        this.f31235e3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.f31233c3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f31234d3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f31238h3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<qx0> callback) {
        this.f31245o3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f31240j3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f31239i3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.Y2 = f7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f31236f3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21272i6, this.f28705n2));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public qx0[] H1(qx0[] qx0VarArr) {
        return qx0VarArr;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
