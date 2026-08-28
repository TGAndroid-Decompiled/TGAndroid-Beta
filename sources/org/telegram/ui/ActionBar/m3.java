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
import gh.i7;
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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ak;
import org.telegram.ui.qn;
import org.telegram.ui.qy;
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
    public final Paint f23657a;
    public boolean f23658b;
    public boolean f23659c;
    public final ActionBarLayout d;
    public final k3 f23660e;
    public int f23661f;
    public final org.telegram.ui.Components.b5 h;
    public int f23662n;
    public final org.telegram.ui.Components.b5 f23663r;
    public boolean f23664s;
    public final org.telegram.ui.Components.y5 v;
    public int f23665w;
    public boolean f23666x;
    public boolean f23667y;

    public m3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f23657a = new Paint(1);
        this.f23658b = true;
        this.f23659c = false;
        gr grVar = gr.h;
        this.h = new org.telegram.ui.Components.b5(this, 200L, grVar, 0);
        this.f23663r = new org.telegram.ui.Components.b5(this, 200L, grVar, 0);
        this.v = new org.telegram.ui.Components.y5(this, 0L, 200L, grVar);
        this.f23665w = UserConfig.selectedAccount;
        this.A = new RectF();
        this.E = new HashSet();
        this.F = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(f6.w0(null, f6.f22947a7, false));
        k3 k3Var = new k3(this, this);
        this.f23660e = k3Var;
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
        l3 l3Var = (l3) j3.r0.j(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null) {
            v3Var = null;
        } else {
            v3Var = launchActivity.f35534u0;
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
        for (int i9 = 0; i9 < tabDrawables.size(); i9++) {
            if (tabDrawables.get(i9).f23527a == l3Var) {
                return tabDrawables.get(i9);
            }
        }
        return null;
    }

    public final void d(RectF rectF, float f10) {
        rectF.set(AndroidUtilities.dp(4.0f), (getHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(50.0f), getWidth() - AndroidUtilities.dp(4.0f), getHeight() - AndroidUtilities.dp(4.0f));
        rectF.offset(0.0f, (-AndroidUtilities.dp(8.0f)) * f10);
        float lerp = AndroidUtilities.lerp(1.0f, 0.95f, Math.abs(f10));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float width = rectF.width();
        float height = rectF.height();
        float f11 = (width / 2.0f) * lerp;
        rectF.left = centerX - f11;
        rectF.right = centerX + f11;
        float f12 = (height / 2.0f) * lerp;
        rectF.top = centerY - f12;
        rectF.bottom = centerY + f12;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        if (this.C > 0.0f) {
            this.f23657a.setColor(this.h.a(this.f23661f, false));
            super.dispatchDraw(canvas);
            int a2 = this.f23663r.a(this.f23662n, false);
            float e10 = this.v.e(this.f23664s);
            if (this.f23658b) {
                int i9 = 0;
                while (i9 < tabDrawables.size()) {
                    j3 j3Var = tabDrawables.get(i9);
                    float c10 = j3Var.c();
                    float b10 = j3Var.b();
                    if (b10 <= 0.0f || c10 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.A;
                        d(rectF, c10);
                        j3Var.v = 0.0f;
                        if (e10 > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j3Var.f23536l = a2;
                        j3Var.f23538n = z10;
                        canvas2 = canvas;
                        j3Var.a(canvas2, rectF, AndroidUtilities.dp(18.0f), b10, 1.0f);
                    }
                    i9++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        k3 k3Var;
        if (this.f23658b && !getTabs().isEmpty() && (k3Var = this.f23660e) != null && k3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(l3 l3Var) {
        qn qnVar;
        ak akVar;
        o2 R = LaunchActivity.R();
        if (R != null && R.getParentActivity() != null) {
            boolean z10 = R instanceof qn;
            if (z10 && (akVar = (qnVar = (qn) R).U) != null) {
                akVar.O();
                qnVar.U.m0(true, false, true);
            }
            if (l3Var.H != null) {
                qy sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.l4 l4Var = l3Var.H;
                org.telegram.ui.y3 y3Var = l4Var.G;
                i3.b(y3Var);
                sheetFragment.addSheet(y3Var);
                org.telegram.ui.x3 x3Var = y3Var.f44700c;
                y3Var.h = false;
                y3Var.f44703n = false;
                ValueAnimator valueAnimator = y3Var.f44708y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = y3Var.A;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                y3Var.f44707x = 0.0f;
                y3Var.f44706w = 0.0f;
                y3Var.h();
                y3Var.n();
                x3Var.invalidate();
                x3Var.requestLayout();
                l4Var.Y(sheetFragment.getParentActivity(), sheetFragment);
                y3Var.g(sheetFragment);
                y3Var.f();
                h(this.f23665w, l3Var, false);
                return;
            }
            new fh.f1(25, this, l3Var).run(R);
            if (l3Var.A) {
                if (!z10 || ((qn) R).a() != l3Var.f23619a.f18107c) {
                    this.f23659c = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e(this, R, qn.R9(l3Var.f23619a.f18107c), 6), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        for (int i9 = 0; i9 < tabs.size(); i9++) {
            tabs.get(i9).a();
        }
        tabs.clear();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            tabDrawables.get(i10).f23529c = -1;
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
        } else if (!l3Var.f23638w) {
            h(this.f23665w, l3Var, true);
            callback.run(Boolean.TRUE);
        } else {
            TLRPC.User user = MessagesController.getInstance(l3Var.f23619a.f18105a).getUser(Long.valueOf(l3Var.f23619a.f18107c));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.N = str;
            c2Var.P = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new f1.a(this, zArr, l3Var, callback, r8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new androidx.car.app.utils.a(zArr, callback, r8, 15));
            c2[] c2VarArr = {c2Var};
            c2Var.setOnDismissListener(new i7(zArr, callback));
            c2VarArr[0].show();
            ((TextView) c2VarArr[0].d(-1)).setTextColor(f6.w0(null, f6.f23230q7, false));
        }
    }

    public Paint getBackgroundPaint() {
        return this.f23657a;
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
        int i9 = this.f23665w;
        Integer valueOf = Integer.valueOf(i9);
        HashMap hashMap = H;
        ArrayList<j3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i9);
            ArrayList<j3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<l3> getTabs() {
        int i9 = this.f23665w;
        Integer valueOf = Integer.valueOf(i9);
        HashMap hashMap = G;
        ArrayList<l3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i9);
            ArrayList<l3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i9, l3 l3Var, boolean z10) {
        Integer valueOf = Integer.valueOf(i9);
        HashMap hashMap = G;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i9);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i9);
        HashMap hashMap2 = H;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i9);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(l3Var);
        if (z10) {
            l3Var.a();
        }
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            j3 j3Var = (j3) arrayList3.get(i10);
            int indexOf = arrayList.indexOf(j3Var.f23527a);
            j3Var.f23529c = indexOf;
            if (indexOf >= 0) {
                j3Var.f23528b = indexOf;
            }
        }
        n();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e(this, arrayList3, l3Var, 7), 320L);
        o(true);
        invalidate();
        k3 k3Var = this.f23660e;
        if (k3Var != null) {
            k3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i9, boolean z10) {
        boolean z11;
        float f10;
        if (i9 != this.f23661f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z12 = false;
            z10 = (!actionBarLayout.M || actionBarLayout.P) ? false : false;
            this.f23661f = i9;
            if (AndroidUtilities.computePerceivedBrightness(i9) < 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                f10 = 0.08f;
            } else {
                f10 = 0.75f;
            }
            int v = f6.v(i9, f6.l1(f10, -1));
            this.f23662n = v;
            if (AndroidUtilities.computePerceivedBrightness(v) < 0.721f) {
                z12 = true;
            }
            this.f23664s = z12;
            if (!z10) {
                this.h.a(this.f23661f, true);
                this.f23663r.a(this.f23662n, true);
                this.v.f(this.f23664s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f10, float f11, int i9) {
        l3 l3Var;
        boolean z10;
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        if (this.f23658b) {
            if (tabs.isEmpty()) {
                l3Var = null;
            } else {
                l3Var = tabs.get(0);
            }
            j3 c10 = c(l3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.z zVar = c10.f23535k;
                float c11 = c10.c();
                RectF rectF = this.A;
                d(rectF, c11);
                if (i9 != 0 && i9 != 2) {
                    if (i9 == 1 || i9 == 3) {
                        if (this.f23667y && i9 == 1) {
                            b();
                        } else if (this.f23666x && i9 == 1) {
                            g(l3Var, new bg.k(1));
                        }
                        this.f23666x = false;
                        this.f23667y = false;
                        zVar.setState(new int[0]);
                    }
                } else {
                    boolean contains = zVar.getBounds().contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()));
                    this.f23666x = contains;
                    if (!contains && rectF.contains(f10, f11)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f23667y = z10;
                    zVar.setState(this.f23666x ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
                    if (tabDrawables.get(i10) != c10) {
                        tabDrawables.get(i10).f23535k.setState(new int[0]);
                    }
                }
            } else {
                this.f23667y = false;
                this.f23666x = false;
            }
        } else {
            this.f23667y = false;
            this.f23666x = false;
        }
        if (this.f23667y || this.f23666x) {
            return true;
        }
        return false;
    }

    public final l3 k(mh.s4 s4Var) {
        Integer valueOf = Integer.valueOf(this.f23665w);
        HashMap hashMap = G;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.f23665w);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            l3 l3Var = (l3) arrayList.get(i9);
            if (s4Var.equals(l3Var.f23619a)) {
                e(l3Var);
                return l3Var;
            }
        }
        return null;
    }

    public final l3 l(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final l3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<l3> tabs = getTabs();
        for (int i9 = 0; i9 < tabs.size(); i9++) {
            l3 l3Var = tabs.get(i9);
            org.telegram.ui.l4 l4Var = l3Var.H;
            if (l4Var != null && !l4Var.Z.isEmpty()) {
                Object j10 = j3.r0.j(1, l3Var.H.Z);
                if ((j10 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) j10).f22533id == webPage.f22533id) {
                    e(l3Var);
                    return l3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence replaceEmoji;
        ArrayList<l3> tabs = getTabs();
        ArrayList<j3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i9 = 0; i9 < tabDrawables.size(); i9++) {
            j3 j3Var = tabDrawables.get(i9);
            if (tabs.size() > 1 && j3Var.f23528b == 0) {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, j3Var.f23527a.b()), getTextPaint().getFontMetricsInt(), false);
                if (replaceEmoji == null) {
                    j3Var.f23545u = null;
                } else {
                    j3Var.f23545u = new nz0(replaceEmoji, 17.0f, AndroidUtilities.bold());
                }
            } else {
                replaceEmoji = Emoji.replaceEmoji(j3Var.f23527a.b(), getTextPaint().getFontMetricsInt(), false);
                j3Var.f23545u = null;
            }
            charSequence = replaceEmoji;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(LocaleController.formatString(R.string.AccDescrTabs, ""));
            return;
        }
        setImportantForAccessibility(1);
        int i10 = R.string.AccDescrTabs;
        if (charSequence == null) {
            charSequence = "";
        }
        setContentDescription(LocaleController.formatString(i10, charSequence));
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
                this.B.addListener(new h(this, 3));
                this.B.setDuration(250L);
                this.B.setInterpolator(q1.f23713w);
                this.B.start();
            } else {
                this.C = this.D;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.j0.f46915a;
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

    public void setCurrentAccount(int i9) {
        if (this.f23665w != i9) {
            this.f23665w = i9;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i9) {
        i(i9, true);
    }

    public void setupTab(j3 j3Var) {
        boolean z10 = false;
        int a2 = this.f23663r.a(this.f23662n, false);
        float e10 = this.v.e(this.f23664s);
        j3Var.v = 0.0f;
        if (e10 > 0.5f) {
            z10 = true;
        }
        j3Var.f23536l = a2;
        j3Var.f23538n = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
