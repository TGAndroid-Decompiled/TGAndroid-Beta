package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.v01;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gz;
import org.telegram.ui.lk;
import org.telegram.ui.xn;
public final class o3 extends FrameLayout {
    public static final HashMap K = new HashMap();
    public static final HashMap L = new HashMap();
    public static TextPaint M;
    public final RectF E;
    public ValueAnimator F;
    public float G;
    public int H;
    public final HashSet I;
    public final HashSet J;
    public final Paint f19690a;
    public boolean f19691b;
    public boolean f19692c;
    public final ActionBarLayout d;
    public final m3 e;
    public int f19693f;
    public final org.telegram.ui.Components.h5 h;
    public int f19694n;
    public final org.telegram.ui.Components.h5 f19695r;
    public boolean f19696s;
    public final org.telegram.ui.Components.e6 v;
    public int f19697w;
    public boolean f19698x;
    public boolean f19699y;

    public o3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f19690a = new Paint(1);
        this.f19691b = true;
        this.f19692c = false;
        sr srVar = sr.h;
        this.h = new org.telegram.ui.Components.h5(this, 200L, srVar, 0);
        this.f19695r = new org.telegram.ui.Components.h5(this, 200L, srVar, 0);
        this.v = new org.telegram.ui.Components.e6(this, 0L, 200L, srVar);
        this.f19697w = UserConfig.selectedAccount;
        this.E = new RectF();
        this.I = new HashSet();
        this.J = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(i6.w0(null, i6.f19001a7, false));
        m3 m3Var = new m3(this, this);
        this.e = m3Var;
        r0.i0.k(this, m3Var);
        n();
        o(false);
    }

    public static TextPaint getTextPaint() {
        if (M == null) {
            TextPaint textPaint = new TextPaint(1);
            M = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            M.setTextSize(AndroidUtilities.dp(17.0f));
        }
        return M;
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(35);
        if (indexOf >= 0) {
            return str.substring(0, indexOf + 1);
        }
        return str;
    }

    public final void b() {
        x3 x3Var;
        ValueAnimator valueAnimator;
        ArrayList<n3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        n3 n3Var = (n3) hg.k0.g(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            x3Var = null;
        } else {
            x3Var = launchActivity.f31148y0;
        }
        if (x3Var != null && (valueAnimator = x3Var.d) != null) {
            valueAnimator.cancel();
            x3Var.d = null;
        }
        if (size != 1 && x3Var != null) {
            x3Var.f();
        } else {
            e(n3Var);
        }
    }

    public final l3 c(n3 n3Var) {
        ArrayList<l3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            if (tabDrawables.get(i10).f19602a == n3Var) {
                return tabDrawables.get(i10);
            }
        }
        return null;
    }

    public final void d(RectF rectF, float f7) {
        rectF.set(AndroidUtilities.dp(4.0f), (getHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(50.0f), getWidth() - AndroidUtilities.dp(4.0f), getHeight() - AndroidUtilities.dp(4.0f));
        rectF.offset(0.0f, (-AndroidUtilities.dp(8.0f)) * f7);
        float lerp = AndroidUtilities.lerp(1.0f, 0.95f, Math.abs(f7));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float width = rectF.width();
        float height = rectF.height();
        float f10 = (width / 2.0f) * lerp;
        rectF.left = centerX - f10;
        rectF.right = centerX + f10;
        float f11 = (height / 2.0f) * lerp;
        rectF.top = centerY - f11;
        rectF.bottom = centerY + f11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        getTabs();
        ArrayList<l3> tabDrawables = getTabDrawables();
        if (this.G > 0.0f) {
            this.f19690a.setColor(this.h.a(this.f19693f, false));
            super.dispatchDraw(canvas);
            int a2 = this.f19695r.a(this.f19694n, false);
            float e = this.v.e(this.f19696s);
            if (this.f19691b) {
                int i10 = 0;
                while (i10 < tabDrawables.size()) {
                    l3 l3Var = tabDrawables.get(i10);
                    float c10 = l3Var.c();
                    float b10 = l3Var.b();
                    if (b10 <= 0.0f || c10 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.E;
                        d(rectF, c10);
                        l3Var.v = 0.0f;
                        if (e > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        l3Var.f19610l = a2;
                        l3Var.f19612n = z10;
                        canvas2 = canvas;
                        l3Var.a(canvas2, rectF, AndroidUtilities.dp(18.0f), b10, 1.0f);
                    }
                    i10++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        m3 m3Var;
        if (this.f19691b && !getTabs().isEmpty() && (m3Var = this.e) != null && m3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(n3 n3Var) {
        xn xnVar;
        lk lkVar;
        o2 R = LaunchActivity.R();
        if (R != null && R.getParentActivity() != null) {
            boolean z10 = R instanceof xn;
            if (z10 && (lkVar = (xnVar = (xn) R).Y) != null) {
                lkVar.P();
                xnVar.Y.n0(true, false, true);
            }
            if (n3Var.J != null) {
                gz sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.j4 j4Var = n3Var.J;
                org.telegram.ui.w3 w3Var = j4Var.K;
                j3.b(w3Var);
                sheetFragment.addSheet(w3Var);
                org.telegram.ui.v3 v3Var = w3Var.f38795c;
                w3Var.h = false;
                w3Var.f38797n = false;
                ValueAnimator valueAnimator = w3Var.f38802y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = w3Var.E;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                w3Var.f38801x = 0.0f;
                w3Var.f38800w = 0.0f;
                w3Var.h();
                w3Var.n();
                v3Var.invalidate();
                v3Var.requestLayout();
                j4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
                w3Var.g(sheetFragment);
                w3Var.f();
                h(this.f19697w, n3Var, false);
                return;
            }
            new ai.g3(24, this, n3Var).run(R);
            if (n3Var.C) {
                if (!z10 || ((xn) R).a() != n3Var.f19649a.f8326c) {
                    this.f19692c = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, R, xn.R9(n3Var.f19649a.f8326c), 4), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<n3> tabs = getTabs();
        ArrayList<l3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            tabs.get(i10).a();
        }
        tabs.clear();
        for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
            tabDrawables.get(i11).f19604c = -1;
        }
        n();
        o(true);
        invalidate();
        tabs.isEmpty();
    }

    public final void g(n3 n3Var, Utilities.Callback callback) {
        String str;
        if (n3Var == null) {
            callback.run(Boolean.TRUE);
        } else if (!n3Var.f19669y) {
            h(this.f19697w, n3Var, true);
            callback.run(Boolean.TRUE);
        } else {
            TLRPC.User user = MessagesController.getInstance(n3Var.f19649a.f8324a).getUser(Long.valueOf(n3Var.f19649a.f8326c));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            c2 c2Var = alertDialog$Builder.f18655a;
            c2Var.R = str;
            c2Var.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new ai.g6(this, zArr, n3Var, callback, r8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ai.q5(zArr, callback, r8, 16));
            c2[] c2VarArr = {c2Var};
            c2Var.setOnDismissListener(new k3(zArr, callback));
            c2VarArr[0].show();
            ((TextView) c2VarArr[0].d(-1)).setTextColor(i6.w0(null, i6.f19297q7, false));
        }
    }

    public Paint getBackgroundPaint() {
        return this.f19690a;
    }

    public int getExpandedHeight() {
        int size = getTabs().size();
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return AndroidUtilities.dp(60.0f);
        }
        return AndroidUtilities.dp(68.0f);
    }

    public ArrayList<l3> getTabDrawables() {
        int i10 = this.f19697w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = L;
        ArrayList<l3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<l3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<n3> getTabs() {
        int i10 = this.f19697w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = K;
        ArrayList<n3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<n3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i10, n3 n3Var, boolean z10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i10);
        HashMap hashMap2 = L;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i10);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(n3Var);
        if (z10) {
            n3Var.a();
        }
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            l3 l3Var = (l3) arrayList3.get(i11);
            int indexOf = arrayList.indexOf(l3Var.f19602a);
            l3Var.f19604c = indexOf;
            if (indexOf >= 0) {
                l3Var.f19603b = indexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, arrayList3, n3Var, 5), 320L);
        o(true);
        invalidate();
        m3 m3Var = this.e;
        if (m3Var != null) {
            m3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        float f7;
        if (i10 != this.f19693f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z12 = false;
            z10 = (!actionBarLayout.Q || actionBarLayout.T) ? false : false;
            this.f19693f = i10;
            if (AndroidUtilities.computePerceivedBrightness(i10) < 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                f7 = 0.08f;
            } else {
                f7 = 0.75f;
            }
            int v = i6.v(i10, i6.l1(f7, -1));
            this.f19694n = v;
            if (AndroidUtilities.computePerceivedBrightness(v) < 0.721f) {
                z12 = true;
            }
            this.f19696s = z12;
            if (!z10) {
                this.h.a(this.f19693f, true);
                this.f19695r.a(this.f19694n, true);
                this.v.f(this.f19696s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f7, float f10, int i10) {
        n3 n3Var;
        boolean z10;
        ArrayList<n3> tabs = getTabs();
        ArrayList<l3> tabDrawables = getTabDrawables();
        if (this.f19691b) {
            if (tabs.isEmpty()) {
                n3Var = null;
            } else {
                n3Var = tabs.get(0);
            }
            l3 c10 = c(n3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.z zVar = c10.f19609k;
                float c11 = c10.c();
                RectF rectF = this.E;
                d(rectF, c11);
                if (i10 != 0 && i10 != 2) {
                    if (i10 == 1 || i10 == 3) {
                        if (this.f19699y && i10 == 1) {
                            b();
                        } else if (this.f19698x && i10 == 1) {
                            g(n3Var, new ai.i(6));
                        }
                        this.f19698x = false;
                        this.f19699y = false;
                        zVar.setState(new int[0]);
                    }
                } else {
                    boolean contains = zVar.getBounds().contains((int) (f7 - rectF.left), (int) (f10 - rectF.centerY()));
                    this.f19698x = contains;
                    if (!contains && rectF.contains(f7, f10)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f19699y = z10;
                    zVar.setState(this.f19698x ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
                    if (tabDrawables.get(i11) != c10) {
                        tabDrawables.get(i11).f19609k.setState(new int[0]);
                    }
                }
            } else {
                this.f19699y = false;
                this.f19698x = false;
            }
        } else {
            this.f19699y = false;
            this.f19698x = false;
        }
        if (this.f19699y || this.f19698x) {
            return true;
        }
        return false;
    }

    public final n3 k(ei.f5 f5Var) {
        Integer valueOf = Integer.valueOf(this.f19697w);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.f19697w);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            n3 n3Var = (n3) arrayList.get(i10);
            if (f5Var.equals(n3Var.f19649a)) {
                e(n3Var);
                return n3Var;
            }
        }
        return null;
    }

    public final n3 l(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final n3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<n3> tabs = getTabs();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            n3 n3Var = tabs.get(i10);
            org.telegram.ui.j4 j4Var = n3Var.J;
            if (j4Var != null && !j4Var.f34611d0.isEmpty()) {
                Object g10 = hg.k0.g(1, n3Var.J.f34611d0);
                if ((g10 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) g10).f18482id == webPage.f18482id) {
                    e(n3Var);
                    return n3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence replaceEmoji;
        ArrayList<n3> tabs = getTabs();
        ArrayList<l3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            l3 l3Var = tabDrawables.get(i10);
            if (tabs.size() > 1 && l3Var.f19603b == 0) {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, l3Var.f19602a.b()), getTextPaint().getFontMetricsInt(), false);
                if (replaceEmoji == null) {
                    l3Var.f19619u = null;
                } else {
                    l3Var.f19619u = new v01(replaceEmoji, 17.0f, AndroidUtilities.bold());
                }
            } else {
                replaceEmoji = Emoji.replaceEmoji(l3Var.f19602a.b(), getTextPaint().getFontMetricsInt(), false);
                l3Var.f19619u = null;
            }
            charSequence = replaceEmoji;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(LocaleController.formatString(R.string.AccDescrTabs, ""));
            return;
        }
        setImportantForAccessibility(1);
        int i11 = R.string.AccDescrTabs;
        if (charSequence == null) {
            charSequence = "";
        }
        setContentDescription(LocaleController.formatString(i11, charSequence));
    }

    public final void o(boolean z10) {
        if (this.H != getExpandedHeight()) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                this.F = null;
                valueAnimator.cancel();
            }
            this.H = getExpandedHeight();
            Iterator it = this.J.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, this.H);
                this.F = ofFloat;
                ofFloat.addUpdateListener(new x0(this, 4));
                this.F.addListener(new h(this, 3));
                this.F.setDuration(250L);
                this.F.setInterpolator(q1.f19718w);
                this.F.start();
            } else {
                this.G = this.H;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.i0.f42173a;
                r0.y.c((View) parent);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction()) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setCurrentAccount(int i10) {
        if (this.f19697w != i10) {
            this.f19697w = i10;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i10) {
        i(i10, true);
    }

    public void setupTab(l3 l3Var) {
        boolean z10 = false;
        int a2 = this.f19695r.a(this.f19694n, false);
        float e = this.v.e(this.f19696s);
        l3Var.v = 0.0f;
        if (e > 0.5f) {
            z10 = true;
        }
        l3Var.f19610l = a2;
        l3Var.f19612n = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
