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
public final class u3 extends ActionMode {
    public final Context f28675a;
    public final ActionMode.Callback2 f28676b;
    public final Menu f28677c;
    public final Rect d;
    public final Rect f28678e;
    public final Rect f28679f;
    public final int[] f28680g;
    public final int[] h;
    public final int[] f28681i;
    public final Rect f28682j;
    public final Rect f28683k;
    public final Rect f28684l;
    public final View f28685m;
    public final Point f28686n;
    public final int f28687o;
    public final s3 f28688p = new s3(this, 0);
    public final s3 f28689q = new s3(this, 1);
    public final k4 f28690r;
    public final t3 f28691s;

    public u3(Context context, ActionMode.Callback2 callback2, View view, k4 k4Var) {
        this.f28675a = context;
        this.f28676b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f28677c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                u3 u3Var = u3.this;
                return u3Var.f28676b.onActionItemClicked(u3Var, menuItem);
            }
        });
        this.d = new Rect();
        this.f28678e = new Rect();
        this.f28679f = new Rect();
        int[] iArr = new int[2];
        this.f28680g = iArr;
        this.h = new int[2];
        this.f28681i = new int[2];
        this.f28682j = new Rect();
        this.f28683k = new Rect();
        this.f28684l = new Rect();
        this.f28685m = view;
        view.getLocationOnScreen(iArr);
        this.f28687o = org.telegram.messenger.g0.L(20.0f);
        this.f28686n = new Point();
        k4Var.f27770e = menu;
        k4Var.f27772g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                u3 u3Var = u3.this;
                return u3Var.f28676b.onActionItemClicked(u3Var, menuItem);
            }
        };
        this.f28690r = k4Var;
        t3 t3Var = new t3(k4Var);
        this.f28691s = t3Var;
        t3Var.f28628b = false;
        t3Var.f28629c = false;
        t3Var.d = false;
        t3Var.f28630e = true;
        t3Var.f28631f = true;
    }

    public static boolean a(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void b() {
        Rect rect = this.d;
        Rect rect2 = this.f28678e;
        rect2.set(rect);
        View view = this.f28685m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f28681i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f28680g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f28675a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f28686n;
        defaultDisplay.getRealSize(point);
        int i3 = point.x;
        int i10 = point.y;
        Rect rect3 = this.f28684l;
        rect3.set(0, 0, i3, i10);
        boolean a10 = a(rect2, rect3);
        Rect rect4 = this.f28679f;
        if (a10) {
            Rect rect5 = this.f28682j;
            if (a(rect2, rect5)) {
                this.f28691s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f28687o));
                if (!rect2.equals(rect4)) {
                    s3 s3Var = this.f28688p;
                    view.removeCallbacks(s3Var);
                    t3 t3Var = this.f28691s;
                    t3Var.getClass();
                    if (System.currentTimeMillis() - t3Var.f28632g > 500) {
                        t3Var.f28629c = true;
                    }
                    view.postDelayed(s3Var, 50L);
                    this.f28690r.f27769c.set(rect2);
                    k4 k4Var = this.f28690r;
                    if (k4Var.f27768b.f()) {
                        k4Var.c();
                    }
                }
                this.f28691s.a();
                rect4.set(rect2);
            }
        }
        this.f28691s.d = true;
        rect2.setEmpty();
        this.f28691s.a();
        rect4.set(rect2);
    }

    public final void c() {
        View view = this.f28685m;
        int[] iArr = this.f28680g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f28681i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f28682j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f28683k;
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
        k4 k4Var = this.f28690r;
        k4Var.f27767a.removeOnLayoutChangeListener(k4Var.f27776l);
        i4 i4Var = k4Var.f27768b;
        if (!i4Var.F) {
            i4Var.G = false;
            i4Var.F = true;
            i4Var.f27628x.cancel();
            i4Var.f27627w.start();
            i4Var.D.setEmpty();
        }
        t3 t3Var = this.f28691s;
        t3Var.f28631f = false;
        k4 k4Var2 = t3Var.f28627a;
        k4Var2.f27767a.removeOnLayoutChangeListener(k4Var2.f27776l);
        i4 i4Var2 = k4Var2.f27768b;
        if (!i4Var2.F) {
            i4Var2.G = false;
            i4Var2.F = true;
            i4Var2.f27628x.cancel();
            i4Var2.f27627w.start();
            i4Var2.D.setEmpty();
        }
        s3 s3Var = this.f28688p;
        View view = this.f28685m;
        view.removeCallbacks(s3Var);
        view.removeCallbacks(this.f28689q);
        this.f28676b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f28677c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f28675a);
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
        View view = this.f28685m;
        s3 s3Var = this.f28689q;
        view.removeCallbacks(s3Var);
        if (min <= 0) {
            s3Var.run();
            return;
        }
        t3 t3Var = this.f28691s;
        t3Var.f28628b = true;
        t3Var.a();
        view.postDelayed(s3Var, min);
    }

    @Override
    public final void invalidate() {
        this.f28676b.onPrepareActionMode(this, this.f28677c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f28676b;
        View view = this.f28685m;
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
        t3 t3Var = this.f28691s;
        t3Var.f28630e = z10;
        t3Var.a();
    }

    @Override
    public final void setSubtitle(int i3) {
    }

    @Override
    public final void setTitle(int i3) {
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
