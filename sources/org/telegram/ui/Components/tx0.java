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
public abstract class tx0 extends lm0 implements org.telegram.ui.ActionBar.b6 {
    public static final rx0 y3 = new CacheFetcher();
    public static final sx0 f30910z3 = new CacheFetcher();
    public float Y2;
    public px0[] Z2;
    public final kx0 f30911a3;
    public final d6 f30912b3;
    public Drawable f30913c3;
    public Drawable f30914d3;
    public Paint f30915e3;
    public final Paint f30916f3;
    public int f30917g3;
    public int f30918h3;
    public Utilities.Callback f30919i3;
    public Utilities.Callback f30920j3;
    public boolean f30921k3;
    public boolean f30922l3;
    public ai.jc f30923m3;
    public int f30924n3;
    public Utilities.Callback f30925o3;
    public float f30926p3;
    public ValueAnimator f30927q3;
    public boolean f30928r3;
    public final d6 f30929s3;
    public final d6 f30930t3;
    public final RectF f30931u3;
    public final RectF f30932v3;
    public final RectF f30933w3;
    public boolean f30934x3;

    static {
        new HashSet();
    }

    public tx0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.Y2 = 6.5f;
        this.Z2 = null;
        zr zrVar = zr.h;
        this.f30912b3 = new d6(this, 360L, zrVar);
        Paint paint = new Paint(1);
        this.f30916f3 = paint;
        this.f30924n3 = -1;
        this.f30926p3 = 0.0f;
        this.f30928r3 = true;
        this.f30929s3 = new d6(this, 350L, zrVar);
        this.f30930t3 = new d6(this, 350L, zrVar);
        this.f30931u3 = new RectF();
        this.f30932v3 = new RectF();
        this.f30933w3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        kx0 kx0Var = new kx0(this);
        this.f30911a3 = kx0Var;
        setAdapter(kx0Var);
        s4.b0 b0Var = new s4.b0();
        setLayoutManager(b0Var);
        b0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.ActionBar.r6.m(this, 20, i11, g6Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i11, this.f28396n2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        y3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ei.c9(this, currentTimeMillis, 2));
    }

    public static void D1(tx0 tx0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        tx0Var.Z2 = new px0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            px0[] px0VarArr = tx0Var.Z2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f29687c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f29685a = "premium";
            } else {
                obj.f29685a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f29686b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            px0VarArr[i10] = obj;
        }
        tx0Var.Z2 = tx0Var.H1(tx0Var.Z2);
        tx0Var.f30911a3.l();
        tx0Var.setCategoriesShownT(0.0f);
        boolean z11 = tx0Var.f30928r3;
        if (System.currentTimeMillis() - j10 > 16) {
            z10 = true;
        }
        tx0Var.M1(z11, z10);
    }

    public static void E1(tx0 tx0Var, float f7) {
        tx0Var.setCategoriesShownT(f7);
    }

    public static void F1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof ox0) {
            ox0 ox0Var = (ox0) view;
            f7 = com.google.android.gms.internal.play_billing.k3.y(1.0f, ox0Var.E, 0.15f, 0.85f) * ox0Var.f29426y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof ox0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f30917g3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f30926p3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ox0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((ox0) childAt).j();
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
        int dp = (AndroidUtilities.dp(34.0f) * this.f30924n3) + ((-getScrollToStartWidth()) - Math.max(0, this.f30918h3));
        scrollBy(dp, 0);
        post(new c2((ei.g2) this, dp, 12));
    }

    public final void J1() {
        v0(-getScrollToStartWidth(), 0, zr.h);
    }

    public void K1(int i10) {
        boolean z10;
        if (this.f30924n3 < 0 && i10 >= 0) {
            this.f30930t3.d(i10, true);
        }
        this.f30924n3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof ox0) {
                int R = RecyclerView.R(childAt);
                ox0 ox0Var = (ox0) childAt;
                if (this.f30924n3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ox0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void L1(px0 px0Var) {
        int i10;
        if (this.Z2 != null) {
            i10 = 0;
            while (true) {
                px0[] px0VarArr = this.Z2;
                if (i10 >= px0VarArr.length) {
                    break;
                } else if (px0VarArr[i10] == px0Var) {
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
        this.f30928r3 = z10;
        ?? r52 = z10;
        if (this.Z2 == null) {
            r52 = 0;
        }
        if (this.f30926p3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f30927q3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f30927q3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f30926p3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f30927q3 = ofFloat;
            ofFloat.addUpdateListener(new b80(this, 24));
            this.f30927q3.addListener(new g60(this, 23));
            this.f30927q3.setInterpolator(zr.h);
            ValueAnimator valueAnimator2 = this.f30927q3;
            px0[] px0VarArr = this.Z2;
            if (px0VarArr == null) {
                length = 5;
            } else {
                length = px0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f30927q3.start();
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
            if (!(E instanceof ox0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tx0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f30924n3;
    }

    public px0 getSelectedCategory() {
        int i10;
        px0[] px0VarArr = this.Z2;
        if (px0VarArr != null && (i10 = this.f30924n3) >= 0 && i10 < px0VarArr.length) {
            return px0VarArr[i10];
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
            if (childAt instanceof ox0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f30918h3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f30921k3;
        if (z12 != z11) {
            this.f30921k3 = z11;
            Utilities.Callback callback2 = this.f30919i3;
            if (callback2 != null) {
                if (z11) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.f30917g3 - this.f30918h3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z12 && (callback = this.f30919i3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f30917g3 - this.f30918h3))));
        }
        if (this.f30922l3 != z10) {
            this.f30922l3 = z10;
            Utilities.Callback callback3 = this.f30920j3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        M1(this.f30928r3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ai.jc jcVar = this.f30923m3;
        if (jcVar != null) {
            jcVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f30915e3 == null) {
            this.f30915e3 = new Paint(1);
        }
        this.f30915e3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.f30913c3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f30914d3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f30918h3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<px0> callback) {
        this.f30925o3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f30920j3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f30919i3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.Y2 = f7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f30916f3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21273i6, this.f28396n2));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public px0[] H1(px0[] px0VarArr) {
        return px0VarArr;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
