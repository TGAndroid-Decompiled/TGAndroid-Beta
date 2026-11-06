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
public final class w3 extends ActionMode {
    public final Context f28695a;
    public final ActionMode.Callback2 f28696b;
    public final Menu f28697c;
    public final Rect d;
    public final Rect f28698e;
    public final Rect f28699f;
    public final int[] f28700g;
    public final int[] h;
    public final int[] f28701i;
    public final Rect f28702j;
    public final Rect f28703k;
    public final Rect f28704l;
    public final View f28705m;
    public final Point f28706n;
    public final int f28707o;
    public final u3 f28708p = new u3(this, 0);
    public final u3 f28709q = new u3(this, 1);
    public final k4 f28710r;
    public final v3 f28711s;

    public w3(Context context, ActionMode.Callback2 callback2, View view, k4 k4Var) {
        this.f28695a = context;
        this.f28696b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f28697c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                w3 w3Var = w3.this;
                return w3Var.f28696b.onActionItemClicked(w3Var, menuItem);
            }
        });
        this.d = new Rect();
        this.f28698e = new Rect();
        this.f28699f = new Rect();
        int[] iArr = new int[2];
        this.f28700g = iArr;
        this.h = new int[2];
        this.f28701i = new int[2];
        this.f28702j = new Rect();
        this.f28703k = new Rect();
        this.f28704l = new Rect();
        this.f28705m = view;
        view.getLocationOnScreen(iArr);
        this.f28707o = org.telegram.messenger.g0.L(20.0f);
        this.f28706n = new Point();
        k4Var.f27738e = menu;
        k4Var.f27740g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                w3 w3Var = w3.this;
                return w3Var.f28696b.onActionItemClicked(w3Var, menuItem);
            }
        };
        this.f28710r = k4Var;
        v3 v3Var = new v3(k4Var);
        this.f28711s = v3Var;
        v3Var.f28656b = false;
        v3Var.f28657c = false;
        v3Var.d = false;
        v3Var.f28658e = true;
        v3Var.f28659f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.f28698e;
        rect2.set(rect);
        View view = this.f28705m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f28701i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f28700g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f28695a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f28706n;
        defaultDisplay.getRealSize(point);
        int i7 = point.x;
        int i10 = point.y;
        Rect rect3 = this.f28704l;
        rect3.set(0, 0, i7, i10);
        boolean a10 = a(rect2, rect3);
        Rect rect4 = this.f28699f;
        if (a10) {
            Rect rect5 = this.f28702j;
            if (a(rect2, rect5)) {
                this.f28711s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f28707o));
                if (!rect2.equals(rect4)) {
                    u3 u3Var = this.f28708p;
                    view.removeCallbacks(u3Var);
                    v3 v3Var = this.f28711s;
                    v3Var.getClass();
                    if (System.currentTimeMillis() - v3Var.f28660g > 500) {
                        v3Var.f28657c = true;
                    }
                    view.postDelayed(u3Var, 50L);
                    this.f28710r.f27737c.set(rect2);
                    k4 k4Var = this.f28710r;
                    if (k4Var.f27736b.f()) {
                        k4Var.c();
                    }
                }
                this.f28711s.a();
                rect4.set(rect2);
            }
        }
        this.f28711s.d = true;
        rect2.setEmpty();
        this.f28711s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f28705m;
        int[] iArr = this.f28700g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f28701i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f28702j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f28703k;
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
        k4 k4Var = this.f28710r;
        k4Var.f27735a.removeOnLayoutChangeListener(k4Var.f27744l);
        i4 i4Var = k4Var.f27736b;
        if (!i4Var.F) {
            i4Var.G = false;
            i4Var.F = true;
            i4Var.f27583x.cancel();
            i4Var.f27582w.start();
            i4Var.D.setEmpty();
        }
        v3 v3Var = this.f28711s;
        v3Var.f28659f = false;
        k4 k4Var2 = v3Var.f28655a;
        k4Var2.f27735a.removeOnLayoutChangeListener(k4Var2.f27744l);
        i4 i4Var2 = k4Var2.f27736b;
        if (!i4Var2.F) {
            i4Var2.G = false;
            i4Var2.F = true;
            i4Var2.f27583x.cancel();
            i4Var2.f27582w.start();
            i4Var2.D.setEmpty();
        }
        u3 u3Var = this.f28708p;
        View view = this.f28705m;
        view.removeCallbacks(u3Var);
        view.removeCallbacks(this.f28709q);
        this.f28696b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f28697c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f28695a);
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
        View view = this.f28705m;
        u3 u3Var = this.f28709q;
        view.removeCallbacks(u3Var);
        if (min <= 0) {
            u3Var.run();
            return;
        }
        v3 v3Var = this.f28711s;
        v3Var.f28656b = true;
        v3Var.a();
        view.postDelayed(u3Var, min);
    }

    @Override
    public final void invalidate() {
        this.f28696b.onPrepareActionMode(this, this.f28697c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f28696b;
        View view = this.f28705m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        b();
    }

    @Override
    public final void onWindowFocusChanged(boolean z9) {
        v3 v3Var = this.f28711s;
        v3Var.f28658e = z9;
        v3Var.a();
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
