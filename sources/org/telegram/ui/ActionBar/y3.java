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
    public final Context f30272a;
    public final ActionMode.Callback2 f30273b;
    public final Menu f30274c;
    public final Rect d;
    public final Rect f30275e;
    public final Rect f30276f;
    public final int[] f30277g;
    public final int[] h;
    public final int[] f30278i;
    public final Rect f30279j;
    public final Rect f30280k;
    public final Rect f30281l;
    public final View f30282m;
    public final Point f30283n;
    public final int f30284o;
    public final w3 f30285p = new w3(this, 0);
    public final w3 f30286q = new w3(this, 1);
    public final m4 f30287r;
    public final x3 f30288s;

    public y3(Context context, ActionMode.Callback2 callback2, View view, m4 m4Var) {
        this.f30272a = context;
        this.f30273b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f30274c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                y3 y3Var = y3.this;
                return y3Var.f30273b.onActionItemClicked(y3Var, menuItem);
            }
        });
        this.d = new Rect();
        this.f30275e = new Rect();
        this.f30276f = new Rect();
        int[] iArr = new int[2];
        this.f30277g = iArr;
        this.h = new int[2];
        this.f30278i = new int[2];
        this.f30279j = new Rect();
        this.f30280k = new Rect();
        this.f30281l = new Rect();
        this.f30282m = view;
        view.getLocationOnScreen(iArr);
        this.f30284o = org.telegram.messenger.g0.L(20.0f);
        this.f30283n = new Point();
        m4Var.f29237e = menu;
        m4Var.f29239g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                y3 y3Var = y3.this;
                return y3Var.f30273b.onActionItemClicked(y3Var, menuItem);
            }
        };
        this.f30287r = m4Var;
        x3 x3Var = new x3(m4Var);
        this.f30288s = x3Var;
        x3Var.f30235b = false;
        x3Var.f30236c = false;
        x3Var.d = false;
        x3Var.f30237e = true;
        x3Var.f30238f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.f30275e;
        rect2.set(rect);
        View view = this.f30282m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f30278i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f30277g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f30272a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f30283n;
        defaultDisplay.getRealSize(point);
        int i7 = point.x;
        int i10 = point.y;
        Rect rect3 = this.f30281l;
        rect3.set(0, 0, i7, i10);
        boolean a10 = a(rect2, rect3);
        Rect rect4 = this.f30276f;
        if (a10) {
            Rect rect5 = this.f30279j;
            if (a(rect2, rect5)) {
                this.f30288s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f30284o));
                if (!rect2.equals(rect4)) {
                    w3 w3Var = this.f30285p;
                    view.removeCallbacks(w3Var);
                    x3 x3Var = this.f30288s;
                    x3Var.getClass();
                    if (System.currentTimeMillis() - x3Var.f30239g > 500) {
                        x3Var.f30236c = true;
                    }
                    view.postDelayed(w3Var, 50L);
                    this.f30287r.f29236c.set(rect2);
                    m4 m4Var = this.f30287r;
                    if (m4Var.f29235b.f()) {
                        m4Var.c();
                    }
                }
                this.f30288s.a();
                rect4.set(rect2);
            }
        }
        this.f30288s.d = true;
        rect2.setEmpty();
        this.f30288s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f30282m;
        int[] iArr = this.f30277g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f30278i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f30279j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f30280k;
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
        m4 m4Var = this.f30287r;
        m4Var.f29234a.removeOnLayoutChangeListener(m4Var.f29243l);
        k4 k4Var = m4Var.f29235b;
        if (!k4Var.F) {
            k4Var.G = false;
            k4Var.F = true;
            k4Var.f29142x.cancel();
            k4Var.f29141w.start();
            k4Var.D.setEmpty();
        }
        x3 x3Var = this.f30288s;
        x3Var.f30238f = false;
        m4 m4Var2 = x3Var.f30234a;
        m4Var2.f29234a.removeOnLayoutChangeListener(m4Var2.f29243l);
        k4 k4Var2 = m4Var2.f29235b;
        if (!k4Var2.F) {
            k4Var2.G = false;
            k4Var2.F = true;
            k4Var2.f29142x.cancel();
            k4Var2.f29141w.start();
            k4Var2.D.setEmpty();
        }
        w3 w3Var = this.f30285p;
        View view = this.f30282m;
        view.removeCallbacks(w3Var);
        view.removeCallbacks(this.f30286q);
        this.f30273b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f30274c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f30272a);
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
        View view = this.f30282m;
        w3 w3Var = this.f30286q;
        view.removeCallbacks(w3Var);
        if (min <= 0) {
            w3Var.run();
            return;
        }
        x3 x3Var = this.f30288s;
        x3Var.f30235b = true;
        x3Var.a();
        view.postDelayed(w3Var, min);
    }

    @Override
    public final void invalidate() {
        this.f30273b.onPrepareActionMode(this, this.f30274c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f30273b;
        View view = this.f30282m;
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
        x3 x3Var = this.f30288s;
        x3Var.f30237e = z10;
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
