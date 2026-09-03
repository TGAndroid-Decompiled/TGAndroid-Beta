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
    public final Context f19804a;
    public final ActionMode.Callback2 f19805b;
    public final Menu f19806c;
    public final Rect d;
    public final Rect e;
    public final Rect f19807f;
    public final int[] f19808g;
    public final int[] h;
    public final int[] f19809i;
    public final Rect f19810j;
    public final Rect f19811k;
    public final Rect f19812l;
    public final View f19813m;
    public final Point f19814n;
    public final int f19815o;
    public final h4 f19816p = new h4(this, 0);
    public final h4 f19817q = new h4(this, 1);
    public final y4 f19818r;
    public final i4 f19819s;

    public j4(Context context, ActionMode.Callback2 callback2, View view, y4 y4Var) {
        this.f19804a = context;
        this.f19805b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f19806c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f19805b.onActionItemClicked(j4.this, menuItem);
                return onActionItemClicked;
            }
        });
        this.d = new Rect();
        this.e = new Rect();
        this.f19807f = new Rect();
        int[] iArr = new int[2];
        this.f19808g = iArr;
        this.h = new int[2];
        this.f19809i = new int[2];
        this.f19810j = new Rect();
        this.f19811k = new Rect();
        this.f19812l = new Rect();
        this.f19813m = view;
        view.getLocationOnScreen(iArr);
        this.f19815o = AndroidUtilities.dp(20.0f);
        this.f19814n = new Point();
        y4Var.e = menu;
        y4Var.f20736g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean onActionItemClicked;
                onActionItemClicked = r0.f19805b.onActionItemClicked(j4.this, menuItem);
                return onActionItemClicked;
            }
        };
        this.f19818r = y4Var;
        i4 i4Var = new i4(y4Var);
        this.f19819s = i4Var;
        i4Var.f19774b = false;
        i4Var.f19775c = false;
        i4Var.d = false;
        i4Var.e = true;
        i4Var.f19776f = true;
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
        View view = this.f19813m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f19809i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f19808g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f19804a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f19814n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f19812l;
        rect3.set(0, 0, i10, i11);
        boolean c3 = c(rect2, rect3);
        Rect rect4 = this.f19807f;
        if (c3) {
            Rect rect5 = this.f19810j;
            if (c(rect2, rect5)) {
                this.f19819s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f19815o));
                if (!rect2.equals(rect4)) {
                    h4 h4Var = this.f19816p;
                    view.removeCallbacks(h4Var);
                    i4 i4Var = this.f19819s;
                    i4Var.getClass();
                    if (System.currentTimeMillis() - i4Var.f19777g > 500) {
                        i4Var.f19775c = true;
                    }
                    view.postDelayed(h4Var, 50L);
                    this.f19818r.f20734c.set(rect2);
                    y4 y4Var = this.f19818r;
                    if (y4Var.f20733b.f()) {
                        y4Var.c();
                    }
                }
                this.f19819s.a();
                rect4.set(rect2);
            }
        }
        this.f19819s.d = true;
        rect2.setEmpty();
        this.f19819s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f19813m;
        int[] iArr = this.f19808g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f19809i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f19810j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean equals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f19811k;
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
        y4 y4Var = this.f19818r;
        y4Var.f20732a.removeOnLayoutChangeListener(y4Var.f20740l);
        w4 w4Var = y4Var.f20733b;
        if (!w4Var.F) {
            w4Var.G = false;
            w4Var.F = true;
            w4Var.f20690x.cancel();
            w4Var.f20689w.start();
            w4Var.D.setEmpty();
        }
        i4 i4Var = this.f19819s;
        i4Var.f19776f = false;
        y4 y4Var2 = i4Var.f19773a;
        y4Var2.f20732a.removeOnLayoutChangeListener(y4Var2.f20740l);
        w4 w4Var2 = y4Var2.f20733b;
        if (!w4Var2.F) {
            w4Var2.G = false;
            w4Var2.F = true;
            w4Var2.f20690x.cancel();
            w4Var2.f20689w.start();
            w4Var2.D.setEmpty();
        }
        h4 h4Var = this.f19816p;
        View view = this.f19813m;
        view.removeCallbacks(h4Var);
        view.removeCallbacks(this.f19817q);
        this.f19805b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f19806c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f19804a);
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
        View view = this.f19813m;
        h4 h4Var = this.f19817q;
        view.removeCallbacks(h4Var);
        if (min <= 0) {
            h4Var.run();
            return;
        }
        i4 i4Var = this.f19819s;
        i4Var.f19774b = true;
        i4Var.a();
        view.postDelayed(h4Var, min);
    }

    @Override
    public final void invalidate() {
        this.f19805b.onPrepareActionMode(this, this.f19806c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f19805b;
        View view = this.f19813m;
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
        i4 i4Var = this.f19819s;
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
