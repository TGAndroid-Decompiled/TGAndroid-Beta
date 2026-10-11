package org.telegram.ui.Components;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;
public abstract class hr extends Drawable {
    public final int f27221a;
    public Object f27222b;

    public hr() {
        this.f27221a = 1;
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
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
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
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
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
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
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
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
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
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
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
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
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
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
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
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
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
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
    public boolean onLevelChange(int i10) {
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
                if (drawable != null) {
                    return drawable.setLevel(i10);
                }
                return super.onLevelChange(i10);
            default:
                return super.onLevelChange(i10);
        }
    }

    @Override
    public void setAlpha(int i10) {
        ((Paint) this.f27222b).setAlpha(i10);
    }

    @Override
    public void setChangingConfigurations(int i10) {
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
                if (drawable != null) {
                    drawable.setChangingConfigurations(i10);
                    return;
                } else {
                    super.setChangingConfigurations(i10);
                    return;
                }
            default:
                super.setChangingConfigurations(i10);
                return;
        }
    }

    @Override
    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
                if (drawable != null) {
                    drawable.setColorFilter(i10, mode);
                    return;
                } else {
                    super.setColorFilter(i10, mode);
                    return;
                }
            default:
                super.setColorFilter(i10, mode);
                return;
        }
    }

    @Override
    public void setFilterBitmap(boolean z10) {
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
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
    public void setHotspot(float f7, float f10) {
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
                if (drawable != null) {
                    drawable.setHotspot(f7, f10);
                    return;
                }
                return;
            default:
                super.setHotspot(f7, f10);
                return;
        }
    }

    @Override
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
                if (drawable != null) {
                    drawable.setHotspotBounds(i10, i11, i12, i13);
                    return;
                }
                return;
            default:
                super.setHotspotBounds(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean setState(int[] iArr) {
        switch (this.f27221a) {
            case 1:
                Drawable drawable = (Drawable) this.f27222b;
                if (drawable != null) {
                    return drawable.setState(iArr);
                }
                return super.setState(iArr);
            default:
                return super.setState(iArr);
        }
    }

    public hr(View view) {
        this.f27221a = 0;
        this.f27222b = new Paint(1);
        if (view != null) {
            view.addOnAttachStateChangeListener(new ai.v2(this, 7));
            if (view.isAttachedToWindow()) {
                view.post(new nq(this, 1));
            }
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        ((Paint) this.f27222b).setColorFilter(colorFilter);
    }

    public void a() {
    }

    public void b() {
    }
}
