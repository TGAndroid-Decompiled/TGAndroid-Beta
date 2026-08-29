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
import jh.f7;
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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dk;
import org.telegram.ui.sy;
import org.telegram.ui.tn;
public final class m3 extends FrameLayout {
    public static final HashMap G = new HashMap();
    public static final HashMap H = new HashMap();
    public static TextPaint I;
    public final RectF A;
    public ValueAnimator B;
    public float C;
    public int D;
    public final HashSet E;
    public final HashSet F;
    public final Paint f23677a;
    public boolean f23678b;
    public boolean f23679c;
    public final ActionBarLayout d;
    public final k3 f23680e;
    public int f23681f;
    public final org.telegram.ui.Components.f5 h;
    public int f23682n;
    public final org.telegram.ui.Components.f5 f23683r;
    public boolean f23684s;
    public final org.telegram.ui.Components.d6 v;
    public int f23685w;
    public boolean f23686x;
    public boolean f23687y;

    public m3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f23677a = new Paint(1);
        this.f23678b = true;
        this.f23679c = false;
        jr jrVar = jr.h;
        this.h = new org.telegram.ui.Components.f5(this, 200L, jrVar, 0);
        this.f23683r = new org.telegram.ui.Components.f5(this, 200L, jrVar, 0);
        this.v = new org.telegram.ui.Components.d6(this, 0L, 200L, jrVar);
        this.f23685w = UserConfig.selectedAccount;
        this.A = new RectF();
        this.E = new HashSet();
        this.F = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(g6.w0(null, g6.f23009a7, false));
        k3 k3Var = new k3(this, this);
        this.f23680e = k3Var;
        r0.j0.k(this, k3Var);
        n();
        o(false);
    }

    public static TextPaint getTextPaint() {
        if (I == null) {
            TextPaint textPaint = new TextPaint(1);
            I = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            I.setTextSize(AndroidUtilities.dp(17.0f));
        }
        return I;
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
        v3 v3Var;
        ValueAnimator valueAnimator;
        ArrayList<l3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        l3 l3Var = (l3) j7.l1.i(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null) {
            v3Var = null;
        } else {
            v3Var = launchActivity.f35601u0;
        }
        if (v3Var != null && (valueAnimator = v3Var.d) != null) {
            valueAnimator.cancel();
            v3Var.d = null;
        }
        if (size != 1 && v3Var != null) {
            v3Var.f();
        } else {
            e(l3Var);
        }
    }

    public final j3 c(l3 l3Var) {
        ArrayList<j3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            if (tabDrawables.get(i10).f23551a == l3Var) {
                return tabDrawables.get(i10);
            }
        }
        return null;
    }

    public final void d(RectF rectF, float f9) {
        rectF.set(AndroidUtilities.dp(4.0f), (getHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(50.0f), getWidth() - AndroidUtilities.dp(4.0f), getHeight() - AndroidUtilities.dp(4.0f));
        rectF.offset(0.0f, (-AndroidUtilities.dp(8.0f)) * f9);
        float lerp = AndroidUtilities.lerp(1.0f, 0.95f, Math.abs(f9));
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
        ArrayList<j3> tabDrawables = getTabDrawables();
        if (this.C > 0.0f) {
            this.f23677a.setColor(this.h.a(this.f23681f, false));
            super.dispatchDraw(canvas);
            int a2 = this.f23683r.a(this.f23682n, false);
            float e10 = this.v.e(this.f23684s);
            if (this.f23678b) {
                int i10 = 0;
                while (i10 < tabDrawables.size()) {
                    j3 j3Var = tabDrawables.get(i10);
                    float c3 = j3Var.c();
                    float b10 = j3Var.b();
                    if (b10 <= 0.0f || c3 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.A;
                        d(rectF, c3);
                        j3Var.v = 0.0f;
                        if (e10 > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j3Var.f23560l = a2;
                        j3Var.f23562n = z10;
                        canvas2 = canvas;
                        j3Var.a(canvas2, rectF, AndroidUtilities.dp(18.0f), b10, 1.0f);
                    }
                    i10++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        k3 k3Var;
        if (this.f23678b && !getTabs().isEmpty() && (k3Var = this.f23680e) != null && k3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(l3 l3Var) {
        tn tnVar;
        dk dkVar;
        o2 R = LaunchActivity.R();
        if (R != null && R.getParentActivity() != null) {
            boolean z10 = R instanceof tn;
            if (z10 && (dkVar = (tnVar = (tn) R).U) != null) {
                dkVar.P();
                tnVar.U.n0(true, false, true);
            }
            if (l3Var.H != null) {
                sy sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.m4 m4Var = l3Var.H;
                org.telegram.ui.z3 z3Var = m4Var.G;
                i3.b(z3Var);
                sheetFragment.addSheet(z3Var);
                org.telegram.ui.y3 y3Var = z3Var.f45046c;
                z3Var.h = false;
                z3Var.f45049n = false;
                ValueAnimator valueAnimator = z3Var.f45054y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = z3Var.A;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                z3Var.f45053x = 0.0f;
                z3Var.f45052w = 0.0f;
                z3Var.h();
                z3Var.n();
                y3Var.invalidate();
                y3Var.requestLayout();
                m4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
                z3Var.g(sheetFragment);
                z3Var.f();
                h(this.f23685w, l3Var, false);
                return;
            }
            new ih.b1(18, this, l3Var).run(R);
            if (l3Var.A) {
                if (!z10 || ((tn) R).a() != l3Var.f23641a.f46165c) {
                    this.f23679c = true;
                    AndroidUtilities.runOnUIThread(new l3.m(this, R, tn.R9(l3Var.f23641a.f46165c), 25), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            tabs.get(i10).a();
        }
        tabs.clear();
        for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
            tabDrawables.get(i11).f23553c = -1;
        }
        n();
        o(true);
        invalidate();
        tabs.isEmpty();
    }

    public final void g(l3 l3Var, Utilities.Callback callback) {
        String str;
        if (l3Var == null) {
            callback.run(Boolean.TRUE);
        } else if (!l3Var.f23660w) {
            h(this.f23685w, l3Var, true);
            callback.run(Boolean.TRUE);
        } else {
            TLRPC.User user = MessagesController.getInstance(l3Var.f23641a.f46163a).getUser(Long.valueOf(l3Var.f23641a.f46165c));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.N = str;
            c2Var.P = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new f1.a(this, zArr, l3Var, callback, r8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new androidx.car.app.utils.a(zArr, callback, r8, 13));
            c2[] c2VarArr = {c2Var};
            c2Var.setOnDismissListener(new f7(zArr, callback));
            c2VarArr[0].show();
            ((TextView) c2VarArr[0].d(-1)).setTextColor(g6.w0(null, g6.f23295q7, false));
        }
    }

    public Paint getBackgroundPaint() {
        return this.f23677a;
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

    public ArrayList<j3> getTabDrawables() {
        int i10 = this.f23685w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = H;
        ArrayList<j3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<j3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<l3> getTabs() {
        int i10 = this.f23685w;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = G;
        ArrayList<l3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<l3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i10, l3 l3Var, boolean z10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = G;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i10);
        HashMap hashMap2 = H;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i10);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(l3Var);
        if (z10) {
            l3Var.a();
        }
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            j3 j3Var = (j3) arrayList3.get(i11);
            int indexOf = arrayList.indexOf(j3Var.f23551a);
            j3Var.f23553c = indexOf;
            if (indexOf >= 0) {
                j3Var.f23552b = indexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new l3.m(this, arrayList3, l3Var, 26), 320L);
        o(true);
        invalidate();
        k3 k3Var = this.f23680e;
        if (k3Var != null) {
            k3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        float f9;
        if (i10 != this.f23681f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z12 = false;
            z10 = (!actionBarLayout.M || actionBarLayout.P) ? false : false;
            this.f23681f = i10;
            if (AndroidUtilities.computePerceivedBrightness(i10) < 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                f9 = 0.08f;
            } else {
                f9 = 0.75f;
            }
            int v = g6.v(i10, g6.l1(f9, -1));
            this.f23682n = v;
            if (AndroidUtilities.computePerceivedBrightness(v) < 0.721f) {
                z12 = true;
            }
            this.f23684s = z12;
            if (!z10) {
                this.h.a(this.f23681f, true);
                this.f23683r.a(this.f23682n, true);
                this.v.f(this.f23684s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f9, float f10, int i10) {
        l3 l3Var;
        boolean z10;
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        if (this.f23678b) {
            if (tabs.isEmpty()) {
                l3Var = null;
            } else {
                l3Var = tabs.get(0);
            }
            j3 c3 = c(l3Var);
            if (c3 != null) {
                org.telegram.ui.Cells.z zVar = c3.f23559k;
                float c6 = c3.c();
                RectF rectF = this.A;
                d(rectF, c6);
                if (i10 != 0 && i10 != 2) {
                    if (i10 == 1 || i10 == 3) {
                        if (this.f23687y && i10 == 1) {
                            b();
                        } else if (this.f23686x && i10 == 1) {
                            g(l3Var, new eg.h(1));
                        }
                        this.f23686x = false;
                        this.f23687y = false;
                        zVar.setState(new int[0]);
                    }
                } else {
                    boolean contains = zVar.getBounds().contains((int) (f9 - rectF.left), (int) (f10 - rectF.centerY()));
                    this.f23686x = contains;
                    if (!contains && rectF.contains(f9, f10)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f23687y = z10;
                    zVar.setState(this.f23686x ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
                    if (tabDrawables.get(i11) != c3) {
                        tabDrawables.get(i11).f23559k.setState(new int[0]);
                    }
                }
            } else {
                this.f23687y = false;
                this.f23686x = false;
            }
        } else {
            this.f23687y = false;
            this.f23686x = false;
        }
        if (this.f23687y || this.f23686x) {
            return true;
        }
        return false;
    }

    public final l3 k(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return l(webPage);
    }

    public final l3 l(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<l3> tabs = getTabs();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            l3 l3Var = tabs.get(i10);
            org.telegram.ui.m4 m4Var = l3Var.H;
            if (m4Var != null && !m4Var.Z.isEmpty()) {
                Object i11 = j7.l1.i(1, l3Var.H.Z);
                if ((i11 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) i11).f22545id == webPage.f22545id) {
                    e(l3Var);
                    return l3Var;
                }
            }
        }
        return null;
    }

    public final l3 m(ph.y3 y3Var) {
        Integer valueOf = Integer.valueOf(this.f23685w);
        HashMap hashMap = G;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.f23685w);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            l3 l3Var = (l3) arrayList.get(i10);
            if (y3Var.equals(l3Var.f23641a)) {
                e(l3Var);
                return l3Var;
            }
        }
        return null;
    }

    public final void n() {
        CharSequence replaceEmoji;
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            j3 j3Var = tabDrawables.get(i10);
            if (tabs.size() > 1 && j3Var.f23552b == 0) {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, j3Var.f23551a.b()), getTextPaint().getFontMetricsInt(), false);
                if (replaceEmoji == null) {
                    j3Var.f23569u = null;
                } else {
                    j3Var.f23569u = new zz0(replaceEmoji, 17.0f, AndroidUtilities.bold());
                }
            } else {
                replaceEmoji = Emoji.replaceEmoji(j3Var.f23551a.b(), getTextPaint().getFontMetricsInt(), false);
                j3Var.f23569u = null;
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
        if (this.D != getExpandedHeight()) {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null) {
                this.B = null;
                valueAnimator.cancel();
            }
            this.D = getExpandedHeight();
            Iterator it = this.F.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C, this.D);
                this.B = ofFloat;
                ofFloat.addUpdateListener(new x0(this, 4));
                this.B.addListener(new i(this, 3));
                this.B.setDuration(250L);
                this.B.setInterpolator(q1.f23735w);
                this.B.start();
            } else {
                this.C = this.D;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.j0.f46829a;
                r0.z.c((View) parent);
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
        if (this.f23685w != i10) {
            this.f23685w = i10;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i10) {
        i(i10, true);
    }

    public void setupTab(j3 j3Var) {
        boolean z10 = false;
        int a2 = this.f23683r.a(this.f23682n, false);
        float e10 = this.v.e(this.f23684s);
        j3Var.v = 0.0f;
        if (e10 > 0.5f) {
            z10 = true;
        }
        j3Var.f23560l = a2;
        j3Var.f23562n = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
