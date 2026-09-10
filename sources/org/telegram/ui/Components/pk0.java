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
public class pk0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Cells.c1 f26157k1 = new org.telegram.ui.Cells.c1(Float.class, "transitionProgress", 2);
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
    public xo J0;
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
    public m90 R0;
    public bi.n7 S;
    public int S0;
    public final ArrayList T;
    public int T0;
    public final ArrayList U;
    public float U0;
    public final ArrayList V;
    public float V0;
    public final fg.i0 W;
    public bh.d W0;
    public bh.d X0;
    public bh.d Y0;
    public zg.a Z0;
    public boolean f26158a;
    public final fk0 f26159a0;
    public ch.e f26160a1;
    public final bi.y1 f26161b;
    public final RectF f26162b0;
    public boolean f26163b1;
    public final float f26164c;
    public boolean f26165c0;
    public boolean f26166c1;
    public final ArrayList d;
    public final HashSet f26167d0;
    public xo f26168d1;
    public final ArrayList e;
    public final HashSet f26169e0;
    public boolean f26170e1;
    public final Paint f26171f;
    public final int[] f26172f0;
    public boolean f26173f1;
    public ok0 f26174g0;
    public boolean f26175g1;
    public final Paint h;
    public final Rect f26176h0;
    public Paint f26177h1;
    public final Drawable f26178i0;
    public Matrix f26179i1;
    public final boolean f26180j0;
    public LinearGradient f26181j1;
    public final org.telegram.ui.ActionBar.f6 f26182k0;
    public yg.p0 f26183l0;
    public int m0;
    public final Paint f26184n;
    public float f26185n0;
    public float f26186o0;
    public float f26187p0;
    public float f26188q0;
    public float f26189r;
    public boolean f26190r0;
    public float f26191s;
    public long f26192s0;
    public org.telegram.ui.ActionBar.p2 f26193t0;
    public qg.e1 f26194u0;
    public float v;
    public yr f26195v0;
    public final RectF f26196w;
    public float f26197w0;
    public final Path f26198x;
    public yg.c0 f26199x0;
    public float f26200y;
    public ValueAnimator f26201y0;
    public final nk0 f26202z0;

    public pk0(int i10, int i11, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f26158a = false;
        this.d = new ArrayList();
        this.e = new ArrayList();
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.f26171f = paint;
        this.h = new Paint(1);
        this.f26184n = new Paint(1);
        this.v = 1.0f;
        this.f26196w = new RectF();
        this.f26198x = new Path();
        this.f26200y = AndroidUtilities.dp(72.0f);
        float dp = AndroidUtilities.dp(8.0f);
        this.E = dp;
        this.F = dp / 2.0f;
        this.G = AndroidUtilities.dp(36.0f);
        this.T = new ArrayList(20);
        this.U = new ArrayList(10);
        this.V = new ArrayList(20);
        this.f26162b0 = new RectF();
        this.f26165c0 = false;
        this.f26167d0 = new HashSet();
        this.f26169e0 = new HashSet();
        this.f26172f0 = new int[2];
        Rect rect = new Rect();
        this.f26176h0 = rect;
        new ArrayList();
        this.C0 = new HashSet();
        this.D0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.H0 = paint2;
        Paint paint3 = new Paint(1);
        this.I0 = paint3;
        this.L0 = new AnimationNotificationsLocker();
        this.O0 = true;
        this.f26173f1 = false;
        this.M0 = i10;
        this.f26164c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var));
        paint3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Jj, f6Var));
        this.f26182k0 = f6Var;
        this.J = i11;
        this.f26193t0 = p2Var;
        nk0 nk0Var = new nk0(this, context);
        this.f26202z0 = nk0Var;
        nk0Var.setVisibility(8);
        nk0Var.O = false;
        nk0Var.f25542c.setVisibility(8);
        addView(nk0Var);
        this.f26180j0 = (!SharedConfig.animationsEnabled() || SharedConfig.getDevicePerformanceClass() == 0) ? false : false;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f26178i0 = mutate;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Td, false), PorterDuff.Mode.MULTIPLY));
        bi.y1 y1Var = new bi.y1(this, context, 17);
        this.f26161b = y1Var;
        y1Var.setClipChildren(false);
        y1Var.setClipToPadding(false);
        fg.i0 i0Var = new fg.i0((ViewGroup) this, 4);
        this.W = i0Var;
        y1Var.i(new ck0(this, 0));
        y1Var.setLayoutManager(i0Var);
        y1Var.setOverScrollMode(2);
        fk0 fk0Var = new fk0(this);
        this.f26159a0 = fk0Var;
        y1Var.setAdapter(fk0Var);
        y1Var.j(new jk0(this));
        y1Var.j(new bi.a2(this, 29));
        y1Var.i(new ck0(this, 1));
        y1Var.setOnItemClickListener(new k(this, 11));
        y1Var.setOnItemLongClickListener((ll0) new i2.s(this, i10, 8));
        addView(y1Var, w7.a6.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (y1Var.getLayoutParams().height - y1Var.getPaddingTop()) - y1Var.getPaddingBottom();
        nk0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        nk0Var.getLayoutParams().height = paddingTop;
        if (i10 != 2 && i10 != 4) {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
        } else {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        }
        MediaDataController.getInstance(i11).preloadDefaultReactions();
    }

    public static void a(pk0 pk0Var) {
        if (pk0Var.f26199x0 != null) {
            return;
        }
        yg.c0 c0Var = new yg.c0(pk0Var.M0, pk0Var.f26193t0, pk0Var.V, pk0Var.f26167d0, pk0Var, pk0Var.f26182k0, pk0Var.f26158a);
        pk0Var.f26199x0 = c0Var;
        zg.a aVar = pk0Var.Z0;
        boolean z10 = true;
        if (aVar != null) {
            ch.e eVar = pk0Var.f26160a1;
            org.telegram.ui.c61 c61Var = c0Var.f46959m.f34566f0;
            c61Var.f30820x = true;
            c61Var.setBackground(null);
            c61Var.e();
            c61Var.invalidate();
            bh.d c10 = aVar.c(c0Var.f46950a, null, true);
            c10.n(eVar);
            c10.p(AndroidUtilities.dp(12.0f));
            c10.o(AndroidUtilities.dp(8.0f));
            c0Var.f46971z = c10;
        }
        yg.c0 c0Var2 = pk0Var.f26199x0;
        ok0 ok0Var = pk0Var.f26174g0;
        if (ok0Var != null && !ok0Var.j()) {
            z10 = false;
        }
        c0Var2.f46959m.setLongPressEnabled(z10);
        pk0Var.j();
        pk0Var.f26199x0.f46962p = new kc0(pk0Var, 16);
        pk0Var.m();
    }

    public static void b(pk0 pk0Var, View view, float f7) {
        if (view instanceof nk0) {
            ((nk0) view).h = f7;
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
                        yg.p0 d = yg.p0.d(messageObject.messageOwner.reactions.results.get(i11).reaction);
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
                hashSet2.add((yg.p0) longSparseArray.valueAt(i13));
            }
        }
        return hashSet2;
    }

    public final void d() {
        yg.c0 c0Var = this.f26199x0;
        if (c0Var != null) {
            if (!c0Var.f46963q) {
                c0Var.f46963q = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new yg.x(c0Var, 0));
                ofFloat.addListener(new yg.a0(c0Var, 0));
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
            this.f26199x0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f17196id == this.K && getVisibility() != 0 && !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                p(this.H, null, true);
                setVisibility(0);
                r(false);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            if (this.M0 == 4) {
                invalidate();
                bi.y1 y1Var = this.f26161b;
                y1Var.invalidate();
                y1Var.e1();
                for (int i12 = 0; i12 < y1Var.getChildCount(); i12++) {
                    View childAt = y1Var.getChildAt(i12);
                    if (childAt instanceof nk0) {
                        nk0 nk0Var = (nk0) childAt;
                        nk0Var.f25540a.invalidate();
                        nk0Var.f25541b.invalidate();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        yg.c0 c0Var = this.f26199x0;
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
        RectF rectF = this.f26196w;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), wr.f28819f.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f14 = rectF.bottom;
            wr wrVar = wr.f28819f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f14, 0.0f, wrVar.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), wrVar.getInterpolation(this.O)));
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
        Drawable drawable = this.f26178i0;
        drawable.setAlpha(i10);
        Paint paint = this.f26171f;
        paint.setAlpha(i10);
        float f16 = f15 - f7;
        float f17 = dp;
        float f18 = f17 * f10;
        float f19 = height - f7;
        float f20 = f15 + f7;
        float f21 = height + f7;
        drawable.setBounds((int) (f16 - f18), (int) (f19 - f18), (int) (f20 + f18), (int) (f18 + f21));
        drawable.draw(canvas);
        boolean t10 = this.f26174g0.t();
        float f22 = height;
        RectF rectF2 = this.f26162b0;
        if (t10) {
            rectF2.set(f16, f19, f20, f21);
            f12 = f7;
            this.f26174g0.r(canvas, rectF2, f12, getX(), getY(), i10, false);
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
        float lerp = AndroidUtilities.lerp(height2, (f25 + f17) - g(), wr.f28819f.getInterpolation(this.O));
        float f26 = (-AndroidUtilities.dp(1.0f)) * f10;
        drawable.setBounds((int) ((f24 - f12) - f26), (int) ((lerp - f12) - f26), (int) (f24 + f12 + f26), (int) (f12 + lerp + f26));
        drawable.draw(canvas);
        if (this.f26174g0.t()) {
            rectF2.set(f24 - f11, lerp - f11, f24 + f11, lerp + f11);
            this.f26174g0.r(canvas, rectF2, f11, getX(), getY(), i10, false);
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

    public ok0 getDelegate() {
        return this.f26174g0;
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

    public yg.c0 getReactionsWindow() {
        return this.f26199x0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document f7;
        HashSet hashSet = this.f26167d0;
        if (hashSet.isEmpty()) {
            return "";
        }
        yg.p0 p0Var = (yg.p0) hashSet.iterator().next();
        long j3 = p0Var.f47102g;
        String str = null;
        if (j3 != 0 && (f7 = p5.f(this.J, j3)) != null) {
            str = MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = p0Var.f47101f;
        }
        if (TextUtils.isEmpty(str)) {
            return "👍";
        }
        return str;
    }

    public HashSet<yg.p0> getSelectedReactions() {
        return this.f26167d0;
    }

    public float getTopOffset() {
        if (this.Q0) {
            return ((FrameLayout.LayoutParams) this.f26161b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (!q()) {
            return AndroidUtilities.dp(16.0f) + hc.b.B(itemsCount, 1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(36.0f) * itemsCount);
        }
        return (AndroidUtilities.dp(36.0f) * itemsCount) - AndroidUtilities.dp(4.0f);
    }

    public List<yg.p0> getVisibleReactionsList() {
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
        yg.c0 c0Var = this.f26199x0;
        if (c0Var == null) {
            return null;
        }
        return c0Var.f46952c;
    }

    public final void h(ArrayList arrayList) {
        ArrayList<TLRPC.Reaction> topReactions;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.M0;
        if (i11 == 4) {
            Iterator it = this.f26167d0.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                yg.p0 p0Var = (yg.p0) it.next();
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
                yg.p0 c10 = yg.p0.c(enabledReactionsList.get(i10));
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
                        yg.p0 e = yg.p0.e(availableEffects.effects.get(i10));
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
                        yg.p0 d = yg.p0.d(savedReactionTags.tags.get(i13).reaction);
                        if (!hashSet.contains(d)) {
                            hashSet.add(d);
                            arrayList.add(d);
                        }
                    }
                }
                for (int i14 = 0; i14 < topReactions.size(); i14++) {
                    yg.p0 d10 = yg.p0.d(topReactions.get(i14));
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            } else {
                for (int i15 = 0; i15 < topReactions.size(); i15++) {
                    yg.p0 d11 = yg.p0.d(topReactions.get(i15));
                    if (!hashSet.contains(d11) && (i11 == 3 || UserConfig.getInstance(this.J).isPremium() || d11.f47102g == 0)) {
                        hashSet.add(d11);
                        arrayList.add(d11);
                    }
                }
            }
            if (i11 != 3 || UserConfig.getInstance(this.J).isPremium()) {
                ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.J).getRecentReactions();
                for (int i16 = 0; i16 < recentReactions.size(); i16++) {
                    yg.p0 d12 = yg.p0.d(recentReactions.get(i16));
                    if (!hashSet.contains(d12)) {
                        hashSet.add(d12);
                        arrayList.add(d12);
                    }
                }
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.J).getEnabledReactionsList();
                while (i10 < enabledReactionsList2.size()) {
                    yg.p0 c11 = yg.p0.c(enabledReactionsList2.get(i10));
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
                yg.p0 d13 = yg.p0.d(savedReactions.get(i10));
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
                arrayList.add(yg.p0.c(enabledReactionsList3.get(i10)));
                i10++;
            }
        }
    }

    public void j() {
        int i10 = 0;
        while (true) {
            bi.y1 y1Var = this.f26161b;
            if (i10 < y1Var.getChildCount()) {
                View childAt = y1Var.getChildAt(i10);
                if (childAt instanceof nk0) {
                    ((nk0) childAt).f25541b.invalidate();
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
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, dp, height, w02, 0, tileMode));
        this.f26184n.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, w02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, yg.p0 p0Var, boolean z10) {
        ok0 ok0Var = this.f26174g0;
        if (ok0Var != null) {
            ok0Var.l(view, p0Var, z10, true);
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
        this.f26185n0 = 0.0f;
        this.B0 = 0.0f;
        this.f26183l0 = null;
        this.f26190r0 = false;
        bk0 bk0Var = new bk0(this, 1);
        bi.y1 y1Var = this.f26161b;
        AndroidUtilities.forEachViews((RecyclerView) y1Var, (e2.h) bk0Var);
        this.C0.clear();
        y1Var.invalidate();
        bi.n7 n7Var = this.S;
        if (n7Var != null) {
            n7Var.invalidate();
        }
        invalidate();
    }

    public final void o(zg.a aVar, ch.e eVar) {
        this.Z0 = aVar;
        this.f26160a1 = eVar;
        bh.d c10 = aVar.c(this, null, true);
        c10.n(eVar);
        c10.p(AndroidUtilities.dp(24.0f));
        c10.o(AndroidUtilities.dp(8.0f));
        this.W0 = c10;
        bh.d c11 = aVar.c(this, null, true);
        c11.n(eVar);
        c11.p(AndroidUtilities.dp(8.0f));
        c11.o(AndroidUtilities.dp(8.0f));
        this.X0 = c11;
        bh.d c12 = aVar.c(this, null, true);
        c12.n(eVar);
        c12.p(AndroidUtilities.dp(4.0f));
        c12.o(AndroidUtilities.dp(8.0f));
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
        this.f26165c0 = false;
        if (i13 == 3) {
            this.E0 = UserConfig.getInstance(this.J).isPremium();
            h(arrayList2);
        } else if (i13 == 5) {
            this.E0 = true;
            h(arrayList2);
        } else if (this.I) {
            this.E0 = false;
            if (chatFull != null && chatFull.paid_reactions_available) {
                this.f26165c0 = true;
                ?? obj = new Object();
                obj.f47098a = true;
                arrayList2.add(obj);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.H.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i14);
                i14++;
                arrayList2.add(yg.p0.d(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.f26165c0 = true;
                ?? obj2 = new Object();
                obj2.f47098a = true;
                arrayList2.add(obj2);
            }
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat chat = MessagesController.getInstance(this.J).getChat(Long.valueOf(chatFull.f17196id));
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
                                arrayList2.add(yg.p0.d(reaction2));
                                break;
                            } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                arrayList2.add(yg.p0.d(reaction2));
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
                hashSet.add((yg.p0) arrayList2.get(i16));
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
                arrayList5.add((yg.p0) arrayList2.get(i17));
                i17++;
            }
            if (i17 < arrayList2.size()) {
                nk0.a(this.f26202z0, (yg.p0) arrayList2.get(i17), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.G0 = true;
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (((yg.p0) arrayList5.get(i18)).f47102g != 0) {
                this.G0 = false;
            }
        }
        ArrayList arrayList6 = this.V;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        fk0 fk0Var = this.f26159a0;
        pk0 pk0Var = fk0Var.d;
        ArrayList arrayList7 = pk0Var.e;
        ArrayList arrayList8 = pk0Var.T;
        ArrayList arrayList9 = pk0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i19 = 0; i19 < arrayList8.size(); i19++) {
            yg.p0 p0Var = (yg.p0) arrayList8.get(i19);
            if (p0Var.f47101f == null) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            arrayList9.add(new gk0(i11, p0Var));
        }
        if (!pk0Var.U.isEmpty() && !MessagesController.getInstance(pk0Var.J).premiumFeaturesBlocked()) {
            arrayList9.add(new gk0(1, null));
        }
        if (pk0Var.q()) {
            arrayList9.add(new gk0(2, null));
        }
        if (z10) {
            fk0Var.E(arrayList7, arrayList9);
        } else {
            fk0Var.l();
        }
        if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
            for (int i20 = 0; i20 < messageObject.messageOwner.reactions.results.size(); i20++) {
                if (messageObject.messageOwner.reactions.results.get(i20).chosen) {
                    this.f26167d0.add(yg.p0.d(messageObject.messageOwner.reactions.results.get(i20).reaction));
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
        org.telegram.ui.Cells.c1 c1Var = f26157k1;
        if (deviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, c1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, c1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new bi.t6(this, 1));
        duration.start();
    }

    @Override
    public void setAlpha(float f7) {
        if (getAlpha() != f7 && f7 == 0.0f) {
            this.C0.clear();
            int i10 = 0;
            while (true) {
                bi.y1 y1Var = this.f26161b;
                if (i10 >= y1Var.getChildCount()) {
                    break;
                }
                if (y1Var.getChildAt(i10) instanceof nk0) {
                    ((nk0) y1Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f7);
    }

    public void setBubbleOffset(float f7) {
        this.U0 = f7;
    }

    public void setChatScrimView(xo xoVar) {
        this.f26168d1 = xoVar;
    }

    public void setCurrentAccount(int i10) {
        this.J = i10;
    }

    public void setCustomEmojiEnterProgress(float f7) {
        this.f26197w0 = f7;
        xo xoVar = this.f26168d1;
        if (xoVar != null) {
            xoVar.setPopupAlpha(1.0f - f7);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            this.f26195v0.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 40)));
        } else {
            this.f26195v0.setBackground(null);
        }
    }

    public void setDelegate(ok0 ok0Var) {
        this.f26174g0 = ok0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        this.f26193t0 = p2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.Q0 = true;
        if (this.R0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.f6 f6Var = this.f26182k0;
            m90 m90Var = new m90(context, f6Var);
            this.R0 = m90Var;
            m90Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.R0.setClickable(true);
            this.R0.setTextSize(1, 12.0f);
            int i10 = this.M0;
            if (i10 != 1 && i10 != 2 && i10 != 4) {
                this.R0.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18325z6, f6Var));
            } else {
                this.R0.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
                this.R0.setAlpha(0.5f);
            }
            this.R0.setGravity(1);
            addView(this.R0, w7.a6.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.R0.setText(charSequence);
        this.f26170e1 = false;
        ((FrameLayout.LayoutParams) this.f26202z0.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.f26161b.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
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

    public void setParentLayout(xo xoVar) {
        this.J0 = xoVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.f26167d0;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            yg.p0 b10 = yg.p0.b(str);
            hashSet.add(b10);
            this.f26169e0.add(b10);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f26161b, (e2.h) new bk0(this, 0));
    }

    public void setSelectedReaction(yg.p0 p0Var) {
        HashSet hashSet = this.f26167d0;
        hashSet.clear();
        if (p0Var != null) {
            hashSet.add(p0Var);
        }
        this.f26159a0.l();
    }

    public void setSelectedReactionAnimated(yg.p0 p0Var) {
        HashSet hashSet = this.f26167d0;
        hashSet.clear();
        if (p0Var != null) {
            hashSet.add(p0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f26161b, (e2.h) new bk0(this, 0));
    }

    public void setSelectedReactionInclusive(yg.p0 p0Var) {
        HashSet hashSet = this.f26167d0;
        hashSet.clear();
        if (p0Var != null) {
            hashSet.add(p0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f26161b, (e2.h) new bk0(this, 0));
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.f26167d0;
        hashSet.clear();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = arrayList.get(i10);
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        hashSet.add(yg.p0.d(messageObject.messageOwner.reactions.results.get(i11).reaction));
                    }
                }
            }
        }
        this.f26159a0.l();
    }

    public void setSelectedReactionsInclusive(ArrayList<MessageObject> arrayList) {
        HashSet hashSet = this.f26167d0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        AndroidUtilities.forEachViews((RecyclerView) this.f26161b, (e2.h) new bk0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.f26166c1 != z10) {
            this.f26166c1 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    bi.y1 y1Var = this.f26161b;
                    if (i10 >= y1Var.getChildCount()) {
                        break;
                    }
                    if (y1Var.getChildAt(i10) instanceof nk0) {
                        nk0 nk0Var = (nk0) y1Var.getChildAt(i10);
                        boolean z11 = nk0Var.f25545r;
                        mk0 mk0Var = nk0Var.f25541b;
                        if (z11 && (mk0Var.getImageReceiver().getLottieAnimation() != null || mk0Var.getImageReceiver().getAnimation() != null)) {
                            mk0Var.setVisibility(0);
                            nk0Var.f25540a.setVisibility(4);
                            if (nk0Var.f25546s) {
                                nk0Var.v = true;
                            }
                        }
                        nk0Var.invalidate();
                    }
                    i10++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.f26167d0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(yg.p0.d(reaction));
        }
        this.f26159a0.l();
    }

    public void setTop(boolean z10) {
        this.L = z10;
    }

    public void setTransitionProgress(float f7) {
        this.v = f7;
        xo xoVar = this.J0;
        if (xoVar != null) {
            xoVar.setReactionsTransitionProgress((this.K0 && SharedConfig.deviceIsHigh()) ? 1.0f : 1.0f);
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
