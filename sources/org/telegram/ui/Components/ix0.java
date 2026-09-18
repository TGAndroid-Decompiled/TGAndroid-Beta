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
public abstract class ix0 extends wl0 {
    public static final gx0 f25064x3 = new CacheFetcher();
    public static final hx0 y3 = new CacheFetcher();
    public float X2;
    public ex0[] Y2;
    public final zw0 Z2;
    public final e6 f25065a3;
    public Drawable f25066b3;
    public Drawable f25067c3;
    public Paint f25068d3;
    public final Paint f25069e3;
    public int f25070f3;
    public int f25071g3;
    public Utilities.Callback f25072h3;
    public Utilities.Callback f25073i3;
    public boolean j3;
    public boolean f25074k3;
    public ci.eb f25075l3;
    public int f25076m3;
    public Utilities.Callback f25077n3;
    public float f25078o3;
    public ValueAnimator f25079p3;
    public boolean f25080q3;
    public final e6 f25081r3;
    public final e6 f25082s3;
    public final RectF f25083t3;
    public final RectF f25084u3;
    public final RectF f25085v3;
    public boolean f25086w3;

    static {
        new HashSet();
    }

    public ix0(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.X2 = 6.5f;
        this.Y2 = null;
        qr qrVar = qr.h;
        this.f25065a3 = new e6(this, 360L, qrVar);
        Paint paint = new Paint(1);
        this.f25069e3 = paint;
        this.f25076m3 = -1;
        this.f25078o3 = 0.0f;
        this.f25080q3 = true;
        this.f25081r3 = new e6(this, 350L, qrVar);
        this.f25082s3 = new e6(this, 350L, qrVar);
        this.f25083t3 = new RectF();
        this.f25084u3 = new RectF();
        this.f25085v3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        zw0 zw0Var = new zw0(this);
        this.Z2 = zw0Var;
        setAdapter(zw0Var);
        s4.c0 c0Var = new s4.c0();
        setLayoutManager(c0Var);
        c0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.j6.f19152i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f30090p2));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f30090p2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        f25064x3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ci.s9(this, currentTimeMillis, 2));
    }

    public static void A1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof dx0) {
            dx0 dx0Var = (dx0) view;
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, dx0Var.E, 0.15f, 0.85f) * dx0Var.f23696y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof dx0) {
            return Math.max(0, getHeight() * (RecyclerView.S(childAt) - 1)) + this.f25070f3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f25078o3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof dx0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.S(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((dx0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void y1(ix0 ix0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        ix0Var.Y2 = new ex0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            ex0[] ex0VarArr = ix0Var.Y2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f23980c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f23978a = "premium";
            } else {
                obj.f23978a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f23979b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            ex0VarArr[i10] = obj;
        }
        ix0Var.Y2 = ix0Var.C1(ix0Var.Y2);
        ix0Var.Z2.l();
        ix0Var.setCategoriesShownT(0.0f);
        boolean z11 = ix0Var.f25080q3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        ix0Var.H1(z11, z10);
    }

    public static void z1(ix0 ix0Var, float f7) {
        ix0Var.setCategoriesShownT(f7);
    }

    public abstract boolean B1();

    public final void D1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f25076m3) + ((-getScrollToStartWidth()) - Math.max(0, this.f25071g3));
        scrollBy(dp, 0);
        post(new x2((ci.k2) this, dp, 12));
    }

    public final void E1() {
        w0(-getScrollToStartWidth(), 0, qr.h);
    }

    public void F1(int i10) {
        boolean z10;
        if (this.f25076m3 < 0 && i10 >= 0) {
            this.f25082s3.d(i10, true);
        }
        this.f25076m3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof dx0) {
                int S = RecyclerView.S(childAt);
                dx0 dx0Var = (dx0) childAt;
                if (this.f25076m3 == S - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dx0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void G1(ex0 ex0Var) {
        int i10;
        if (this.Y2 != null) {
            i10 = 0;
            while (true) {
                ex0[] ex0VarArr = this.Y2;
                if (i10 >= ex0VarArr.length) {
                    break;
                } else if (ex0VarArr[i10] == ex0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            F1(i10);
        }
        i10 = -1;
        F1(i10);
    }

    public final void H1(boolean z10, boolean z11) {
        int length;
        this.f25080q3 = z10;
        ?? r52 = z10;
        if (this.Y2 == null) {
            r52 = 0;
        }
        if (this.f25078o3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f25079p3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f25079p3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f25078o3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f25079p3 = ofFloat;
            ofFloat.addUpdateListener(new q70(this, 23));
            this.f25079p3.addListener(new ed0(this, 17));
            this.f25079p3.setInterpolator(qr.h);
            ValueAnimator valueAnimator2 = this.f25079p3;
            ex0[] ex0VarArr = this.Y2;
            if (ex0VarArr == null) {
                length = 5;
            } else {
                length = ex0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f25079p3.start();
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
            View F = F(motionEvent.getX(), motionEvent.getY());
            if (!(F instanceof dx0) || F.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ix0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f25076m3;
    }

    public ex0 getSelectedCategory() {
        int i10;
        ex0[] ex0VarArr = this.Y2;
        if (ex0VarArr != null && (i10 = this.f25076m3) >= 0 && i10 < ex0VarArr.length) {
            return ex0VarArr[i10];
        }
        return null;
    }

    @Override
    public final void l0(int i10, int i11) {
        boolean z10;
        boolean z11;
        Utilities.Callback callback;
        int i12 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z11 = true;
            if (childAt instanceof dx0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f25071g3) {
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
            Utilities.Callback callback2 = this.f25072h3;
            if (callback2 != null) {
                if (z11) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.f25070f3 - this.f25071g3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z12 && (callback = this.f25072h3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f25070f3 - this.f25071g3))));
        }
        if (this.f25074k3 != z10) {
            this.f25074k3 = z10;
            Utilities.Callback callback3 = this.f25073i3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        H1(this.f25080q3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci.eb ebVar = this.f25075l3;
        if (ebVar != null) {
            ebVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f25068d3 == null) {
            this.f25068d3 = new Paint(1);
        }
        this.f25068d3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.f25066b3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f25067c3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f25071g3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<ex0> callback) {
        this.f25077n3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f25073i3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f25072h3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.X2 = f7;
    }

    public ex0[] C1(ex0[] ex0VarArr) {
        return ex0VarArr;
    }
}
