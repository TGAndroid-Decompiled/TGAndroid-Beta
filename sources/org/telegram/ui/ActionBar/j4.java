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
    public final Context f19829a;
    public final ActionMode.Callback2 f19830b;
    public final Menu f19831c;
    public final Rect d;
    public final Rect e;
    public final Rect f19832f;
    public final int[] f19833g;
    public final int[] h;
    public final int[] f19834i;
    public final Rect f19835j;
    public final Rect f19836k;
    public final Rect f19837l;
    public final View f19838m;
    public final Point f19839n;
    public final int f19840o;
    public final h4 f19841p = new h4(this, 0);
    public final h4 f19842q = new h4(this, 1);
    public final y4 f19843r;
    public final i4 f19844s;

    public j4(Context context, ActionMode.Callback2 callback2, View view, y4 y4Var) {
        this.f19829a = context;
        this.f19830b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f19831c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f19830b.onActionItemClicked(j4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f19832f = new Rect();
        int[] iArr = new int[2];
        this.f19833g = iArr;
        this.h = new int[2];
        this.f19834i = new int[2];
        this.f19835j = new Rect();
        this.f19836k = new Rect();
        this.f19837l = new Rect();
        this.f19838m = view;
        view.getLocationOnScreen(iArr);
        this.f19840o = AndroidUtilities.dp(20.0f);
        this.f19839n = new Point();
        y4Var.e = menu;
        y4Var.f20761g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f19830b.onActionItemClicked(j4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f19843r = y4Var;
        i4 i4Var = new i4(y4Var);
        this.f19844s = i4Var;
        i4Var.f19799b = false;
        i4Var.f19800c = false;
        i4Var.d = false;
        i4Var.e = true;
        i4Var.f19801f = true;
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
        View view = this.f19838m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f19834i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f19833g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f19829a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f19839n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f19837l;
        rect3.set(0, 0, i10, i11);
        boolean c3 = c(rect2, rect3);
        Rect rect4 = this.f19832f;
        if (c3) {
            Rect rect5 = this.f19835j;
            if (c(rect2, rect5)) {
                this.f19844s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f19840o));
                if (!rect2.equals(rect4)) {
                    h4 h4Var = this.f19841p;
                    view.removeCallbacks(h4Var);
                    i4 i4Var = this.f19844s;
                    i4Var.getClass();
                    if (System.currentTimeMillis() - i4Var.f19802g > 500) {
                        i4Var.f19800c = true;
                    }
                    view.postDelayed(h4Var, 50L);
                    this.f19843r.f20759c.set(rect2);
                    y4 y4Var = this.f19843r;
                    if (y4Var.f20758b.f()) {
                        y4Var.c();
                    }
                }
                this.f19844s.a();
                rect4.set(rect2);
            }
        }
        this.f19844s.d = true;
        rect2.setEmpty();
        this.f19844s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f19838m;
        int[] iArr = this.f19833g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f19834i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f19835j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f19836k;
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
        y4 y4Var = this.f19843r;
        y4Var.f20757a.removeOnLayoutChangeListener(y4Var.f20765l);
        w4 w4Var = y4Var.f20758b;
        if (!w4Var.F) {
            w4Var.G = false;
            w4Var.F = true;
            w4Var.f20715x.cancel();
            w4Var.f20714w.start();
            w4Var.D.setEmpty();
        }
        i4 i4Var = this.f19844s;
        i4Var.f19801f = false;
        y4 y4Var2 = i4Var.f19798a;
        y4Var2.f20757a.removeOnLayoutChangeListener(y4Var2.f20765l);
        w4 w4Var2 = y4Var2.f20758b;
        if (!w4Var2.F) {
            w4Var2.G = false;
            w4Var2.F = true;
            w4Var2.f20715x.cancel();
            w4Var2.f20714w.start();
            w4Var2.D.setEmpty();
        }
        h4 h4Var = this.f19841p;
        View view = this.f19838m;
        view.removeCallbacks(h4Var);
        view.removeCallbacks(this.f19842q);
        this.f19830b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f19831c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f19829a);
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
        View view = this.f19838m;
        h4 h4Var = this.f19842q;
        view.removeCallbacks(h4Var);
        if (min <= 0) {
            h4Var.run();
            return;
        }
        i4 i4Var = this.f19844s;
        i4Var.f19799b = true;
        i4Var.a();
        view.postDelayed(h4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f19830b.onPrepareActionMode(this, this.f19831c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f19830b;
        View view = this.f19838m;
        Rect rect = this.d;
        callback2.onGetContentRect(this, view, rect);
        if (rect.left == 0 && rect.right == 0) {
            rect.left = 1;
            rect.right = 1;
        }
        d();
    }

    @Override
    public final void onWindowFocusChanged(boolean z4) {
        i4 i4Var = this.f19844s;
        i4Var.e = z4;
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
