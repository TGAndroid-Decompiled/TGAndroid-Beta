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
import org.telegram.messenger.AndroidUtilities;
public final class g4 extends ActionMode {
    public final Context f19520a;
    public final ActionMode.Callback2 f19521b;
    public final Menu f19522c;
    public final Rect d;
    public final Rect e;
    public final Rect f19523f;
    public final int[] f19524g;
    public final int[] h;
    public final int[] f19525i;
    public final Rect f19526j;
    public final Rect f19527k;
    public final Rect f19528l;
    public final View f19529m;
    public final Point f19530n;
    public final int f19531o;
    public final e4 f19532p = new e4(this, 0);
    public final e4 f19533q = new e4(this, 1);
    public final v4 f19534r;
    public final f4 f19535s;

    public g4(Context context, ActionMode.Callback2 callback2, View view, v4 v4Var) {
        this.f19520a = context;
        this.f19521b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f19522c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                g4 g4Var = g4.this;
                return g4Var.f19521b.onActionItemClicked(g4Var, menuItem);
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f19523f = new Rect();
        int[] iArr = new int[2];
        this.f19524g = iArr;
        this.h = new int[2];
        this.f19525i = new int[2];
        this.f19526j = new Rect();
        this.f19527k = new Rect();
        this.f19528l = new Rect();
        this.f19529m = view;
        view.getLocationOnScreen(iArr);
        this.f19531o = AndroidUtilities.dp(20.0f);
        this.f19530n = new Point();
        v4Var.e = menu;
        v4Var.f20467g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                g4 g4Var = g4.this;
                return g4Var.f19521b.onActionItemClicked(g4Var, menuItem);
            }
        };
        this.f19534r = v4Var;
        f4 f4Var = new f4(v4Var);
        this.f19535s = f4Var;
        f4Var.f19485b = false;
        f4Var.f19486c = false;
        f4Var.d = false;
        f4Var.e = true;
        f4Var.f19487f = true;
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
        View view = this.f19529m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f19525i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f19524g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f19520a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f19530n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f19528l;
        rect3.set(0, 0, i10, i11);
        boolean a2 = a(rect2, rect3);
        Rect rect4 = this.f19523f;
        if (a2) {
            Rect rect5 = this.f19526j;
            if (a(rect2, rect5)) {
                this.f19535s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f19531o));
                if (!rect2.equals(rect4)) {
                    e4 e4Var = this.f19532p;
                    view.removeCallbacks(e4Var);
                    f4 f4Var = this.f19535s;
                    f4Var.getClass();
                    if (System.currentTimeMillis() - f4Var.f19488g > 500) {
                        f4Var.f19486c = true;
                    }
                    view.postDelayed(e4Var, 50L);
                    this.f19534r.f20465c.set(rect2);
                    v4 v4Var = this.f19534r;
                    if (v4Var.f20464b.f()) {
                        v4Var.c();
                    }
                }
                this.f19535s.a();
                rect4.set(rect2);
            }
        }
        this.f19535s.d = true;
        rect2.setEmpty();
        this.f19535s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f19529m;
        int[] iArr = this.f19524g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f19525i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f19526j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f19527k;
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
        v4 v4Var = this.f19534r;
        v4Var.f20463a.removeOnLayoutChangeListener(v4Var.f20471l);
        t4 t4Var = v4Var.f20464b;
        if (!t4Var.F) {
            t4Var.G = false;
            t4Var.F = true;
            t4Var.f20364x.cancel();
            t4Var.f20363w.start();
            t4Var.D.setEmpty();
        }
        f4 f4Var = this.f19535s;
        f4Var.f19487f = false;
        v4 v4Var2 = f4Var.f19484a;
        v4Var2.f20463a.removeOnLayoutChangeListener(v4Var2.f20471l);
        t4 t4Var2 = v4Var2.f20464b;
        if (!t4Var2.F) {
            t4Var2.G = false;
            t4Var2.F = true;
            t4Var2.f20364x.cancel();
            t4Var2.f20363w.start();
            t4Var2.D.setEmpty();
        }
        e4 e4Var = this.f19532p;
        View view = this.f19529m;
        view.removeCallbacks(e4Var);
        view.removeCallbacks(this.f19533q);
        this.f19521b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f19522c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f19520a);
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
        View view = this.f19529m;
        e4 e4Var = this.f19533q;
        view.removeCallbacks(e4Var);
        if (min <= 0) {
            e4Var.run();
            return;
        }
        f4 f4Var = this.f19535s;
        f4Var.f19485b = true;
        f4Var.a();
        view.postDelayed(e4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f19521b.onPrepareActionMode(this, this.f19522c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f19521b;
        View view = this.f19529m;
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
        f4 f4Var = this.f19535s;
        f4Var.e = z10;
        f4Var.a();
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
