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
public final class j4 extends ActionMode {
    public final Context f18784a;
    public final ActionMode.Callback2 f18785b;
    public final Menu f18786c;
    public final Rect d;
    public final Rect e;
    public final Rect f18787f;
    public final int[] f18788g;
    public final int[] h;
    public final int[] f18789i;
    public final Rect f18790j;
    public final Rect f18791k;
    public final Rect f18792l;
    public final View f18793m;
    public final Point f18794n;
    public final int f18795o;
    public final h4 f18796p = new h4(this, 0);
    public final h4 f18797q = new h4(this, 1);
    public final y4 f18798r;
    public final i4 f18799s;

    public j4(Context context, ActionMode.Callback2 callback2, View view, y4 y4Var) {
        this.f18784a = context;
        this.f18785b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f18786c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f18785b.onActionItemClicked(j4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f18787f = new Rect();
        int[] iArr = new int[2];
        this.f18788g = iArr;
        this.h = new int[2];
        this.f18789i = new int[2];
        this.f18790j = new Rect();
        this.f18791k = new Rect();
        this.f18792l = new Rect();
        this.f18793m = view;
        view.getLocationOnScreen(iArr);
        this.f18795o = AndroidUtilities.dp(20.0f);
        this.f18794n = new Point();
        y4Var.e = menu;
        y4Var.f19732g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f18785b.onActionItemClicked(j4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f18798r = y4Var;
        i4 i4Var = new i4(y4Var);
        this.f18799s = i4Var;
        i4Var.f18751b = false;
        i4Var.f18752c = false;
        i4Var.d = false;
        i4Var.e = true;
        i4Var.f18753f = true;
    }

    public static boolean c(Rect rect, Rect rect2) {
        if (rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public final void d() {
        Rect rect = this.d;
        Rect rect2 = this.e;
        rect2.set(rect);
        View view = this.f18793m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f18789i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f18788g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f18784a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f18794n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f18792l;
        rect3.set(0, 0, i10, i11);
        boolean c10 = c(rect2, rect3);
        Rect rect4 = this.f18787f;
        if (c10) {
            Rect rect5 = this.f18790j;
            if (c(rect2, rect5)) {
                this.f18799s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f18795o));
                if (!rect2.equals(rect4)) {
                    h4 h4Var = this.f18796p;
                    view.removeCallbacks(h4Var);
                    i4 i4Var = this.f18799s;
                    i4Var.getClass();
                    if (System.currentTimeMillis() - i4Var.f18754g > 500) {
                        i4Var.f18752c = true;
                    }
                    view.postDelayed(h4Var, 50L);
                    this.f18798r.f19730c.set(rect2);
                    y4 y4Var = this.f18798r;
                    if (y4Var.f19729b.f()) {
                        y4Var.c();
                    }
                }
                this.f18799s.a();
                rect4.set(rect2);
            }
        }
        this.f18799s.d = true;
        rect2.setEmpty();
        this.f18799s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f18793m;
        int[] iArr = this.f18788g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f18789i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f18790j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f18791k;
        if (equals && rect.equals(rect2)) {
            return;
        }
        d();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override
    public final void finish() {
        y4 y4Var = this.f18798r;
        y4Var.f19728a.removeOnLayoutChangeListener(y4Var.f19736l);
        w4 w4Var = y4Var.f19729b;
        if (!w4Var.F) {
            w4Var.G = false;
            w4Var.F = true;
            w4Var.f19657x.cancel();
            w4Var.f19656w.start();
            w4Var.D.setEmpty();
        }
        i4 i4Var = this.f18799s;
        i4Var.f18753f = false;
        y4 y4Var2 = i4Var.f18750a;
        y4Var2.f19728a.removeOnLayoutChangeListener(y4Var2.f19736l);
        w4 w4Var2 = y4Var2.f19729b;
        if (!w4Var2.F) {
            w4Var2.G = false;
            w4Var2.F = true;
            w4Var2.f19657x.cancel();
            w4Var2.f19656w.start();
            w4Var2.D.setEmpty();
        }
        h4 h4Var = this.f18796p;
        View view = this.f18793m;
        view.removeCallbacks(h4Var);
        view.removeCallbacks(this.f18797q);
        this.f18785b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f18786c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f18784a);
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
        View view = this.f18793m;
        h4 h4Var = this.f18797q;
        view.removeCallbacks(h4Var);
        if (min <= 0) {
            h4Var.run();
            return;
        }
        i4 i4Var = this.f18799s;
        i4Var.f18751b = true;
        i4Var.a();
        view.postDelayed(h4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f18785b.onPrepareActionMode(this, this.f18786c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f18785b;
        View view = this.f18793m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        d();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        i4 i4Var = this.f18799s;
        i4Var.e = z10;
        i4Var.a();
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
