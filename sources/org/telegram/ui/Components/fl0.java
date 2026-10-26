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
import org.telegram.messenger.FileLog;
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
public class fl0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public static final org.telegram.ui.Cells.b1 l1 = new org.telegram.ui.Cells.b1(Float.class, "transitionProgress", 2);
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
    public ep J0;
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
    public z90 R0;
    public bh.p S;
    public int S0;
    public final ArrayList T;
    public int T0;
    public final ArrayList U;
    public float U0;
    public final ArrayList V;
    public float V0;
    public final ig.j0 W;
    public eh.d W0;
    public eh.d X0;
    public eh.d Y0;
    public ch.b Z0;
    public boolean f28228a;
    public final vk0 f28229a0;
    public fh.e f28230a1;
    public final bi.r1 f28231b;
    public final RectF f28232b0;
    public int f28233b1;
    public final float f28234c;
    public boolean f28235c0;
    public boolean f28236c1;
    public final ArrayList d;
    public final HashSet f28237d0;
    public boolean f28238d1;
    public final ArrayList e;
    public final HashSet f28239e0;
    public ep f28240e1;
    public final Paint f28241f;
    public final int[] f28242f0;
    public boolean f28243f1;
    public el0 f28244g0;
    public boolean f28245g1;
    public final Paint h;
    public final Rect f28246h0;
    public boolean f28247h1;
    public final Drawable f28248i0;
    public Paint f28249i1;
    public final boolean f28250j0;
    public Matrix f28251j1;
    public final org.telegram.ui.ActionBar.u6 f28252k0;
    public LinearGradient f28253k1;
    public bh.x0 f28254l0;
    public int m0;
    public final Paint f28255n;
    public float f28256n0;
    public float f28257o0;
    public float f28258p0;
    public float f28259q0;
    public float f28260r;
    public boolean f28261r0;
    public float f28262s;
    public long f28263s0;
    public org.telegram.ui.ActionBar.r2 f28264t0;
    public tg.c1 f28265u0;
    public float v;
    public fs f28266v0;
    public final RectF f28267w;
    public float f28268w0;
    public final Path f28269x;
    public bh.i0 f28270x0;
    public float f28271y;
    public ValueAnimator f28272y0;
    public final dl0 f28273z0;

    public fl0(int i10, int i11, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f28228a = false;
        this.d = new ArrayList();
        this.e = new ArrayList();
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.f28241f = paint;
        this.h = new Paint(1);
        this.f28255n = new Paint(1);
        this.v = 1.0f;
        this.f28267w = new RectF();
        this.f28269x = new Path();
        this.f28271y = AndroidUtilities.dp(72.0f);
        float dp = AndroidUtilities.dp(8.0f);
        this.E = dp;
        this.F = dp / 2.0f;
        this.G = AndroidUtilities.dp(36.0f);
        this.T = new ArrayList(20);
        this.U = new ArrayList(10);
        this.V = new ArrayList(20);
        this.f28232b0 = new RectF();
        this.f28235c0 = false;
        this.f28237d0 = new HashSet();
        this.f28239e0 = new HashSet();
        this.f28242f0 = new int[2];
        Rect rect = new Rect();
        this.f28246h0 = rect;
        new ArrayList();
        this.C0 = new HashSet();
        this.D0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.H0 = paint2;
        Paint paint3 = new Paint(1);
        this.I0 = paint3;
        this.L0 = new AnimationNotificationsLocker();
        this.O0 = true;
        this.f28245g1 = false;
        this.M0 = i10;
        this.f28234c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23448i6, u6Var));
        paint3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Jj, u6Var));
        this.f28252k0 = u6Var;
        this.J = i11;
        this.f28264t0 = r2Var;
        dl0 dl0Var = new dl0(this, context);
        this.f28273z0 = dl0Var;
        dl0Var.setVisibility(8);
        dl0Var.O = false;
        dl0Var.f27552c.setVisibility(8);
        addView(dl0Var);
        this.f28250j0 = (!SharedConfig.animationsEnabled() || SharedConfig.getDevicePerformanceClass() == 0) ? false : z10;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f28248i0 = mutate;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.Td, null, PorterDuff.Mode.MULTIPLY);
        bi.r1 r1Var = new bi.r1(this, context, 19);
        this.f28231b = r1Var;
        r1Var.setClipChildren(false);
        r1Var.setClipToPadding(false);
        ig.j0 j0Var = new ig.j0((ViewGroup) this, 4);
        this.W = j0Var;
        r1Var.i(new sk0(this, 0));
        r1Var.setLayoutManager(j0Var);
        r1Var.setOverScrollMode(2);
        vk0 vk0Var = new vk0(this);
        this.f28229a0 = vk0Var;
        r1Var.setAdapter(vk0Var);
        r1Var.j(new zk0(this));
        r1Var.j(new ml(this, 10));
        r1Var.i(new sk0(this, 1));
        r1Var.setOnItemClickListener(new j(this, 11));
        r1Var.setOnItemLongClickListener((bm0) new i2.r(this, i10, 9));
        addView(r1Var, gb1.g(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (r1Var.getLayoutParams().height - r1Var.getPaddingTop()) - r1Var.getPaddingBottom();
        dl0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        dl0Var.getLayoutParams().height = paddingTop;
        if (i10 != 2 && i10 != 4) {
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, u6Var));
        } else {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        }
        MediaDataController.getInstance(i11).preloadDefaultReactions();
    }

    public static void a(fl0 fl0Var) {
        if (fl0Var.f28270x0 != null) {
            return;
        }
        bh.i0 i0Var = new bh.i0(fl0Var.M0, fl0Var.f28264t0, fl0Var.V, fl0Var.f28237d0, fl0Var, fl0Var.f28252k0, fl0Var.f28228a);
        fl0Var.f28270x0 = i0Var;
        ch.b bVar = fl0Var.Z0;
        boolean z10 = true;
        if (bVar != null) {
            fh.e eVar = fl0Var.f28230a1;
            org.telegram.ui.t41 t41Var = i0Var.f4056m.f38295f0;
            t41Var.f43007x = true;
            t41Var.setBackground(null);
            t41Var.updateColors();
            t41Var.invalidate();
            eh.d c10 = bVar.c(i0Var.f4047a, null, true);
            c10.v(eVar);
            org.telegram.messenger.vh.s(c10, AndroidUtilities.dp(12.0f), 8.0f);
            i0Var.f4068z = c10;
        }
        bh.i0 i0Var2 = fl0Var.f28270x0;
        el0 el0Var = fl0Var.f28244g0;
        if (el0Var != null && !el0Var.f()) {
            z10 = false;
        }
        i0Var2.f4056m.setLongPressEnabled(z10);
        fl0Var.j();
        fl0Var.f28270x0.f4059p = new wa0(fl0Var, 18);
        fl0Var.m();
    }

    public static void b(fl0 fl0Var, View view, float f7) {
        if (view instanceof dl0) {
            ((dl0) view).h = f7;
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
        boolean z10 = true;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            hashSet.clear();
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        bh.x0 d = bh.x0.d(messageObject.messageOwner.reactions.results.get(i11).reaction);
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
                hashSet2.add((bh.x0) longSparseArray.valueAt(i13));
            }
        }
        return hashSet2;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23427h5));
    }

    public final void d(boolean z10) {
        bh.i0 i0Var = this.f28270x0;
        if (i0Var != null) {
            if (!i0Var.f4060q || !z10) {
                i0Var.f4060q = true;
                if (!z10) {
                    i0Var.f();
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new bh.z(i0Var, 0));
                    ofFloat.addListener(new bh.g0(i0Var, 0));
                    ofFloat.setDuration(150L);
                    ofFloat.start();
                }
            }
            this.f28270x0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22028id == this.K && getVisibility() != 0 && !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                p(this.H, null, true);
                setVisibility(0);
                r(false);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            if (this.M0 == 4) {
                invalidate();
                bi.r1 r1Var = this.f28231b;
                r1Var.invalidate();
                r1Var.g1();
                for (int i12 = 0; i12 < r1Var.getChildCount(); i12++) {
                    View childAt = r1Var.getChildAt(i12);
                    if (childAt instanceof dl0) {
                        dl0 dl0Var = (dl0) childAt;
                        dl0Var.f27550a.invalidate();
                        dl0Var.f27551b.invalidate();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fl0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        bh.i0 i0Var = this.f28270x0;
        if (i0Var != null) {
            i0Var.d();
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
        RectF rectF = this.f28267w;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), ds.f27586f.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f14 = rectF.bottom;
            ds dsVar = ds.f27586f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f14, 0.0f, dsVar.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), dsVar.getInterpolation(this.O)));
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
        Drawable drawable = this.f28248i0;
        drawable.setAlpha(i10);
        Paint paint = this.f28241f;
        paint.setAlpha(i10);
        float f16 = f15 - f7;
        float f17 = dp;
        float f18 = f17 * f10;
        float f19 = height - f7;
        float f20 = f15 + f7;
        float f21 = height + f7;
        drawable.setBounds((int) (f16 - f18), (int) (f19 - f18), (int) (f20 + f18), (int) (f18 + f21));
        drawable.draw(canvas);
        boolean o10 = this.f28244g0.o();
        float f22 = height;
        RectF rectF2 = this.f28232b0;
        if (o10) {
            rectF2.set(f16, f19, f20, f21);
            f12 = f7;
            this.f28244g0.l(canvas, rectF2, f12, getX(), getY(), i10, false);
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
        float lerp = AndroidUtilities.lerp(height2, (f25 + f17) - g(), ds.f27586f.getInterpolation(this.O));
        float f26 = (-AndroidUtilities.dp(1.0f)) * f10;
        drawable.setBounds((int) ((f24 - f12) - f26), (int) ((lerp - f12) - f26), (int) (f24 + f12 + f26), (int) (f12 + lerp + f26));
        drawable.draw(canvas);
        if (this.f28244g0.o()) {
            rectF2.set(f24 - f11, lerp - f11, f24 + f11, lerp + f11);
            this.f28244g0.l(canvas, rectF2, f11, getX(), getY(), i10, false);
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

    public el0 getDelegate() {
        return this.f28244g0;
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

    public bh.i0 getReactionsWindow() {
        return this.f28270x0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document f7;
        HashSet hashSet = this.f28237d0;
        if (hashSet.isEmpty()) {
            return "";
        }
        bh.x0 x0Var = (bh.x0) hashSet.iterator().next();
        long j10 = x0Var.f4209g;
        String str = null;
        if (j10 != 0 && (f7 = t5.f(this.J, j10)) != null) {
            str = MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = x0Var.f4208f;
        }
        if (TextUtils.isEmpty(str)) {
            return "👍";
        }
        return str;
    }

    public HashSet<bh.x0> getSelectedReactions() {
        return this.f28237d0;
    }

    public float getTopOffset() {
        if (this.Q0) {
            return ((FrameLayout.LayoutParams) this.f28231b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (!q()) {
            return AndroidUtilities.dp(16.0f) + c3.h0.w(itemsCount, 1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(36.0f) * itemsCount);
        }
        return (AndroidUtilities.dp(36.0f) * itemsCount) - AndroidUtilities.dp(4.0f);
    }

    public List<bh.x0> getVisibleReactionsList() {
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
        bh.i0 i0Var = this.f28270x0;
        if (i0Var == null) {
            return null;
        }
        return i0Var.f4049c;
    }

    public final void h(ArrayList arrayList) {
        ArrayList<TLRPC.Reaction> topReactions;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.M0;
        if (i11 == 4) {
            Iterator it = this.f28237d0.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                bh.x0 x0Var = (bh.x0) it.next();
                if (!hashSet.contains(x0Var)) {
                    hashSet.add(x0Var);
                    arrayList.add(x0Var);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.J).getEnabledReactionsList();
            while (i10 < enabledReactionsList.size()) {
                bh.x0 c10 = bh.x0.c(enabledReactionsList.get(i10));
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
                        bh.x0 e = bh.x0.e(availableEffects.effects.get(i10));
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
                        bh.x0 d = bh.x0.d(savedReactionTags.tags.get(i13).reaction);
                        if (!hashSet.contains(d)) {
                            hashSet.add(d);
                            arrayList.add(d);
                        }
                    }
                }
                for (int i14 = 0; i14 < topReactions.size(); i14++) {
                    bh.x0 d10 = bh.x0.d(topReactions.get(i14));
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            } else {
                for (int i15 = 0; i15 < topReactions.size(); i15++) {
                    bh.x0 d11 = bh.x0.d(topReactions.get(i15));
                    if (!hashSet.contains(d11) && (i11 == 3 || UserConfig.getInstance(this.J).isPremium() || d11.f4209g == 0)) {
                        hashSet.add(d11);
                        arrayList.add(d11);
                    }
                }
            }
            if (i11 != 3 || UserConfig.getInstance(this.J).isPremium()) {
                ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.J).getRecentReactions();
                for (int i16 = 0; i16 < recentReactions.size(); i16++) {
                    bh.x0 d12 = bh.x0.d(recentReactions.get(i16));
                    if (!hashSet.contains(d12)) {
                        hashSet.add(d12);
                        arrayList.add(d12);
                    }
                }
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.J).getEnabledReactionsList();
                while (i10 < enabledReactionsList2.size()) {
                    bh.x0 c11 = bh.x0.c(enabledReactionsList2.get(i10));
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
                bh.x0 d13 = bh.x0.d(savedReactions.get(i10));
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
                arrayList.add(bh.x0.c(enabledReactionsList3.get(i10)));
                i10++;
            }
        }
    }

    public void j() {
        int i10 = 0;
        while (true) {
            bi.r1 r1Var = this.f28231b;
            if (i10 < r1Var.getChildCount()) {
                View childAt = r1Var.getChildAt(i10);
                if (childAt instanceof dl0) {
                    ((dl0) childAt).f27551b.invalidate();
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
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G8, false);
        this.f28233b1 = x02;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, dp, height, x02, 0, tileMode));
        this.f28255n.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, x02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, bh.x0 x0Var, boolean z10) {
        el0 el0Var = this.f28244g0;
        if (el0Var != null) {
            el0Var.p(view, x0Var, z10, true);
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
        this.f28256n0 = 0.0f;
        this.B0 = 0.0f;
        this.f28254l0 = null;
        this.f28261r0 = false;
        rk0 rk0Var = new rk0(this, 1);
        bi.r1 r1Var = this.f28231b;
        AndroidUtilities.forEachViews((RecyclerView) r1Var, (Utilities.Callback<View>) rk0Var);
        this.C0.clear();
        r1Var.invalidate();
        bh.p pVar = this.S;
        if (pVar != null) {
            pVar.invalidate();
        }
        invalidate();
    }

    public final void o(ch.b bVar, fh.e eVar) {
        this.Z0 = bVar;
        this.f28230a1 = eVar;
        eh.d c10 = bVar.c(this, null, true);
        c10.v(eVar);
        org.telegram.messenger.vh.s(c10, AndroidUtilities.dp(24.0f), 8.0f);
        this.W0 = c10;
        eh.d c11 = bVar.c(this, null, true);
        c11.v(eVar);
        org.telegram.messenger.vh.s(c11, AndroidUtilities.dp(8.0f), 8.0f);
        this.X0 = c11;
        eh.d c12 = bVar.c(this, null, true);
        c12.v(eVar);
        org.telegram.messenger.vh.s(c12, AndroidUtilities.dp(4.0f), 8.0f);
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
        this.f28235c0 = false;
        if (i13 == 3) {
            this.E0 = UserConfig.getInstance(this.J).isPremium();
            h(arrayList2);
        } else if (i13 == 5) {
            this.E0 = true;
            h(arrayList2);
        } else if (this.I) {
            this.E0 = false;
            if (chatFull != null && chatFull.paid_reactions_available) {
                this.f28235c0 = true;
                ?? obj = new Object();
                obj.f4205a = true;
                arrayList2.add(obj);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.H.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i14);
                i14++;
                arrayList2.add(bh.x0.d(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.f28235c0 = true;
                ?? obj2 = new Object();
                obj2.f4205a = true;
                arrayList2.add(obj2);
            }
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat chat = MessagesController.getInstance(this.J).getChat(Long.valueOf(chatFull.f22028id));
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
                                arrayList2.add(bh.x0.d(reaction2));
                                break;
                            } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                arrayList2.add(bh.x0.d(reaction2));
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
                hashSet.add((bh.x0) arrayList2.get(i16));
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
            int i17 = 0;
            if (dp < 1) {
                dp = 1;
            }
            while (i17 < Math.min(arrayList2.size(), dp)) {
                arrayList5.add((bh.x0) arrayList2.get(i17));
                i17++;
            }
            if (i17 < arrayList2.size()) {
                dl0.a(this.f28273z0, (bh.x0) arrayList2.get(i17), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.G0 = true;
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (((bh.x0) arrayList5.get(i18)).f4209g != 0) {
                this.G0 = false;
            }
        }
        ArrayList arrayList6 = this.V;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        vk0 vk0Var = this.f28229a0;
        fl0 fl0Var = vk0Var.d;
        ArrayList arrayList7 = fl0Var.e;
        ArrayList arrayList8 = fl0Var.T;
        ArrayList arrayList9 = fl0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i19 = 0; i19 < arrayList8.size(); i19++) {
            bh.x0 x0Var = (bh.x0) arrayList8.get(i19);
            if (x0Var.f4208f == null) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            arrayList9.add(new wk0(i11, x0Var));
        }
        if (!fl0Var.U.isEmpty() && !MessagesController.getInstance(fl0Var.J).premiumFeaturesBlocked()) {
            arrayList9.add(new wk0(1, null));
        }
        if (fl0Var.q()) {
            arrayList9.add(new wk0(2, null));
        }
        if (z10) {
            vk0Var.E(arrayList7, arrayList9);
        } else {
            vk0Var.l();
        }
        if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
            for (int i20 = 0; i20 < messageObject.messageOwner.reactions.results.size(); i20++) {
                if (messageObject.messageOwner.reactions.results.get(i20).chosen) {
                    this.f28237d0.add(bh.x0.d(messageObject.messageOwner.reactions.results.get(i20).reaction));
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
        org.telegram.ui.Cells.b1 b1Var = l1;
        if (deviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new fi.j5(this, 1));
        duration.start();
    }

    @Override
    public void setAlpha(float f7) {
        if (getAlpha() != f7 && f7 == 0.0f) {
            this.C0.clear();
            int i10 = 0;
            while (true) {
                bi.r1 r1Var = this.f28231b;
                if (i10 >= r1Var.getChildCount()) {
                    break;
                }
                if (r1Var.getChildAt(i10) instanceof dl0) {
                    ((dl0) r1Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f7);
    }

    public void setBubbleOffset(float f7) {
        this.U0 = f7;
    }

    public void setChatScrimView(ep epVar) {
        this.f28240e1 = epVar;
    }

    public void setCurrentAccount(int i10) {
        this.J = i10;
    }

    public void setCustomEmojiEnterProgress(float f7) {
        this.f28268w0 = f7;
        ep epVar = this.f28240e1;
        if (epVar != null) {
            epVar.setPopupAlpha(1.0f - f7);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            fs fsVar = this.f28266v0;
            int dp = AndroidUtilities.dp(28.0f);
            int i10 = org.telegram.ui.ActionBar.y6.f23448i6;
            org.telegram.ui.ActionBar.f7.R(fsVar, org.telegram.ui.ActionBar.y6.i0(dp, 0, i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i10, false), 40)), null, org.telegram.ui.ActionBar.f7.h(i10, 40), null);
            return;
        }
        this.f28266v0.setBackground(null);
    }

    public void setDelegate(el0 el0Var) {
        this.f28244g0 = el0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.r2 r2Var) {
        this.f28264t0 = r2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.Q0 = true;
        if (this.R0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.u6 u6Var = this.f28252k0;
            z90 z90Var = new z90(context, u6Var);
            this.R0 = z90Var;
            z90Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.R0.setClickable(true);
            this.R0.setTextSize(1, 12.0f);
            int i10 = this.M0;
            if (i10 != 1 && i10 != 2 && i10 != 4) {
                org.telegram.ui.ActionBar.f7.V(this.R0, org.telegram.ui.ActionBar.y6.f23767z6, u6Var);
            } else {
                org.telegram.ui.ActionBar.f7.V(this.R0, org.telegram.ui.ActionBar.y6.G6, u6Var);
                this.R0.setAlpha(0.5f);
            }
            this.R0.setGravity(1);
            addView(this.R0, gb1.h(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.R0.setText(charSequence);
        this.f28243f1 = false;
        ((FrameLayout.LayoutParams) this.f28273z0.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.f28231b.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
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

    public void setParentLayout(ep epVar) {
        this.J0 = epVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.f28237d0;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            bh.x0 b10 = bh.x0.b(str);
            hashSet.add(b10);
            this.f28239e0.add(b10);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f28231b, (Utilities.Callback<View>) new rk0(this, 0));
    }

    public void setSelectedReaction(bh.x0 x0Var) {
        HashSet hashSet = this.f28237d0;
        hashSet.clear();
        if (x0Var != null) {
            hashSet.add(x0Var);
        }
        this.f28229a0.l();
    }

    public void setSelectedReactionAnimated(bh.x0 x0Var) {
        HashSet hashSet = this.f28237d0;
        hashSet.clear();
        if (x0Var != null) {
            hashSet.add(x0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f28231b, (Utilities.Callback<View>) new rk0(this, 0));
    }

    public void setSelectedReactionInclusive(bh.x0 x0Var) {
        HashSet hashSet = this.f28237d0;
        hashSet.clear();
        if (x0Var != null) {
            hashSet.add(x0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f28231b, (Utilities.Callback<View>) new rk0(this, 0));
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.f28237d0;
        hashSet.clear();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = arrayList.get(i10);
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        hashSet.add(bh.x0.d(messageObject.messageOwner.reactions.results.get(i11).reaction));
                    }
                }
            }
        }
        this.f28229a0.l();
    }

    public void setSelectedReactionsInclusive(ArrayList<MessageObject> arrayList) {
        HashSet hashSet = this.f28237d0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        AndroidUtilities.forEachViews((RecyclerView) this.f28231b, (Utilities.Callback<View>) new rk0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.f28238d1 != z10) {
            this.f28238d1 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    bi.r1 r1Var = this.f28231b;
                    if (i10 >= r1Var.getChildCount()) {
                        break;
                    }
                    if (r1Var.getChildAt(i10) instanceof dl0) {
                        dl0 dl0Var = (dl0) r1Var.getChildAt(i10);
                        boolean z11 = dl0Var.f27555r;
                        cl0 cl0Var = dl0Var.f27551b;
                        if (z11 && (cl0Var.getImageReceiver().getLottieAnimation() != null || cl0Var.getImageReceiver().getAnimation() != null)) {
                            cl0Var.setVisibility(0);
                            dl0Var.f27550a.setVisibility(4);
                            if (dl0Var.f27556s) {
                                dl0Var.v = true;
                            }
                        }
                        dl0Var.invalidate();
                    }
                    i10++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.f28237d0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(bh.x0.d(reaction));
        }
        this.f28229a0.l();
    }

    public void setTop(boolean z10) {
        this.L = z10;
    }

    public void setTransitionProgress(float f7) {
        this.v = f7;
        ep epVar = this.J0;
        if (epVar != null) {
            epVar.setReactionsTransitionProgress((this.K0 && SharedConfig.deviceIsHigh()) ? 1.0f : 1.0f);
        }
        invalidate();
    }

    @Override
    public void setTranslationX(float f7) {
        if (f7 != getTranslationX()) {
            super.setTranslationX(f7);
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        Paint paint = this.f28241f;
        if (paint != null) {
            try {
                int i10 = this.M0;
                if (i10 != 2 && i10 != 4 && paint.getColor() != (w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, this.f28252k0))) {
                    int alpha = paint.getAlpha();
                    paint.setColor(w02);
                    paint.setAlpha(alpha);
                    invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        tg.c1 c1Var = this.f28265u0;
        if (c1Var != null) {
            c1Var.setColor(i0.a.f(0.7f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.F8, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23427h5, false)));
        }
        if (getWidth() > 0 && getHeight() > 0 && this.f28233b1 != org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G8, false)) {
            k();
        }
    }

    public void m() {
    }
}
