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
    public final Context f28699a;
    public final ActionMode.Callback2 f28700b;
    public final Menu f28701c;
    public final Rect d;
    public final Rect f28702e;
    public final Rect f28703f;
    public final int[] f28704g;
    public final int[] h;
    public final int[] f28705i;
    public final Rect f28706j;
    public final Rect f28707k;
    public final Rect f28708l;
    public final View f28709m;
    public final Point f28710n;
    public final int f28711o;
    public final u3 f28712p = new u3(this, 0);
    public final u3 f28713q = new u3(this, 1);
    public final k4 f28714r;
    public final v3 f28715s;

    public w3(Context context, ActionMode.Callback2 callback2, View view, k4 k4Var) {
        this.f28699a = context;
        this.f28700b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f28701c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                w3 w3Var = w3.this;
                return w3Var.f28700b.onActionItemClicked(w3Var, menuItem);
            }
        });
        this.d = new Rect();
        this.f28702e = new Rect();
        this.f28703f = new Rect();
        int[] iArr = new int[2];
        this.f28704g = iArr;
        this.h = new int[2];
        this.f28705i = new int[2];
        this.f28706j = new Rect();
        this.f28707k = new Rect();
        this.f28708l = new Rect();
        this.f28709m = view;
        view.getLocationOnScreen(iArr);
        this.f28711o = org.telegram.messenger.g0.L(20.0f);
        this.f28710n = new Point();
        k4Var.f27742e = menu;
        k4Var.f27744g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                w3 w3Var = w3.this;
                return w3Var.f28700b.onActionItemClicked(w3Var, menuItem);
            }
        };
        this.f28714r = k4Var;
        v3 v3Var = new v3(k4Var);
        this.f28715s = v3Var;
        v3Var.f28660b = false;
        v3Var.f28661c = false;
        v3Var.d = false;
        v3Var.f28662e = true;
        v3Var.f28663f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.f28702e;
        rect2.set(rect);
        View view = this.f28709m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f28705i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f28704g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f28699a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f28710n;
        defaultDisplay.getRealSize(point);
        int i7 = point.x;
        int i10 = point.y;
        Rect rect3 = this.f28708l;
        rect3.set(0, 0, i7, i10);
        boolean a10 = a(rect2, rect3);
        Rect rect4 = this.f28703f;
        if (a10) {
            Rect rect5 = this.f28706j;
            if (a(rect2, rect5)) {
                this.f28715s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f28711o));
                if (!rect2.equals(rect4)) {
                    u3 u3Var = this.f28712p;
                    view.removeCallbacks(u3Var);
                    v3 v3Var = this.f28715s;
                    v3Var.getClass();
                    if (System.currentTimeMillis() - v3Var.f28664g > 500) {
                        v3Var.f28661c = true;
                    }
                    view.postDelayed(u3Var, 50L);
                    this.f28714r.f27741c.set(rect2);
                    k4 k4Var = this.f28714r;
                    if (k4Var.f27740b.f()) {
                        k4Var.c();
                    }
                }
                this.f28715s.a();
                rect4.set(rect2);
            }
        }
        this.f28715s.d = true;
        rect2.setEmpty();
        this.f28715s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f28709m;
        int[] iArr = this.f28704g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f28705i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f28706j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f28707k;
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
        k4 k4Var = this.f28714r;
        k4Var.f27739a.removeOnLayoutChangeListener(k4Var.f27748l);
        i4 i4Var = k4Var.f27740b;
        if (!i4Var.F) {
            i4Var.G = false;
            i4Var.F = true;
            i4Var.f27587x.cancel();
            i4Var.f27586w.start();
            i4Var.D.setEmpty();
        }
        v3 v3Var = this.f28715s;
        v3Var.f28663f = false;
        k4 k4Var2 = v3Var.f28659a;
        k4Var2.f27739a.removeOnLayoutChangeListener(k4Var2.f27748l);
        i4 i4Var2 = k4Var2.f27740b;
        if (!i4Var2.F) {
            i4Var2.G = false;
            i4Var2.F = true;
            i4Var2.f27587x.cancel();
            i4Var2.f27586w.start();
            i4Var2.D.setEmpty();
        }
        u3 u3Var = this.f28712p;
        View view = this.f28709m;
        view.removeCallbacks(u3Var);
        view.removeCallbacks(this.f28713q);
        this.f28700b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f28701c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f28699a);
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
        View view = this.f28709m;
        u3 u3Var = this.f28713q;
        view.removeCallbacks(u3Var);
        if (min <= 0) {
            u3Var.run();
            return;
        }
        v3 v3Var = this.f28715s;
        v3Var.f28660b = true;
        v3Var.a();
        view.postDelayed(u3Var, min);
    }

    @Override
    public final void invalidate() {
        this.f28700b.onPrepareActionMode(this, this.f28701c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f28700b;
        View view = this.f28709m;
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
        v3 v3Var = this.f28715s;
        v3Var.f28662e = z9;
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
