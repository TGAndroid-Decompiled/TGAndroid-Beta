package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class gk0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Cells.c1 f24317k1 = new org.telegram.ui.Cells.c1(Float.class, "transitionProgress", 2);
    public boolean A0;
    public float B0;
    public final HashSet C0;
    public final HashSet D0;
    public final float E;
    public boolean E0;
    public final float F;
    public boolean F0;
    public int G;
    public boolean G0;
    public MessageObject H;
    public final Paint H0;
    public boolean I;
    public final Paint I0;
    public int J;
    public to J0;
    public long K;
    public boolean K0;
    public boolean L;
    public final AnimationNotificationsLocker L0;
    public boolean M;
    public final int M0;
    public boolean N;
    public boolean N0;
    public float O;
    public boolean O0;
    public long P;
    public Runnable P0;
    public ValueAnimator Q;
    public boolean Q0;
    public FrameLayout R;
    public d90 R0;
    public ci.m6 S;
    public int S0;
    public final ArrayList T;
    public int T0;
    public final ArrayList U;
    public float U0;
    public final ArrayList V;
    public float V0;
    public final gg.j0 W;
    public ch.d W0;
    public ch.d X0;
    public ch.d Y0;
    public ah.c Z0;
    public boolean f24318a;
    public final wj0 f24319a0;
    public dh.e f24320a1;
    public final ai.w0 f24321b;
    public final RectF f24322b0;
    public boolean f24323b1;
    public final float f24324c;
    public boolean f24325c0;
    public boolean f24326c1;
    public final ArrayList d;
    public final HashSet f24327d0;
    public to f24328d1;
    public final ArrayList e;
    public final HashSet f24329e0;
    public boolean f24330e1;
    public final Paint f24331f;
    public final int[] f24332f0;
    public boolean f24333f1;
    public fk0 f24334g0;
    public boolean f24335g1;
    public final Paint h;
    public final Rect f24336h0;
    public Paint f24337h1;
    public final Drawable f24338i0;
    public Matrix f24339i1;
    public final boolean f24340j0;
    public LinearGradient f24341j1;
    public final org.telegram.ui.ActionBar.d6 f24342k0;
    public zg.p0 f24343l0;
    public int m0;
    public final Paint f24344n;
    public float f24345n0;
    public float f24346o0;
    public float f24347p0;
    public float f24348q0;
    public float f24349r;
    public boolean f24350r0;
    public float f24351s;
    public long f24352s0;
    public org.telegram.ui.ActionBar.n2 f24353t0;
    public rg.b1 f24354u0;
    public float v;
    public tr f24355v0;
    public final RectF f24356w;
    public float f24357w0;
    public final Path f24358x;
    public zg.c0 f24359x0;
    public float f24360y;
    public ValueAnimator f24361y0;
    public final ek0 f24362z0;

    public gk0(int i10, int i11, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24318a = false;
        this.d = new ArrayList();
        this.e = new ArrayList();
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.f24331f = paint;
        this.h = new Paint(1);
        this.f24344n = new Paint(1);
        this.v = 1.0f;
        this.f24356w = new RectF();
        this.f24358x = new Path();
        this.f24360y = AndroidUtilities.dp(72.0f);
        float dp = AndroidUtilities.dp(8.0f);
        this.E = dp;
        this.F = dp / 2.0f;
        this.G = AndroidUtilities.dp(36.0f);
        this.T = new ArrayList(20);
        this.U = new ArrayList(10);
        this.V = new ArrayList(20);
        this.f24322b0 = new RectF();
        this.f24325c0 = false;
        this.f24327d0 = new HashSet();
        this.f24329e0 = new HashSet();
        this.f24332f0 = new int[2];
        Rect rect = new Rect();
        this.f24336h0 = rect;
        new ArrayList();
        this.C0 = new HashSet();
        this.D0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.H0 = paint2;
        Paint paint3 = new Paint(1);
        this.I0 = paint3;
        this.L0 = new AnimationNotificationsLocker();
        this.O0 = true;
        this.f24333f1 = false;
        this.M0 = i10;
        this.f24324c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18878i6, d6Var));
        paint3.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Jj, d6Var));
        this.f24342k0 = d6Var;
        this.J = i11;
        this.f24353t0 = n2Var;
        ek0 ek0Var = new ek0(this, context);
        this.f24362z0 = ek0Var;
        ek0Var.setVisibility(8);
        ek0Var.O = false;
        ek0Var.f23708c.setVisibility(8);
        addView(ek0Var);
        this.f24340j0 = (!SharedConfig.animationsEnabled() || SharedConfig.getDevicePerformanceClass() == 0) ? false : false;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f24338i0 = mutate;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Td, false), PorterDuff.Mode.MULTIPLY));
        ai.w0 w0Var = new ai.w0(this, context, 18);
        this.f24321b = w0Var;
        w0Var.setClipChildren(false);
        w0Var.setClipToPadding(false);
        gg.j0 j0Var = new gg.j0((ViewGroup) this, 4);
        this.W = j0Var;
        w0Var.i(new tj0(this, 0));
        w0Var.setLayoutManager(j0Var);
        w0Var.setOverScrollMode(2);
        wj0 wj0Var = new wj0(this);
        this.f24319a0 = wj0Var;
        w0Var.setAdapter(wj0Var);
        w0Var.j(new ak0(this));
        w0Var.j(new kg0(this, 1));
        w0Var.i(new tj0(this, 1));
        w0Var.setOnItemClickListener(new j(this, 11));
        w0Var.setOnItemLongClickListener((cl0) new i2.s(this, i10, 9));
        addView(w0Var, w7.x5.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (w0Var.getLayoutParams().height - w0Var.getPaddingTop()) - w0Var.getPaddingBottom();
        ek0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        ek0Var.getLayoutParams().height = paddingTop;
        if (i10 != 2 && i10 != 4) {
            paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, d6Var));
        } else {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        }
        MediaDataController.getInstance(i11).preloadDefaultReactions();
    }

    public static void a(gk0 gk0Var) {
        if (gk0Var.f24359x0 != null) {
            return;
        }
        zg.c0 c0Var = new zg.c0(gk0Var.M0, gk0Var.f24353t0, gk0Var.V, gk0Var.f24327d0, gk0Var, gk0Var.f24342k0, gk0Var.f24318a);
        gk0Var.f24359x0 = c0Var;
        ah.c cVar = gk0Var.Z0;
        boolean z10 = true;
        if (cVar != null) {
            dh.e eVar = gk0Var.f24320a1;
            org.telegram.ui.q51 q51Var = c0Var.f48936m.f40017f0;
            q51Var.f35697x = true;
            q51Var.setBackground(null);
            q51Var.e();
            q51Var.invalidate();
            ch.d c10 = cVar.c(c0Var.f48927a, null, true);
            c10.o(eVar);
            c10.q(AndroidUtilities.dp(12.0f));
            c10.p(AndroidUtilities.dp(8.0f));
            c0Var.f48948z = c10;
        }
        zg.c0 c0Var2 = gk0Var.f24359x0;
        fk0 fk0Var = gk0Var.f24334g0;
        if (fk0Var != null && !fk0Var.j()) {
            z10 = false;
        }
        c0Var2.f48936m.setLongPressEnabled(z10);
        gk0Var.j();
        gk0Var.f24359x0.f48939p = new ac0(gk0Var, 16);
        gk0Var.m();
    }

    public static void b(gk0 gk0Var, View view, float f7) {
        if (view instanceof ek0) {
            ((ek0) view).h = f7;
            return;
        }
        view.setScaleX(f7);
        view.setScaleY(f7);
    }

    public static boolean c() {
        return SharedConfig.deviceIsHigh();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        boolean z10 = true;
        while (i10 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            hashSet.clear();
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        zg.p0 d = zg.p0.d(messageObject.messageOwner.reactions.results.get(i11).reaction);
                        if (z10 || longSparseArray.indexOfKey(d.h) >= 0) {
                            hashSet.add(Long.valueOf(d.h));
                            longSparseArray.put(d.h, d);
                        }
                    }
                }
            }
            int i12 = 0;
            while (i12 < longSparseArray.size()) {
                if (!hashSet.contains(Long.valueOf(longSparseArray.keyAt(i12)))) {
                    longSparseArray.removeAt(i12);
                    i12--;
                }
                i12++;
            }
            i10++;
            z10 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
            if (longSparseArray.valueAt(i13) != null) {
                hashSet2.add((zg.p0) longSparseArray.valueAt(i13));
            }
        }
        return hashSet2;
    }

    public final void d() {
        zg.c0 c0Var = this.f24359x0;
        if (c0Var != null) {
            if (!c0Var.f48940q) {
                c0Var.f48940q = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new zg.w(c0Var, 0));
                ofFloat.addListener(new zg.a0(c0Var, 0));
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
            this.f24359x0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f18084id == this.K && getVisibility() != 0 && !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                p(this.H, null, true);
                setVisibility(0);
                r(false);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            if (this.M0 == 4) {
                invalidate();
                ai.w0 w0Var = this.f24321b;
                w0Var.invalidate();
                w0Var.f1();
                for (int i12 = 0; i12 < w0Var.getChildCount(); i12++) {
                    View childAt = w0Var.getChildAt(i12);
                    if (childAt instanceof ek0) {
                        ek0 ek0Var = (ek0) childAt;
                        ek0Var.f23706a.invalidate();
                        ek0Var.f23707b.invalidate();
                    } else {
                        childAt.invalidate();
                    }
                }
            }
        } else if (i10 == NotificationCenter.availableEffectsUpdate) {
            p(this.H, null, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gk0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        zg.c0 c0Var = this.f24359x0;
        if (c0Var != null) {
            c0Var.d();
        }
    }

    public final void f(float f7, float f10, float f11, int i10, Canvas canvas) {
        int i11;
        float height;
        float f12;
        float f13;
        float height2;
        if (this.M0 == 1) {
            return;
        }
        canvas.save();
        boolean z10 = this.L;
        RectF rectF = this.f24356w;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), rr.f27701f.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f14 = rectF.bottom;
            rr rrVar = rr.f27701f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f14, 0.0f, rrVar.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), rrVar.getInterpolation(this.O)));
        }
        if (!LocaleController.isRTL && !this.M) {
            i11 = getWidth() - this.G;
        } else {
            i11 = this.G;
        }
        float f15 = i11 + this.U0;
        if (this.L) {
            height = getPaddingTop() - g();
        } else {
            height = (getHeight() - getPaddingBottom()) + g();
        }
        int dp = AndroidUtilities.dp(3.0f);
        Drawable drawable = this.f24338i0;
        drawable.setAlpha(i10);
        Paint paint = this.f24331f;
        paint.setAlpha(i10);
        float f16 = f15 - f7;
        float f17 = dp;
        float f18 = f17 * f10;
        float f19 = height - f7;
        float f20 = f15 + f7;
        float f21 = height + f7;
        drawable.setBounds((int) (f16 - f18), (int) (f19 - f18), (int) (f20 + f18), (int) (f18 + f21));
        drawable.draw(canvas);
        boolean q6 = this.f24334g0.q();
        float f22 = height;
        RectF rectF2 = this.f24322b0;
        if (q6) {
            rectF2.set(f16, f19, f20, f21);
            f12 = f7;
            this.f24334g0.n(canvas, rectF2, f12, getX(), getY(), i10, false);
        } else {
            f12 = f7;
            if (this.X0 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(f16, f19, f20, f21);
                Rect rect = AndroidUtilities.rectTmp2;
                rectF3.round(rect);
                rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                this.X0.setBounds(rect);
                this.X0.setAlpha(paint.getAlpha());
                this.X0.draw(canvas);
            } else {
                canvas.drawCircle(f15, f22, f12, paint);
            }
        }
        boolean z11 = LocaleController.isRTL;
        float f23 = this.E;
        if (!z11 && !this.M) {
            f13 = (getWidth() - this.G) + f23;
        } else {
            f13 = this.G - f23;
        }
        float f24 = this.U0 + this.V0 + f13;
        boolean z12 = this.L;
        float f25 = this.F;
        if (z12) {
            height2 = (getPaddingTop() - g()) - AndroidUtilities.dp(16.0f);
        } else {
            height2 = ((getHeight() - f25) - f17) + g();
        }
        float lerp = AndroidUtilities.lerp(height2, (f25 + f17) - g(), rr.f27701f.getInterpolation(this.O));
        float f26 = (-AndroidUtilities.dp(1.0f)) * f10;
        drawable.setBounds((int) ((f24 - f12) - f26), (int) ((lerp - f12) - f26), (int) (f24 + f12 + f26), (int) (f12 + lerp + f26));
        drawable.draw(canvas);
        if (this.f24334g0.q()) {
            rectF2.set(f24 - f11, lerp - f11, f24 + f11, lerp + f11);
            this.f24334g0.n(canvas, rectF2, f11, getX(), getY(), i10, false);
        } else if (this.Y0 != null) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(f24 - f11, lerp - f11, f24 + f11, lerp + f11);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rectF4.round(rect2);
            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
            this.Y0.setBounds(rect2);
            this.Y0.setAlpha(paint.getAlpha());
            this.Y0.draw(canvas);
        } else {
            canvas.drawCircle(f24, lerp, f11, paint);
        }
        canvas.restore();
        drawable.setAlpha(255);
        paint.setAlpha(255);
    }

    public final float g() {
        return (int) (getPullingLeftProgress() * AndroidUtilities.dp(6.0f));
    }

    public fk0 getDelegate() {
        return this.f24334g0;
    }

    public int getHintTextWidth() {
        return this.S0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.T.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.clamp(this.B0 / AndroidUtilities.dp(42.0f), 2.0f, 0.0f);
    }

    public zg.c0 getReactionsWindow() {
        return this.f24359x0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document f7;
        HashSet hashSet = this.f24327d0;
        if (hashSet.isEmpty()) {
            return "";
        }
        zg.p0 p0Var = (zg.p0) hashSet.iterator().next();
        long j3 = p0Var.f49072g;
        String str = null;
        if (j3 != 0 && (f7 = q5.f(this.J, j3)) != null) {
            str = MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = p0Var.f49071f;
        }
        if (TextUtils.isEmpty(str)) {
            return "👍";
        }
        return str;
    }

    public HashSet<zg.p0> getSelectedReactions() {
        return this.f24327d0;
    }

    public float getTopOffset() {
        if (this.Q0) {
            return ((FrameLayout.LayoutParams) this.f24321b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (!q()) {
            return AndroidUtilities.dp(16.0f) + hg.c.g(itemsCount, 1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(36.0f) * itemsCount);
        }
        return (AndroidUtilities.dp(36.0f) * itemsCount) - AndroidUtilities.dp(4.0f);
    }

    public List<zg.p0> getVisibleReactionsList() {
        return this.T;
    }

    public int getWindowType() {
        int i10 = this.M0;
        if (i10 == 4) {
            return 13;
        }
        if (i10 == 3) {
            return 11;
        }
        if (i10 == 5) {
            return 14;
        }
        if (this.F0) {
            return 8;
        }
        return 1;
    }

    public View getWindowView() {
        zg.c0 c0Var = this.f24359x0;
        if (c0Var == null) {
            return null;
        }
        return c0Var.f48929c;
    }

    public final void h(ArrayList arrayList) {
        ArrayList<TLRPC.Reaction> topReactions;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.M0;
        if (i11 == 4) {
            Iterator it = this.f24327d0.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                zg.p0 p0Var = (zg.p0) it.next();
                if (!hashSet.contains(p0Var)) {
                    hashSet.add(p0Var);
                    arrayList.add(p0Var);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.J).getEnabledReactionsList();
            while (i10 < enabledReactionsList.size()) {
                zg.p0 c10 = zg.p0.c(enabledReactionsList.get(i10));
                if (!hashSet.contains(c10)) {
                    hashSet.add(c10);
                    arrayList.add(c10);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
                i10++;
            }
        } else if (this.E0 && i11 != 4) {
            if (i11 == 5) {
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.J).getAvailableEffects();
                if (availableEffects != null) {
                    while (i10 < availableEffects.effects.size()) {
                        zg.p0 e = zg.p0.e(availableEffects.effects.get(i10));
                        if (!hashSet.contains(e)) {
                            hashSet.add(e);
                            arrayList.add(e);
                        }
                        i10++;
                    }
                    return;
                }
                return;
            }
            if (i11 == 3) {
                topReactions = MediaDataController.getInstance(this.J).getSavedReactions();
            } else {
                topReactions = MediaDataController.getInstance(this.J).getTopReactions();
            }
            if (i11 == 3) {
                TLRPC.TL_messages_savedReactionsTags savedReactionTags = MessagesController.getInstance(this.J).getSavedReactionTags(0L);
                if (savedReactionTags != null) {
                    for (int i13 = 0; i13 < savedReactionTags.tags.size(); i13++) {
                        zg.p0 d = zg.p0.d(savedReactionTags.tags.get(i13).reaction);
                        if (!hashSet.contains(d)) {
                            hashSet.add(d);
                            arrayList.add(d);
                        }
                    }
                }
                for (int i14 = 0; i14 < topReactions.size(); i14++) {
                    zg.p0 d10 = zg.p0.d(topReactions.get(i14));
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            } else {
                for (int i15 = 0; i15 < topReactions.size(); i15++) {
                    zg.p0 d11 = zg.p0.d(topReactions.get(i15));
                    if (!hashSet.contains(d11) && (i11 == 3 || UserConfig.getInstance(this.J).isPremium() || d11.f49072g == 0)) {
                        hashSet.add(d11);
                        arrayList.add(d11);
                    }
                }
            }
            if (i11 != 3 || UserConfig.getInstance(this.J).isPremium()) {
                ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.J).getRecentReactions();
                for (int i16 = 0; i16 < recentReactions.size(); i16++) {
                    zg.p0 d12 = zg.p0.d(recentReactions.get(i16));
                    if (!hashSet.contains(d12)) {
                        hashSet.add(d12);
                        arrayList.add(d12);
                    }
                }
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.J).getEnabledReactionsList();
                while (i10 < enabledReactionsList2.size()) {
                    zg.p0 c11 = zg.p0.c(enabledReactionsList2.get(i10));
                    if (!hashSet.contains(c11)) {
                        hashSet.add(c11);
                        arrayList.add(c11);
                    }
                    i10++;
                }
            }
        } else if (i11 == 3) {
            ArrayList<TLRPC.Reaction> savedReactions = MediaDataController.getInstance(this.J).getSavedReactions();
            int i17 = 0;
            while (i10 < savedReactions.size()) {
                zg.p0 d13 = zg.p0.d(savedReactions.get(i10));
                if (!hashSet.contains(d13)) {
                    hashSet.add(d13);
                    arrayList.add(d13);
                    i17++;
                }
                if (i17 != 16) {
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            List<TLRPC.TL_availableReaction> enabledReactionsList3 = MediaDataController.getInstance(this.J).getEnabledReactionsList();
            while (i10 < enabledReactionsList3.size()) {
                arrayList.add(zg.p0.c(enabledReactionsList3.get(i10)));
                i10++;
            }
        }
    }

    public void j() {
        int i10 = 0;
        while (true) {
            ai.w0 w0Var = this.f24321b;
            if (i10 < w0Var.getChildCount()) {
                View childAt = w0Var.getChildAt(i10);
                if (childAt instanceof ek0) {
                    ((ek0) childAt).f23707b.invalidate();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int dp = AndroidUtilities.dp(24.0f);
        float height = getHeight() / 2.0f;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G8, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, dp, height, w02, 0, tileMode));
        this.f24344n.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, w02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, zg.p0 p0Var, boolean z10) {
        fk0 fk0Var = this.f24334g0;
        if (fk0Var != null) {
            fk0Var.h(view, p0Var, z10, true);
        }
        if (this.M0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void n() {
        this.O0 = true;
        this.m0 = 0;
        this.f24345n0 = 0.0f;
        this.B0 = 0.0f;
        this.f24343l0 = null;
        this.f24350r0 = false;
        sj0 sj0Var = new sj0(this, 1);
        ai.w0 w0Var = this.f24321b;
        AndroidUtilities.forEachViews((RecyclerView) w0Var, (Utilities.Callback<View>) sj0Var);
        this.C0.clear();
        w0Var.invalidate();
        ci.m6 m6Var = this.S;
        if (m6Var != null) {
            m6Var.invalidate();
        }
        invalidate();
    }

    public final void o(ah.c cVar, dh.e eVar) {
        this.Z0 = cVar;
        this.f24320a1 = eVar;
        ch.d c10 = cVar.c(this, null, true);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(24.0f));
        c10.p(AndroidUtilities.dp(8.0f));
        this.W0 = c10;
        ch.d c11 = cVar.c(this, null, true);
        c11.o(eVar);
        c11.q(AndroidUtilities.dp(8.0f));
        c11.p(AndroidUtilities.dp(8.0f));
        this.X0 = c11;
        ch.d c12 = cVar.c(this, null, true);
        c12.o(eVar);
        c12.q(AndroidUtilities.dp(4.0f));
        c12.p(AndroidUtilities.dp(8.0f));
        this.Y0 = c12;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.J).addObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.M0 == 5) {
            NotificationCenter.getInstance(this.J).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.J).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.M0 == 5) {
            NotificationCenter.getInstance(this.J).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        k();
    }

    public final void p(MessageObject messageObject, TLRPC.ChatFull chatFull, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i11;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.H = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (tL_messageReactions2 = message.reactions) != null) {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i10 = 0;
            int i12 = 0;
            while (i12 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i12);
                i12++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i10++;
                }
            }
        } else {
            i10 = 0;
        }
        int i13 = this.M0;
        if (i13 == 0 && this.H != null && i10 >= MessagesController.getInstance(this.J).getChatMaxUniqReactions(this.H.getDialogId())) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.I = z11;
        if (i13 == 0 && this.H != null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.J).getChat(Long.valueOf(-this.H.getDialogId())))) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.A0 = z12;
        ArrayList arrayList2 = new ArrayList();
        if (messageObject != null && messageObject.isForwardedChannelPost() && (chatFull = MessagesController.getInstance(this.J).getChatFull(-messageObject.getFromChatId())) == null) {
            this.K = -messageObject.getFromChatId();
            MessagesController.getInstance(this.J).loadFullChat(-messageObject.getFromChatId(), 0, true);
            setVisibility(4);
            return;
        }
        this.f24325c0 = false;
        if (i13 == 3) {
            this.E0 = UserConfig.getInstance(this.J).isPremium();
            h(arrayList2);
        } else if (i13 == 5) {
            this.E0 = true;
            h(arrayList2);
        } else if (this.I) {
            this.E0 = false;
            if (chatFull != null && chatFull.paid_reactions_available) {
                this.f24325c0 = true;
                ?? obj = new Object();
                obj.f49068a = true;
                arrayList2.add(obj);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.H.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i14);
                i14++;
                arrayList2.add(zg.p0.d(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.f24325c0 = true;
                ?? obj2 = new Object();
                obj2.f49068a = true;
                arrayList2.add(obj2);
            }
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat chat = MessagesController.getInstance(this.J).getChat(Long.valueOf(chatFull.f18084id));
                if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    this.E0 = true;
                } else {
                    this.E0 = false;
                }
                h(arrayList2);
            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    TLRPC.Reaction reaction = arrayList4.get(i15);
                    i15++;
                    TLRPC.Reaction reaction2 = reaction;
                    Iterator<TLRPC.TL_availableReaction> it = MediaDataController.getInstance(this.J).getEnabledReactionsList().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            TLRPC.TL_availableReaction next = it.next();
                            if ((reaction2 instanceof TLRPC.TL_reactionEmoji) && next.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                arrayList2.add(zg.p0.d(reaction2));
                                break;
                            } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                arrayList2.add(zg.p0.d(reaction2));
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.E0 = true;
            h(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i16))) {
                i16--;
                arrayList2.remove(i16);
            } else {
                hashSet.add((zg.p0) arrayList2.get(i16));
            }
            i16++;
        }
        if (!this.I && ((!this.E0 && arrayList2.size() > 16) || (this.E0 && !UserConfig.getInstance(this.J).isPremium() && MessagesController.getInstance(this.J).premiumFeaturesBlocked()))) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.F0 = z13;
        if (i13 == 3 && !UserConfig.getInstance(this.J).isPremium()) {
            this.F0 = false;
        }
        if (i13 == 4) {
            this.F0 = true;
        }
        ArrayList arrayList5 = this.T;
        arrayList5.clear();
        if (q()) {
            int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) / AndroidUtilities.dp(34.0f);
            if (dp > 7) {
                dp = 7;
            }
            if (dp < 1) {
                dp = 1;
            }
            int i17 = 0;
            while (i17 < Math.min(arrayList2.size(), dp)) {
                arrayList5.add((zg.p0) arrayList2.get(i17));
                i17++;
            }
            if (i17 < arrayList2.size()) {
                ek0.a(this.f24362z0, (zg.p0) arrayList2.get(i17), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.G0 = true;
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (((zg.p0) arrayList5.get(i18)).f49072g != 0) {
                this.G0 = false;
            }
        }
        ArrayList arrayList6 = this.V;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        wj0 wj0Var = this.f24319a0;
        gk0 gk0Var = wj0Var.d;
        ArrayList arrayList7 = gk0Var.e;
        ArrayList arrayList8 = gk0Var.T;
        ArrayList arrayList9 = gk0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i19 = 0; i19 < arrayList8.size(); i19++) {
            zg.p0 p0Var = (zg.p0) arrayList8.get(i19);
            if (p0Var.f49071f == null) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            arrayList9.add(new xj0(i11, p0Var));
        }
        if (!gk0Var.U.isEmpty() && !MessagesController.getInstance(gk0Var.J).premiumFeaturesBlocked()) {
            arrayList9.add(new xj0(1, null));
        }
        if (gk0Var.q()) {
            arrayList9.add(new xj0(2, null));
        }
        if (z10) {
            wj0Var.E(arrayList7, arrayList9);
        } else {
            wj0Var.l();
        }
        if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
            for (int i20 = 0; i20 < messageObject.messageOwner.reactions.results.size(); i20++) {
                if (messageObject.messageOwner.reactions.results.get(i20).chosen) {
                    this.f24327d0.add(zg.p0.d(messageObject.messageOwner.reactions.results.get(i20).reaction));
                }
            }
        }
    }

    public final boolean q() {
        if (!this.E0 && !this.F0) {
            return false;
        }
        return true;
    }

    public final void r(boolean z10) {
        ObjectAnimator duration;
        this.K0 = z10;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.L0.lock();
        boolean deviceIsHigh = SharedConfig.deviceIsHigh();
        org.telegram.ui.Cells.c1 c1Var = f24317k1;
        if (deviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, c1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, c1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new ci.u5(this, 1));
        duration.start();
    }

    @Override
    public void setAlpha(float f7) {
        if (getAlpha() != f7 && f7 == 0.0f) {
            this.C0.clear();
            int i10 = 0;
            while (true) {
                ai.w0 w0Var = this.f24321b;
                if (i10 >= w0Var.getChildCount()) {
                    break;
                }
                if (w0Var.getChildAt(i10) instanceof ek0) {
                    ((ek0) w0Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f7);
    }

    public void setBubbleOffset(float f7) {
        this.U0 = f7;
    }

    public void setChatScrimView(to toVar) {
        this.f24328d1 = toVar;
    }

    public void setCurrentAccount(int i10) {
        this.J = i10;
    }

    public void setCustomEmojiEnterProgress(float f7) {
        this.f24357w0 = f7;
        to toVar = this.f24328d1;
        if (toVar != null) {
            toVar.setPopupAlpha(1.0f - f7);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            this.f24355v0.setBackground(org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false), 40)));
        } else {
            this.f24355v0.setBackground(null);
        }
    }

    public void setDelegate(fk0 fk0Var) {
        this.f24334g0 = fk0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        this.f24353t0 = n2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.Q0 = true;
        if (this.R0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.d6 d6Var = this.f24342k0;
            d90 d90Var = new d90(context, d6Var);
            this.R0 = d90Var;
            d90Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.R0.setClickable(true);
            this.R0.setTextSize(1, 12.0f);
            int i10 = this.M0;
            if (i10 != 1 && i10 != 2 && i10 != 4) {
                this.R0.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19189z6, d6Var));
            } else {
                this.R0.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
                this.R0.setAlpha(0.5f);
            }
            this.R0.setGravity(1);
            addView(this.R0, w7.x5.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.R0.setText(charSequence);
        this.f24330e1 = false;
        ((FrameLayout.LayoutParams) this.f24362z0.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.f24321b.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
    }

    public void setMiniBubblesOffset(float f7) {
        this.V0 = f7;
    }

    public void setMirrorX(boolean z10) {
        this.M = z10;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.P0 = runnable;
    }

    public void setParentLayout(to toVar) {
        this.J0 = toVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.f24327d0;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            zg.p0 b10 = zg.p0.b(str);
            hashSet.add(b10);
            this.f24329e0.add(b10);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f24321b, (Utilities.Callback<View>) new sj0(this, 0));
    }

    public void setSelectedReaction(zg.p0 p0Var) {
        HashSet hashSet = this.f24327d0;
        hashSet.clear();
        if (p0Var != null) {
            hashSet.add(p0Var);
        }
        this.f24319a0.l();
    }

    public void setSelectedReactionAnimated(zg.p0 p0Var) {
        HashSet hashSet = this.f24327d0;
        hashSet.clear();
        if (p0Var != null) {
            hashSet.add(p0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f24321b, (Utilities.Callback<View>) new sj0(this, 0));
    }

    public void setSelectedReactionInclusive(zg.p0 p0Var) {
        HashSet hashSet = this.f24327d0;
        hashSet.clear();
        if (p0Var != null) {
            hashSet.add(p0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f24321b, (Utilities.Callback<View>) new sj0(this, 0));
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.f24327d0;
        hashSet.clear();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = arrayList.get(i10);
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        hashSet.add(zg.p0.d(messageObject.messageOwner.reactions.results.get(i11).reaction));
                    }
                }
            }
        }
        this.f24319a0.l();
    }

    public void setSelectedReactionsInclusive(ArrayList<MessageObject> arrayList) {
        HashSet hashSet = this.f24327d0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        AndroidUtilities.forEachViews((RecyclerView) this.f24321b, (Utilities.Callback<View>) new sj0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.f24326c1 != z10) {
            this.f24326c1 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    ai.w0 w0Var = this.f24321b;
                    if (i10 >= w0Var.getChildCount()) {
                        break;
                    }
                    if (w0Var.getChildAt(i10) instanceof ek0) {
                        ek0 ek0Var = (ek0) w0Var.getChildAt(i10);
                        boolean z11 = ek0Var.f23711r;
                        dk0 dk0Var = ek0Var.f23707b;
                        if (z11 && (dk0Var.getImageReceiver().getLottieAnimation() != null || dk0Var.getImageReceiver().getAnimation() != null)) {
                            dk0Var.setVisibility(0);
                            ek0Var.f23706a.setVisibility(4);
                            if (ek0Var.f23712s) {
                                ek0Var.v = true;
                            }
                        }
                        ek0Var.invalidate();
                    }
                    i10++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.f24327d0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(zg.p0.d(reaction));
        }
        this.f24319a0.l();
    }

    public void setTop(boolean z10) {
        this.L = z10;
    }

    public void setTransitionProgress(float f7) {
        this.v = f7;
        to toVar = this.J0;
        if (toVar != null) {
            toVar.setReactionsTransitionProgress((this.K0 && SharedConfig.deviceIsHigh()) ? 1.0f : 1.0f);
        }
        invalidate();
    }

    @Override
    public void setTranslationX(float f7) {
        if (f7 != getTranslationX()) {
            super.setTranslationX(f7);
        }
    }

    public void m() {
    }
}
