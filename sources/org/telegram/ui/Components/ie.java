package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class ie extends ImageView {
    public final int f36108a;
    public final ChatActivityEnterView f36109b;

    public ie(ChatActivityEnterView chatActivityEnterView, Context context, int i7) {
        super(context);
        this.f36108a = i7;
        this.f36109b = chatActivityEnterView;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f36108a) {
            case 0:
                if (getAlpha() >= 0.5f && this.f36109b.f32706w1 <= 0.0f) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f36108a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f36109b;
                float f10 = chatActivityEnterView.f32706w1;
                if (f10 < 1.0f) {
                    if (f10 > 0.0f) {
                        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - chatActivityEnterView.f32706w1) * 255.0f));
                        super.draw(canvas);
                        canvas.restoreToCount(saveLayerAlpha);
                        return;
                    }
                    super.draw(canvas);
                    return;
                }
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f36108a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                post(new td(this.f36109b, 16));
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f36108a) {
            case 3:
                if (getAlpha() <= 0.0f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f36108a) {
            case 1:
                super.setAlpha(f10);
                se seVar = this.f36109b.f32715x2;
                if (seVar != null) {
                    seVar.setTranslationX(seVar.f39613a);
                    return;
                }
                return;
            case 2:
                super.setAlpha(f10);
                se seVar2 = this.f36109b.f32715x2;
                if (seVar2 != null) {
                    seVar2.setTranslationX(seVar2.f39613a);
                    return;
                }
                return;
            case 3:
                super.setAlpha(f10);
                oe oeVar = this.f36109b.f32541a1;
                if (oeVar != null) {
                    oeVar.invalidate();
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f36108a) {
            case 3:
                super.setVisibility(i7);
                oe oeVar = this.f36109b.f32541a1;
                if (oeVar != null) {
                    oeVar.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
