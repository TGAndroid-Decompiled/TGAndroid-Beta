package org.telegram.ui.Components;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;
public abstract class yp extends Drawable {
    public final int f40800a;
    public Object f40801b;

    public yp() {
        this.f40800a = 1;
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    drawable.applyTheme(theme);
                    return;
                }
                return;
            default:
                super.applyTheme(theme);
                return;
        }
    }

    @Override
    public void clearColorFilter() {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    drawable.clearColorFilter();
                    return;
                } else {
                    super.clearColorFilter();
                    return;
                }
            default:
                super.clearColorFilter();
                return;
        }
    }

    @Override
    public Drawable getCurrent() {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    return drawable.getCurrent();
                }
                return super.getCurrent();
            default:
                return super.getCurrent();
        }
    }

    @Override
    public int getMinimumHeight() {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    return drawable.getMinimumHeight();
                }
                return super.getMinimumHeight();
            default:
                return super.getMinimumHeight();
        }
    }

    @Override
    public int getMinimumWidth() {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    return drawable.getMinimumWidth();
                }
                return super.getMinimumWidth();
            default:
                return super.getMinimumWidth();
        }
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public boolean getPadding(Rect rect) {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    return drawable.getPadding(rect);
                }
                return super.getPadding(rect);
            default:
                return super.getPadding(rect);
        }
    }

    @Override
    public int[] getState() {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    return drawable.getState();
                }
                return super.getState();
            default:
                return super.getState();
        }
    }

    @Override
    public Region getTransparentRegion() {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    return drawable.getTransparentRegion();
                }
                return super.getTransparentRegion();
            default:
                return super.getTransparentRegion();
        }
    }

    @Override
    public void jumpToCurrentState() {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    drawable.jumpToCurrentState();
                    return;
                }
                return;
            default:
                super.jumpToCurrentState();
                return;
        }
    }

    @Override
    public boolean onLevelChange(int i3) {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    return drawable.setLevel(i3);
                }
                return super.onLevelChange(i3);
            default:
                return super.onLevelChange(i3);
        }
    }

    @Override
    public void setAlpha(int i3) {
        ((Paint) this.f40801b).setAlpha(i3);
    }

    @Override
    public void setChangingConfigurations(int i3) {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    drawable.setChangingConfigurations(i3);
                    return;
                } else {
                    super.setChangingConfigurations(i3);
                    return;
                }
            default:
                super.setChangingConfigurations(i3);
                return;
        }
    }

    @Override
    public void setColorFilter(int i3, PorterDuff.Mode mode) {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    drawable.setColorFilter(i3, mode);
                    return;
                } else {
                    super.setColorFilter(i3, mode);
                    return;
                }
            default:
                super.setColorFilter(i3, mode);
                return;
        }
    }

    @Override
    public void setFilterBitmap(boolean z10) {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    drawable.setFilterBitmap(z10);
                    return;
                }
                return;
            default:
                super.setFilterBitmap(z10);
                return;
        }
    }

    @Override
    public void setHotspot(float f10, float f11) {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    drawable.setHotspot(f10, f11);
                    return;
                }
                return;
            default:
                super.setHotspot(f10, f11);
                return;
        }
    }

    @Override
    public void setHotspotBounds(int i3, int i10, int i11, int i12) {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    drawable.setHotspotBounds(i3, i10, i11, i12);
                    return;
                }
                return;
            default:
                super.setHotspotBounds(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean setState(int[] iArr) {
        switch (this.f40800a) {
            case 1:
                Drawable drawable = (Drawable) this.f40801b;
                if (drawable != null) {
                    return drawable.setState(iArr);
                }
                return super.setState(iArr);
            default:
                return super.setState(iArr);
        }
    }

    public yp(View view) {
        this.f40800a = 0;
        this.f40801b = new Paint(1);
        if (view != null) {
            view.addOnAttachStateChangeListener(new ai.f2(this, 13));
            if (view.isAttachedToWindow()) {
                view.post(new gp(this, 1));
            }
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        ((Paint) this.f40801b).setColorFilter(colorFilter);
    }

    public void a() {
    }

    public void b() {
    }
}
