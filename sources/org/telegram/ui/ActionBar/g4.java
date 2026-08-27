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

    public final Context f22976a;

    public final ActionMode.Callback2 f22977b;

    public final Menu f22978c;
    public final Rect d;

    public final Rect f22979e;

    public final Rect f22980f;

    public final int[] f22981g;
    public final int[] h;

    public final int[] f22982i;

    public final Rect f22983j;

    public final Rect f22984k;

    public final Rect f22985l;

    public final View f22986m;

    public final Point f22987n;

    public final int f22988o;

    public final e4 f22989p = new e4(this, 0);

    public final e4 f22990q = new e4(this, 1);

    public final v4 f22991r;

    public final f4 f22992s;

    public g4(Context context, ActionMode.Callback2 callback2, View view, v4 v4Var) {
        this.f22976a = context;
        this.f22977b = callback2;
        PopupMenu popupMenu = new PopupMenu(context, null);
        Menu menu = popupMenu.getMenu();
        this.f22978c = menu;
        setType(1);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                g4 g4Var = this.f22818a;
                return g4Var.f22977b.onActionItemClicked(g4Var, menuItem);
            }
        });
        this.d = new Rect();
        this.f22979e = new Rect();
        this.f22980f = new Rect();
        int[] iArr = new int[2];
        this.f22981g = iArr;
        this.h = new int[2];
        this.f22982i = new int[2];
        this.f22983j = new Rect();
        this.f22984k = new Rect();
        this.f22985l = new Rect();
        this.f22986m = view;
        view.getLocationOnScreen(iArr);
        this.f22988o = AndroidUtilities.dp(20.0f);
        this.f22987n = new Point();
        v4Var.f23906e = menu;
        v4Var.f23908g = new MenuItem.OnMenuItemClickListener() {
            @Override
            public final boolean onMenuItemClick(MenuItem menuItem) {
                g4 g4Var = this.f22842a;
                return g4Var.f22977b.onActionItemClicked(g4Var, menuItem);
            }
        };
        this.f22991r = v4Var;
        f4 f4Var = new f4(v4Var);
        this.f22992s = f4Var;
        f4Var.f22934b = false;
        f4Var.f22935c = false;
        f4Var.d = false;
        f4Var.f22936e = true;
        f4Var.f22937f = true;
    }

    public static boolean c(Rect rect, Rect rect2) {
        return rect.left <= rect2.right && rect2.left <= rect.right && rect.top <= rect2.bottom && rect2.top <= rect.bottom;
    }

    public final void d() {
        Rect rect = this.d;
        Rect rect2 = this.f22979e;
        rect2.set(rect);
        View view = this.f22986m;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            parent.getChildVisibleRect(view, rect2, null);
            int[] iArr = this.f22982i;
            rect2.offset(iArr[0], iArr[1]);
        } else {
            int[] iArr2 = this.f22981g;
            rect2.offset(iArr2[0], iArr2[1]);
        }
        Display defaultDisplay = ((WindowManager) this.f22976a.getSystemService(WindowManager.class)).getDefaultDisplay();
        Point point = this.f22987n;
        defaultDisplay.getRealSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Rect rect3 = this.f22985l;
        rect3.set(0, 0, i10, i11);
        boolean zC = c(rect2, rect3);
        Rect rect4 = this.f22980f;
        if (zC) {
            Rect rect5 = this.f22983j;
            if (c(rect2, rect5)) {
                this.f22992s.d = false;
                rect2.set(Math.max(rect2.left, rect5.left), Math.max(rect2.top, rect5.top), Math.min(rect2.right, rect5.right), Math.min(rect2.bottom, rect5.bottom + this.f22988o));
                if (!rect2.equals(rect4)) {
                    Runnable runnable = this.f22989p;
                    view.removeCallbacks(runnable);
                    f4 f4Var = this.f22992s;
                    f4Var.getClass();
                    if (System.currentTimeMillis() - f4Var.f22938g > 500) {
                        f4Var.f22935c = true;
                    }
                    view.postDelayed(runnable, 50L);
                    this.f22991r.f23905c.set(rect2);
                    v4 v4Var = this.f22991r;
                    if (v4Var.f23904b.f()) {
                        v4Var.c();
                    }
                }
            } else {
                this.f22992s.d = true;
                rect2.setEmpty();
            }
        } else {
            this.f22992s.d = true;
            rect2.setEmpty();
        }
        this.f22992s.a();
        rect4.set(rect2);
    }

    public final void e() {
        View view = this.f22986m;
        int[] iArr = this.f22981g;
        view.getLocationOnScreen(iArr);
        View rootView = view.getRootView();
        int[] iArr2 = this.f22982i;
        rootView.getLocationOnScreen(iArr2);
        Rect rect = this.f22983j;
        view.getGlobalVisibleRect(rect);
        rect.offset(iArr2[0], iArr2[1]);
        int[] iArr3 = this.h;
        boolean zEquals = Arrays.equals(iArr, iArr3);
        Rect rect2 = this.f22984k;
        if (zEquals && rect.equals(rect2)) {
            return;
        }
        d();
        iArr3[0] = iArr[0];
        iArr3[1] = iArr[1];
        rect2.set(rect);
    }

    @Override
    public final void finish() {
        v4 v4Var = this.f22991r;
        v4Var.f23903a.removeOnLayoutChangeListener(v4Var.f23912l);
        t4 t4Var = v4Var.f23904b;
        if (!t4Var.F) {
            t4Var.G = false;
            t4Var.F = true;
            t4Var.f23802x.cancel();
            t4Var.f23801w.start();
            t4Var.D.setEmpty();
        }
        f4 f4Var = this.f22992s;
        f4Var.f22937f = false;
        v4 v4Var2 = f4Var.f22933a;
        v4Var2.f23903a.removeOnLayoutChangeListener(v4Var2.f23912l);
        t4 t4Var2 = v4Var2.f23904b;
        if (!t4Var2.F) {
            t4Var2.G = false;
            t4Var2.F = true;
            t4Var2.f23802x.cancel();
            t4Var2.f23801w.start();
            t4Var2.D.setEmpty();
        }
        e4 e4Var = this.f22989p;
        View view = this.f22986m;
        view.removeCallbacks(e4Var);
        view.removeCallbacks(this.f22990q);
        this.f22977b.onDestroyActionMode(this);
    }

    @Override
    public final View getCustomView() {
        return null;
    }

    @Override
    public final Menu getMenu() {
        return this.f22978c;
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return new MenuInflater(this.f22976a);
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
        long jMin = Math.min(3000L, j10);
        View view = this.f22986m;
        e4 e4Var = this.f22990q;
        view.removeCallbacks(e4Var);
        if (jMin <= 0) {
            e4Var.run();
            return;
        }
        f4 f4Var = this.f22992s;
        f4Var.f22934b = true;
        f4Var.a();
        view.postDelayed(e4Var, jMin);
    }

    @Override
    public final void invalidate() {
        this.f22977b.onPrepareActionMode(this, this.f22978c);
        invalidateContentRect();
    }

    @Override
    public final void invalidateContentRect() {
        ActionMode.Callback2 callback2 = this.f22977b;
        View view = this.f22986m;
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
        f4 f4Var = this.f22992s;
        f4Var.f22936e = z10;
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
