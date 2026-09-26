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
public abstract class gx0 extends wl0 {
    public static final ex0 f24545x3 = new CacheFetcher();
    public static final fx0 y3 = new CacheFetcher();
    public float X2;
    public cx0[] Y2;
    public final xw0 Z2;
    public final e6 f24546a3;
    public Drawable f24547b3;
    public Drawable f24548c3;
    public Paint f24549d3;
    public final Paint f24550e3;
    public int f24551f3;
    public int f24552g3;
    public Utilities.Callback f24553h3;
    public Utilities.Callback f24554i3;
    public boolean j3;
    public boolean f24555k3;
    public ci.bb f24556l3;
    public int f24557m3;
    public Utilities.Callback f24558n3;
    public float f24559o3;
    public ValueAnimator f24560p3;
    public boolean f24561q3;
    public final e6 f24562r3;
    public final e6 f24563s3;
    public final RectF f24564t3;
    public final RectF f24565u3;
    public final RectF f24566v3;
    public boolean f24567w3;

    static {
        new HashSet();
    }

    public gx0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.X2 = 6.5f;
        this.Y2 = null;
        rr rrVar = rr.h;
        this.f24546a3 = new e6(this, 360L, rrVar);
        Paint paint = new Paint(1);
        this.f24550e3 = paint;
        this.f24557m3 = -1;
        this.f24559o3 = 0.0f;
        this.f24561q3 = true;
        this.f24562r3 = new e6(this, 350L, rrVar);
        this.f24563s3 = new e6(this, 350L, rrVar);
        this.f24564t3 = new RectF();
        this.f24565u3 = new RectF();
        this.f24566v3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        xw0 xw0Var = new xw0(this);
        this.Z2 = xw0Var;
        setAdapter(xw0Var);
        s4.c0 c0Var = new s4.c0();
        setLayoutManager(c0Var);
        c0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.h6.f19148i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(i11, this.f30114p2));
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(i11, this.f30114p2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        f24545x3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ci.p9(this, currentTimeMillis, 2));
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof bx0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f24551f3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f24559o3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof bx0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((bx0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void x1(gx0 gx0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        gx0Var.Y2 = new cx0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            cx0[] cx0VarArr = gx0Var.Y2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f23410c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f23408a = "premium";
            } else {
                obj.f23408a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f23409b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            cx0VarArr[i10] = obj;
        }
        gx0Var.Y2 = gx0Var.B1(gx0Var.Y2);
        gx0Var.Z2.l();
        gx0Var.setCategoriesShownT(0.0f);
        boolean z11 = gx0Var.f24561q3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        gx0Var.G1(z11, z10);
    }

    public static void y1(gx0 gx0Var, float f7) {
        gx0Var.setCategoriesShownT(f7);
    }

    public static void z1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof bx0) {
            bx0 bx0Var = (bx0) view;
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, bx0Var.E, 0.15f, 0.85f) * bx0Var.f23120y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    public abstract boolean A1();

    public final void C1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f24557m3) + ((-getScrollToStartWidth()) - Math.max(0, this.f24552g3));
        scrollBy(dp, 0);
        post(new ld((ci.k2) this, dp, 10));
    }

    public final void D1() {
        v0(-getScrollToStartWidth(), 0, rr.h);
    }

    public void E1(int i10) {
        boolean z10;
        if (this.f24557m3 < 0 && i10 >= 0) {
            this.f24563s3.d(i10, true);
        }
        this.f24557m3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof bx0) {
                int R = RecyclerView.R(childAt);
                bx0 bx0Var = (bx0) childAt;
                if (this.f24557m3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bx0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void F1(cx0 cx0Var) {
        int i10;
        if (this.Y2 != null) {
            i10 = 0;
            while (true) {
                cx0[] cx0VarArr = this.Y2;
                if (i10 >= cx0VarArr.length) {
                    break;
                } else if (cx0VarArr[i10] == cx0Var) {
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
        this.f24561q3 = z10;
        ?? r52 = z10;
        if (this.Y2 == null) {
            r52 = 0;
        }
        if (this.f24559o3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f24560p3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f24560p3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f24559o3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f24560p3 = ofFloat;
            ofFloat.addUpdateListener(new s70(this, 23));
            this.f24560p3.addListener(new fd0(this, 17));
            this.f24560p3.setInterpolator(rr.h);
            ValueAnimator valueAnimator2 = this.f24560p3;
            cx0[] cx0VarArr = this.Y2;
            if (cx0VarArr == null) {
                length = 5;
            } else {
                length = cx0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f24560p3.start();
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
            if (!(E instanceof bx0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gx0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f24557m3;
    }

    public cx0 getSelectedCategory() {
        int i10;
        cx0[] cx0VarArr = this.Y2;
        if (cx0VarArr != null && (i10 = this.f24557m3) >= 0 && i10 < cx0VarArr.length) {
            return cx0VarArr[i10];
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
            if (childAt instanceof bx0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f24552g3) {
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
            Utilities.Callback callback2 = this.f24553h3;
            if (callback2 != null) {
                if (z11) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.f24551f3 - this.f24552g3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z12 && (callback = this.f24553h3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f24551f3 - this.f24552g3))));
        }
        if (this.f24555k3 != z10) {
            this.f24555k3 = z10;
            Utilities.Callback callback3 = this.f24554i3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        G1(this.f24561q3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci.bb bbVar = this.f24556l3;
        if (bbVar != null) {
            bbVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f24549d3 == null) {
            this.f24549d3 = new Paint(1);
        }
        this.f24549d3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.f24547b3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f24548c3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f24552g3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<cx0> callback) {
        this.f24558n3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f24554i3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f24553h3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.X2 = f7;
    }

    public cx0[] B1(cx0[] cx0VarArr) {
        return cx0VarArr;
    }
}
