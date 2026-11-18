package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.PopupMenu;
import java.util.Arrays;
public final class y3 extends ActionMode {
    public final Context f30274a;
    public final ActionMode.Callback2 f30275b;
    public final Menu f30276c;
    public final Rect d;
    public final Rect f30277e;
    public final Rect f30278f;
    public final int[] f30279g;
    public final int[] h;
    public final int[] f30280i;
    public final Rect f30281j;
    public final Rect f30282k;
    public final Rect f30283l;
    public final View f30284m;
    public final Point f30285n;
    public final int f30286o;
    public final w3 f30287p = new w3(this, 0);
    public final w3 f30288q = new w3(this, 1);
    public final m4 f30289r;
    public final x3 f30290s;

    public y3(Context context, ActionMode.Callback2 callback2, View view, m4 m4Var) {
        this.f30274a = context;
        this.f30275b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f30276c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                y3 y3Var = y3.this;
                return y3Var.f30275b.onActionItemClicked(y3Var, menuItem);
            }
        });
        this.d = new Rect();
        this.f30277e = new Rect();
        this.f30278f = new Rect();
        int[] iArr = new int[2];
        this.f30279g = iArr;
        this.h = new int[2];
        this.f30280i = new int[2];
        this.f30281j = new Rect();
        this.f30282k = new Rect();
        this.f30283l = new Rect();
        this.f30284m = view;
        view.getLocationOnScreen(iArr);
        this.f30286o = org.telegram.messenger.g0.L(20.0f);
        this.f30285n = new Point();
        m4Var.f29239e = menu;
        m4Var.f29241g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                y3 y3Var = y3.this;
                return y3Var.f30275b.onActionItemClicked(y3Var, menuItem);
            }
        };
        this.f30289r = m4Var;
        x3 x3Var = new x3(m4Var);
        this.f30290s = x3Var;
        x3Var.f30237b = false;
        x3Var.f30238c = false;
        x3Var.d = false;
        x3Var.f30239e = true;
        x3Var.f30240f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.f30277e;
        rect2.set(rect);
        View view = this.f30284m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f30280i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f30279g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f30274a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f30285n;
        defaultDisplay.getRealSize(point);
        int i7 = point.x;
        int i10 = point.y;
        Rect rect3 = this.f30283l;
        rect3.set(0, 0, i7, i10);
        boolean a10 = a(rect2, rect3);
        Rect rect4 = this.f30278f;
        if (a10) {
            Rect rect5 = this.f30281j;
            if (a(rect2, rect5)) {
                this.f30290s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f30286o));
                if (!rect2.equals(rect4)) {
                    w3 w3Var = this.f30287p;
                    view.removeCallbacks(w3Var);
                    x3 x3Var = this.f30290s;
                    x3Var.getClass();
                    if (System.currentTimeMillis() - x3Var.f30241g > 500) {
                        x3Var.f30238c = true;
                    }
                    view.postDelayed(w3Var, 50L);
                    this.f30289r.f29238c.set(rect2);
                    m4 m4Var = this.f30289r;
                    if (m4Var.f29237b.f()) {
                        m4Var.c();
                    }
                }
                this.f30290s.a();
                rect4.set(rect2);
            }
        }
        this.f30290s.d = true;
        rect2.setEmpty();
        this.f30290s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f30284m;
        int[] iArr = this.f30279g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f30280i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f30281j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f30282k;
        if (equals && rect.equals(rect2)) {
            return;
        }
        b();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override
    public final void finish() {
        m4 m4Var = this.f30289r;
        m4Var.f29236a.removeOnLayoutChangeListener(m4Var.f29245l);
        k4 k4Var = m4Var.f29237b;
        if (!k4Var.F) {
            k4Var.G = false;
            k4Var.F = true;
            k4Var.f29144x.cancel();
            k4Var.f29143w.start();
            k4Var.D.setEmpty();
        }
        x3 x3Var = this.f30290s;
        x3Var.f30240f = false;
        m4 m4Var2 = x3Var.f30236a;
        m4Var2.f29236a.removeOnLayoutChangeListener(m4Var2.f29245l);
        k4 k4Var2 = m4Var2.f29237b;
        if (!k4Var2.F) {
            k4Var2.G = false;
            k4Var2.F = true;
            k4Var2.f29144x.cancel();
            k4Var2.f29143w.start();
            k4Var2.D.setEmpty();
        }
        w3 w3Var = this.f30287p;
        View view = this.f30284m;
        view.removeCallbacks(w3Var);
        view.removeCallbacks(this.f30288q);
        this.f30275b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f30276c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f30274a);
    }

    @Override
    public final CharSequence getSubtitle() {
        return null;
    }

    @Override
    public final CharSequence getTitle() {
        return null;
    }

    @Override
    public final void hide(long j3) {
        if (j3 == -1) {
            j3 = ViewConfiguration.getDefaultActionModeHideDuration();
        }
        long min = Math.min(3000L, j3);
        View view = this.f30284m;
        w3 w3Var = this.f30288q;
        view.removeCallbacks(w3Var);
        if (min <= 0) {
            w3Var.run();
            return;
        }
        x3 x3Var = this.f30290s;
        x3Var.f30237b = true;
        x3Var.a();
        view.postDelayed(w3Var, min);
    }

    @Override
    public final void invalidate() {
        this.f30275b.onPrepareActionMode(this, this.f30276c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f30275b;
        View view = this.f30284m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        b();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        x3 x3Var = this.f30290s;
        x3Var.f30239e = z10;
        x3Var.a();
    }

    @Override
    public final void setSubtitle(int i7) {
    }

    @Override
    public final void setTitle(int i7) {
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
    }

    @Override
    public final void setCustomView(View view) {
    }
}
