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
public final class d4 extends ActionMode {
    public final Context f20252a;
    public final ActionMode.Callback2 f20253b;
    public final Menu f20254c;
    public final Rect d;
    public final Rect e;
    public final Rect f20255f;
    public final int[] f20256g;
    public final int[] h;
    public final int[] f20257i;
    public final Rect f20258j;
    public final Rect f20259k;
    public final Rect f20260l;
    public final View f20261m;
    public final Point f20262n;
    public final int f20263o;
    public final b4 f20264p = new b4(this, 0);
    public final b4 f20265q = new b4(this, 1);
    public final s4 f20266r;
    public final c4 f20267s;

    public d4(Context context, ActionMode.Callback2 callback2, View view, s4 s4Var) {
        this.f20252a = context;
        this.f20253b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f20254c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                d4 d4Var = d4.this;
                return d4Var.f20253b.onActionItemClicked(d4Var, menuItem);
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f20255f = new Rect();
        int[] iArr = new int[2];
        this.f20256g = iArr;
        this.h = new int[2];
        this.f20257i = new int[2];
        this.f20258j = new Rect();
        this.f20259k = new Rect();
        this.f20260l = new Rect();
        this.f20261m = view;
        view.getLocationOnScreen(iArr);
        this.f20263o = org.telegram.messenger.i0.L(20.0f);
        this.f20262n = new Point();
        s4Var.e = menu;
        s4Var.f20779g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                d4 d4Var = d4.this;
                return d4Var.f20253b.onActionItemClicked(d4Var, menuItem);
            }
        };
        this.f20266r = s4Var;
        c4 c4Var = new c4(s4Var);
        this.f20267s = c4Var;
        c4Var.f20206b = false;
        c4Var.f20207c = false;
        c4Var.d = false;
        c4Var.e = true;
        c4Var.f20208f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.e;
        rect2.set(rect);
        View view = this.f20261m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f20257i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f20256g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f20252a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f20262n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f20260l;
        rect3.set(0, 0, i10, i11);
        boolean a2 = a(rect2, rect3);
        Rect rect4 = this.f20255f;
        if (a2) {
            Rect rect5 = this.f20258j;
            if (a(rect2, rect5)) {
                this.f20267s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f20263o));
                if (!rect2.equals(rect4)) {
                    b4 b4Var = this.f20264p;
                    view.removeCallbacks(b4Var);
                    c4 c4Var = this.f20267s;
                    c4Var.getClass();
                    if (System.currentTimeMillis() - c4Var.f20209g > 500) {
                        c4Var.f20207c = true;
                    }
                    view.postDelayed(b4Var, 50L);
                    this.f20266r.f20777c.set(rect2);
                    s4 s4Var = this.f20266r;
                    if (s4Var.f20776b.f()) {
                        s4Var.c();
                    }
                }
                this.f20267s.a();
                rect4.set(rect2);
            }
        }
        this.f20267s.d = true;
        rect2.setEmpty();
        this.f20267s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f20261m;
        int[] iArr = this.f20256g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f20257i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f20258j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f20259k;
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
        s4 s4Var = this.f20266r;
        s4Var.f20775a.removeOnLayoutChangeListener(s4Var.f20783l);
        q4 q4Var = s4Var.f20776b;
        if (!q4Var.F) {
            q4Var.G = false;
            q4Var.F = true;
            q4Var.f20700x.cancel();
            q4Var.f20699w.start();
            q4Var.D.setEmpty();
        }
        c4 c4Var = this.f20267s;
        c4Var.f20208f = false;
        s4 s4Var2 = c4Var.f20205a;
        s4Var2.f20775a.removeOnLayoutChangeListener(s4Var2.f20783l);
        q4 q4Var2 = s4Var2.f20776b;
        if (!q4Var2.F) {
            q4Var2.G = false;
            q4Var2.F = true;
            q4Var2.f20700x.cancel();
            q4Var2.f20699w.start();
            q4Var2.D.setEmpty();
        }
        b4 b4Var = this.f20264p;
        View view = this.f20261m;
        view.removeCallbacks(b4Var);
        view.removeCallbacks(this.f20265q);
        this.f20253b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f20254c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f20252a);
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
    public final void hide(long j10) {
        if (j10 == -1) {
            j10 = ViewConfiguration.getDefaultActionModeHideDuration();
        }
        long min = Math.min(3000L, j10);
        View view = this.f20261m;
        b4 b4Var = this.f20265q;
        view.removeCallbacks(b4Var);
        if (min <= 0) {
            b4Var.run();
            return;
        }
        c4 c4Var = this.f20267s;
        c4Var.f20206b = true;
        c4Var.a();
        view.postDelayed(b4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f20253b.onPrepareActionMode(this, this.f20254c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f20253b;
        View view = this.f20261m;
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
        c4 c4Var = this.f20267s;
        c4Var.e = z10;
        c4Var.a();
    }

    @Override
    public final void setSubtitle(int i10) {
    }

    @Override
    public final void setTitle(int i10) {
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
