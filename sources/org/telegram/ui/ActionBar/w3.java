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
    public final Context f28701a;
    public final ActionMode.Callback2 f28702b;
    public final Menu f28703c;
    public final Rect d;
    public final Rect f28704e;
    public final Rect f28705f;
    public final int[] f28706g;
    public final int[] h;
    public final int[] f28707i;
    public final Rect f28708j;
    public final Rect f28709k;
    public final Rect f28710l;
    public final View f28711m;
    public final Point f28712n;
    public final int f28713o;
    public final u3 f28714p = new u3(this, 0);
    public final u3 f28715q = new u3(this, 1);
    public final k4 f28716r;
    public final v3 f28717s;

    public w3(Context context, ActionMode.Callback2 callback2, View view, k4 k4Var) {
        this.f28701a = context;
        this.f28702b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f28703c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                w3 w3Var = w3.this;
                return w3Var.f28702b.onActionItemClicked(w3Var, menuItem);
            }
        });
        this.d = new Rect();
        this.f28704e = new Rect();
        this.f28705f = new Rect();
        int[] iArr = new int[2];
        this.f28706g = iArr;
        this.h = new int[2];
        this.f28707i = new int[2];
        this.f28708j = new Rect();
        this.f28709k = new Rect();
        this.f28710l = new Rect();
        this.f28711m = view;
        view.getLocationOnScreen(iArr);
        this.f28713o = org.telegram.messenger.g0.L(20.0f);
        this.f28712n = new Point();
        k4Var.f27726e = menu;
        k4Var.f27728g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                w3 w3Var = w3.this;
                return w3Var.f28702b.onActionItemClicked(w3Var, menuItem);
            }
        };
        this.f28716r = k4Var;
        v3 v3Var = new v3(k4Var);
        this.f28717s = v3Var;
        v3Var.f28665b = false;
        v3Var.f28666c = false;
        v3Var.d = false;
        v3Var.f28667e = true;
        v3Var.f28668f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.f28704e;
        rect2.set(rect);
        View view = this.f28711m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f28707i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f28706g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f28701a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f28712n;
        defaultDisplay.getRealSize(point);
        int i7 = point.x;
        int i10 = point.y;
        Rect rect3 = this.f28710l;
        rect3.set(0, 0, i7, i10);
        boolean a10 = a(rect2, rect3);
        Rect rect4 = this.f28705f;
        if (a10) {
            Rect rect5 = this.f28708j;
            if (a(rect2, rect5)) {
                this.f28717s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f28713o));
                if (!rect2.equals(rect4)) {
                    u3 u3Var = this.f28714p;
                    view.removeCallbacks(u3Var);
                    v3 v3Var = this.f28717s;
                    v3Var.getClass();
                    if (System.currentTimeMillis() - v3Var.f28669g > 500) {
                        v3Var.f28666c = true;
                    }
                    view.postDelayed(u3Var, 50L);
                    this.f28716r.f27725c.set(rect2);
                    k4 k4Var = this.f28716r;
                    if (k4Var.f27724b.f()) {
                        k4Var.c();
                    }
                }
                this.f28717s.a();
                rect4.set(rect2);
            }
        }
        this.f28717s.d = true;
        rect2.setEmpty();
        this.f28717s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f28711m;
        int[] iArr = this.f28706g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f28707i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f28708j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f28709k;
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
        k4 k4Var = this.f28716r;
        k4Var.f27723a.removeOnLayoutChangeListener(k4Var.f27732l);
        i4 i4Var = k4Var.f27724b;
        if (!i4Var.F) {
            i4Var.G = false;
            i4Var.F = true;
            i4Var.f27562x.cancel();
            i4Var.f27561w.start();
            i4Var.D.setEmpty();
        }
        v3 v3Var = this.f28717s;
        v3Var.f28668f = false;
        k4 k4Var2 = v3Var.f28664a;
        k4Var2.f27723a.removeOnLayoutChangeListener(k4Var2.f27732l);
        i4 i4Var2 = k4Var2.f27724b;
        if (!i4Var2.F) {
            i4Var2.G = false;
            i4Var2.F = true;
            i4Var2.f27562x.cancel();
            i4Var2.f27561w.start();
            i4Var2.D.setEmpty();
        }
        u3 u3Var = this.f28714p;
        View view = this.f28711m;
        view.removeCallbacks(u3Var);
        view.removeCallbacks(this.f28715q);
        this.f28702b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f28703c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f28701a);
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
        View view = this.f28711m;
        u3 u3Var = this.f28715q;
        view.removeCallbacks(u3Var);
        if (min <= 0) {
            u3Var.run();
            return;
        }
        v3 v3Var = this.f28717s;
        v3Var.f28665b = true;
        v3Var.a();
        view.postDelayed(u3Var, min);
    }

    @Override
    public final void invalidate() {
        this.f28702b.onPrepareActionMode(this, this.f28703c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f28702b;
        View view = this.f28711m;
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
        v3 v3Var = this.f28717s;
        v3Var.f28667e = z9;
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
