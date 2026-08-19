package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;

public class PhotoCropActivity extends BaseFragment {
    private String bitmapKey;
    private PhotoEditActivityDelegate delegate;
    private boolean doneButtonPressed;
    private BitmapDrawable drawable;
    private Bitmap imageToCrop;
    private boolean sameBitmap;
    private PhotoCropView view;

    public interface PhotoEditActivityDelegate {
        void didFinishEdit(Bitmap bitmap);
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    class PhotoCropView extends FrameLayout {
        int bitmapHeight;
        int bitmapWidth;
        int bitmapX;
        int bitmapY;
        Paint circlePaint;
        int draggingState;
        boolean freeform;
        Paint halfPaint;
        float oldX;
        float oldY;
        Paint rectPaint;
        float rectSizeX;
        float rectSizeY;
        float rectX;
        float rectY;
        int viewHeight;
        int viewWidth;

        public PhotoCropView(Context context) {
            super(context);
            this.rectPaint = null;
            this.circlePaint = null;
            this.halfPaint = null;
            this.rectSizeX = 600.0f;
            this.rectSizeY = 600.0f;
            this.rectX = -1.0f;
            this.rectY = -1.0f;
            this.draggingState = 0;
            this.oldX = 0.0f;
            this.oldY = 0.0f;
            init();
        }

        private void init() {
            Paint paint = new Paint();
            this.rectPaint = paint;
            paint.setColor(1073412858);
            this.rectPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            this.rectPaint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.circlePaint = paint2;
            paint2.setColor(-1);
            Paint paint3 = new Paint();
            this.halfPaint = paint3;
            paint3.setColor(-939524096);
            setBackgroundColor(-13421773);
            setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return PhotoCropActivity.PhotoCropView.$r8$lambda$QFijPByeiVSSRlL1P9yGxm2waf4(this.f$0, view, motionEvent);
                }
            });
        }

        public static boolean $r8$lambda$QFijPByeiVSSRlL1P9yGxm2waf4(PhotoCropView photoCropView, View view, MotionEvent motionEvent) {
            int i;
            float f;
            photoCropView.getClass();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int iDp = AndroidUtilities.dp(14.0f);
            if (motionEvent.getAction() == 0) {
                float f2 = photoCropView.rectX;
                float f3 = iDp;
                float f4 = f2 - f3;
                if (f4 >= x || f2 + f3 <= x) {
                    float f5 = photoCropView.rectSizeX;
                    f = f4 + f5;
                    if (f >= x && f2 + f3 + f5 > x) {
                        float f6 = photoCropView.rectY;
                        if (f6 - f3 < y && f6 + f3 > y) {
                            photoCropView.draggingState = 2;
                        } else if (f4 >= x) {
                            if (f >= x) {
                                if (f2 >= x) {
                                    photoCropView.draggingState = 0;
                                } else {
                                    photoCropView.draggingState = 0;
                                }
                            } else if (f2 >= x) {
                                photoCropView.draggingState = 0;
                            } else {
                                photoCropView.draggingState = 0;
                            }
                        } else if (f >= x) {
                            if (f2 >= x) {
                                photoCropView.draggingState = 0;
                            } else {
                                photoCropView.draggingState = 0;
                            }
                        } else if (f2 >= x) {
                            photoCropView.draggingState = 0;
                        } else {
                            photoCropView.draggingState = 0;
                        }
                    } else if (f4 >= x && f2 + f3 > x) {
                        float f7 = photoCropView.rectY;
                        float f8 = photoCropView.rectSizeY;
                        if ((f7 - f3) + f8 < y && f7 + f3 + f8 > y) {
                            photoCropView.draggingState = 3;
                        } else if (f >= x) {
                            if (f2 >= x) {
                                photoCropView.draggingState = 0;
                            } else {
                                photoCropView.draggingState = 0;
                            }
                        } else if (f2 >= x) {
                            photoCropView.draggingState = 0;
                        } else {
                            photoCropView.draggingState = 0;
                        }
                    } else if (f >= x && f2 + f3 + f5 > x) {
                        float f9 = photoCropView.rectY;
                        float f10 = photoCropView.rectSizeY;
                        if ((f9 - f3) + f10 < y && f9 + f3 + f10 > y) {
                            photoCropView.draggingState = 4;
                        } else if (f2 >= x) {
                            photoCropView.draggingState = 0;
                        } else {
                            photoCropView.draggingState = 0;
                        }
                    } else if (f2 >= x && f2 + f5 > x) {
                        float f11 = photoCropView.rectY;
                        if (f11 < y && f11 + photoCropView.rectSizeY > y) {
                            photoCropView.draggingState = 5;
                        } else {
                            photoCropView.draggingState = 0;
                        }
                    } else {
                        photoCropView.draggingState = 0;
                    }
                } else {
                    float f12 = photoCropView.rectY;
                    if (f12 - f3 < y && f12 + f3 > y) {
                        photoCropView.draggingState = 1;
                    } else {
                        float f13 = photoCropView.rectSizeX;
                        f = f4 + f13;
                        if (f >= x) {
                            if (f4 >= x) {
                                if (f >= x) {
                                    if (f2 >= x) {
                                        photoCropView.draggingState = 0;
                                    } else {
                                        photoCropView.draggingState = 0;
                                    }
                                } else if (f2 >= x) {
                                    photoCropView.draggingState = 0;
                                } else {
                                    photoCropView.draggingState = 0;
                                }
                            } else if (f >= x) {
                                if (f2 >= x) {
                                    photoCropView.draggingState = 0;
                                } else {
                                    photoCropView.draggingState = 0;
                                }
                            } else if (f2 >= x) {
                                photoCropView.draggingState = 0;
                            } else {
                                photoCropView.draggingState = 0;
                            }
                        } else if (f4 >= x) {
                            if (f >= x) {
                                if (f2 >= x) {
                                    photoCropView.draggingState = 0;
                                } else {
                                    photoCropView.draggingState = 0;
                                }
                            } else if (f2 >= x) {
                                photoCropView.draggingState = 0;
                            } else {
                                photoCropView.draggingState = 0;
                            }
                        } else if (f >= x) {
                            if (f2 >= x) {
                                photoCropView.draggingState = 0;
                            } else {
                                photoCropView.draggingState = 0;
                            }
                        } else if (f2 >= x) {
                            photoCropView.draggingState = 0;
                        } else {
                            photoCropView.draggingState = 0;
                        }
                    }
                }
                if (photoCropView.draggingState != 0) {
                    photoCropView.requestDisallowInterceptTouchEvent(true);
                }
                photoCropView.oldX = x;
                photoCropView.oldY = y;
                return true;
            }
            if (motionEvent.getAction() == 1) {
                photoCropView.draggingState = 0;
                return true;
            }
            if (motionEvent.getAction() == 2 && (i = photoCropView.draggingState) != 0) {
                float f14 = x - photoCropView.oldX;
                float f15 = y - photoCropView.oldY;
                if (i == 5) {
                    float f16 = photoCropView.rectX + f14;
                    photoCropView.rectX = f16;
                    float f17 = photoCropView.rectY + f15;
                    photoCropView.rectY = f17;
                    int i2 = photoCropView.bitmapX;
                    float f18 = i2;
                    if (f16 < f18) {
                        photoCropView.rectX = f18;
                    } else {
                        float f19 = photoCropView.rectSizeX;
                        float f20 = f16 + f19;
                        float f21 = i2 + photoCropView.bitmapWidth;
                        if (f20 > f21) {
                            photoCropView.rectX = f21 - f19;
                        }
                    }
                    int i3 = photoCropView.bitmapY;
                    float f22 = i3;
                    if (f17 < f22) {
                        photoCropView.rectY = f22;
                    } else {
                        float f23 = photoCropView.rectSizeY;
                        float f24 = f17 + f23;
                        float f25 = i3 + photoCropView.bitmapHeight;
                        if (f24 > f25) {
                            photoCropView.rectY = f25 - f23;
                        }
                    }
                } else if (i == 1) {
                    float f26 = photoCropView.rectSizeX;
                    if (f26 - f14 < 160.0f) {
                        f14 = f26 - 160.0f;
                    }
                    float f27 = photoCropView.rectX;
                    float f28 = f27 + f14;
                    float f29 = photoCropView.bitmapX;
                    if (f28 < f29) {
                        f14 = f29 - f27;
                    }
                    if (!photoCropView.freeform) {
                        float f30 = photoCropView.rectY;
                        float f31 = f30 + f14;
                        float f32 = photoCropView.bitmapY;
                        if (f31 < f32) {
                            f14 = f32 - f30;
                        }
                        photoCropView.rectX = f27 + f14;
                        photoCropView.rectY = f30 + f14;
                        photoCropView.rectSizeX = f26 - f14;
                        photoCropView.rectSizeY -= f14;
                    } else {
                        float f33 = photoCropView.rectSizeY;
                        if (f33 - f15 < 160.0f) {
                            f15 = f33 - 160.0f;
                        }
                        float f34 = photoCropView.rectY;
                        float f35 = f34 + f15;
                        float f36 = photoCropView.bitmapY;
                        if (f35 < f36) {
                            f15 = f36 - f34;
                        }
                        photoCropView.rectX = f27 + f14;
                        photoCropView.rectY = f34 + f15;
                        photoCropView.rectSizeX = f26 - f14;
                        photoCropView.rectSizeY = f33 - f15;
                    }
                } else if (i == 2) {
                    float f37 = photoCropView.rectSizeX;
                    if (f37 + f14 < 160.0f) {
                        f14 = -(f37 - 160.0f);
                    }
                    float f38 = photoCropView.rectX;
                    float f39 = f38 + f37 + f14;
                    float f40 = photoCropView.bitmapX + photoCropView.bitmapWidth;
                    if (f39 > f40) {
                        f14 = (f40 - f38) - f37;
                    }
                    if (!photoCropView.freeform) {
                        float f41 = photoCropView.rectY;
                        float f42 = f41 - f14;
                        float f43 = photoCropView.bitmapY;
                        if (f42 < f43) {
                            f14 = f41 - f43;
                        }
                        photoCropView.rectY = f41 - f14;
                        photoCropView.rectSizeX = f37 + f14;
                        photoCropView.rectSizeY += f14;
                    } else {
                        float f44 = photoCropView.rectSizeY;
                        if (f44 - f15 < 160.0f) {
                            f15 = f44 - 160.0f;
                        }
                        float f45 = photoCropView.rectY;
                        float f46 = f45 + f15;
                        float f47 = photoCropView.bitmapY;
                        if (f46 < f47) {
                            f15 = f47 - f45;
                        }
                        photoCropView.rectY = f45 + f15;
                        photoCropView.rectSizeX = f37 + f14;
                        photoCropView.rectSizeY = f44 - f15;
                    }
                } else if (i == 3) {
                    float f48 = photoCropView.rectSizeX;
                    if (f48 - f14 < 160.0f) {
                        f14 = f48 - 160.0f;
                    }
                    float f49 = photoCropView.rectX;
                    float f50 = f49 + f14;
                    float f51 = photoCropView.bitmapX;
                    if (f50 < f51) {
                        f14 = f51 - f49;
                    }
                    if (!photoCropView.freeform) {
                        float f52 = photoCropView.rectY + f48;
                        float f53 = f52 - f14;
                        int i4 = photoCropView.bitmapY;
                        int i5 = photoCropView.bitmapHeight;
                        if (f53 > i4 + i5) {
                            f14 = (f52 - i4) - i5;
                        }
                        photoCropView.rectX = f49 + f14;
                        photoCropView.rectSizeX = f48 - f14;
                        photoCropView.rectSizeY -= f14;
                    } else {
                        float f54 = photoCropView.rectY;
                        float f55 = photoCropView.rectSizeY;
                        float f56 = f54 + f55 + f15;
                        float f57 = photoCropView.bitmapY + photoCropView.bitmapHeight;
                        if (f56 > f57) {
                            f15 = (f57 - f54) - f55;
                        }
                        photoCropView.rectX = f49 + f14;
                        photoCropView.rectSizeX = f48 - f14;
                        float f58 = f55 + f15;
                        photoCropView.rectSizeY = f58;
                        if (f58 < 160.0f) {
                            photoCropView.rectSizeY = 160.0f;
                        }
                    }
                } else if (i == 4) {
                    float f59 = photoCropView.rectX;
                    float f60 = photoCropView.rectSizeX;
                    float f61 = f59 + f60 + f14;
                    float f62 = photoCropView.bitmapX + photoCropView.bitmapWidth;
                    if (f61 > f62) {
                        f14 = (f62 - f59) - f60;
                    }
                    if (!photoCropView.freeform) {
                        float f63 = photoCropView.rectY;
                        float f64 = f63 + f60 + f14;
                        float f65 = photoCropView.bitmapY + photoCropView.bitmapHeight;
                        if (f64 > f65) {
                            f14 = (f65 - f63) - f60;
                        }
                        photoCropView.rectSizeX = f60 + f14;
                        photoCropView.rectSizeY += f14;
                    } else {
                        float f66 = photoCropView.rectY;
                        float f67 = photoCropView.rectSizeY;
                        float f68 = f66 + f67 + f15;
                        float f69 = photoCropView.bitmapY + photoCropView.bitmapHeight;
                        if (f68 > f69) {
                            f15 = (f69 - f66) - f67;
                        }
                        photoCropView.rectSizeX = f60 + f14;
                        photoCropView.rectSizeY = f67 + f15;
                    }
                    if (photoCropView.rectSizeX < 160.0f) {
                        photoCropView.rectSizeX = 160.0f;
                    }
                    if (photoCropView.rectSizeY < 160.0f) {
                        photoCropView.rectSizeY = 160.0f;
                    }
                }
                photoCropView.oldX = x;
                photoCropView.oldY = y;
                photoCropView.invalidate();
            }
            return true;
        }

        private void updateBitmapSize() {
            if (this.viewWidth == 0 || this.viewHeight == 0 || PhotoCropActivity.this.imageToCrop == null) {
                return;
            }
            float f = this.rectX - this.bitmapX;
            float f2 = this.bitmapWidth;
            float f3 = f / f2;
            float f4 = this.rectY - this.bitmapY;
            float f5 = this.bitmapHeight;
            float f6 = f4 / f5;
            float f7 = this.rectSizeX / f2;
            float f8 = this.rectSizeY / f5;
            float width = PhotoCropActivity.this.imageToCrop.getWidth();
            float height = PhotoCropActivity.this.imageToCrop.getHeight();
            int i = this.viewWidth;
            float f9 = i / width;
            int i2 = this.viewHeight;
            float f10 = i2 / height;
            if (f9 > f10) {
                this.bitmapHeight = i2;
                this.bitmapWidth = (int) Math.ceil(width * f10);
            } else {
                this.bitmapWidth = i;
                this.bitmapHeight = (int) Math.ceil(height * f9);
            }
            this.bitmapX = ((this.viewWidth - this.bitmapWidth) / 2) + AndroidUtilities.dp(14.0f);
            int iDp = ((this.viewHeight - this.bitmapHeight) / 2) + AndroidUtilities.dp(14.0f);
            this.bitmapY = iDp;
            if (this.rectX == -1.0f && this.rectY == -1.0f) {
                if (this.freeform) {
                    this.rectY = iDp;
                    this.rectX = this.bitmapX;
                    this.rectSizeX = this.bitmapWidth;
                    this.rectSizeY = this.bitmapHeight;
                } else {
                    int i3 = this.bitmapWidth;
                    int i4 = this.bitmapHeight;
                    if (i3 > i4) {
                        this.rectY = iDp;
                        this.rectX = ((this.viewWidth - i4) / 2) + AndroidUtilities.dp(14.0f);
                        float f11 = this.bitmapHeight;
                        this.rectSizeX = f11;
                        this.rectSizeY = f11;
                    } else {
                        this.rectX = this.bitmapX;
                        this.rectY = ((this.viewHeight - i3) / 2) + AndroidUtilities.dp(14.0f);
                        float f12 = this.bitmapWidth;
                        this.rectSizeX = f12;
                        this.rectSizeY = f12;
                    }
                }
            } else {
                float f13 = this.bitmapWidth;
                this.rectX = (f3 * f13) + this.bitmapX;
                float f14 = this.bitmapHeight;
                this.rectY = (f6 * f14) + iDp;
                this.rectSizeX = f7 * f13;
                this.rectSizeY = f8 * f14;
            }
            invalidate();
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            this.viewWidth = (i3 - i) - AndroidUtilities.dp(28.0f);
            this.viewHeight = (i4 - i2) - AndroidUtilities.dp(28.0f);
            updateBitmapSize();
        }

        public Bitmap getBitmap() {
            float f = this.rectX - this.bitmapX;
            float f2 = this.bitmapWidth;
            float f3 = (this.rectY - this.bitmapY) / this.bitmapHeight;
            float f4 = this.rectSizeX / f2;
            float f5 = this.rectSizeY / f2;
            int width = (int) ((f / f2) * PhotoCropActivity.this.imageToCrop.getWidth());
            int height = (int) (f3 * PhotoCropActivity.this.imageToCrop.getHeight());
            int width2 = (int) (f4 * PhotoCropActivity.this.imageToCrop.getWidth());
            int width3 = (int) (f5 * PhotoCropActivity.this.imageToCrop.getWidth());
            if (width < 0) {
                width = 0;
            }
            if (height < 0) {
                height = 0;
            }
            if (width + width2 > PhotoCropActivity.this.imageToCrop.getWidth()) {
                width2 = PhotoCropActivity.this.imageToCrop.getWidth() - width;
            }
            if (height + width3 > PhotoCropActivity.this.imageToCrop.getHeight()) {
                width3 = PhotoCropActivity.this.imageToCrop.getHeight() - height;
            }
            try {
                return Bitmaps.createBitmap(PhotoCropActivity.this.imageToCrop, width, height, width2, width3);
            } catch (Throwable th) {
                FileLog.e(th);
                System.gc();
                try {
                    return Bitmaps.createBitmap(PhotoCropActivity.this.imageToCrop, width, height, width2, width3);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return null;
                }
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (PhotoCropActivity.this.drawable != null) {
                try {
                    BitmapDrawable bitmapDrawable = PhotoCropActivity.this.drawable;
                    int i = this.bitmapX;
                    int i2 = this.bitmapY;
                    bitmapDrawable.setBounds(i, i2, this.bitmapWidth + i, this.bitmapHeight + i2);
                    PhotoCropActivity.this.drawable.draw(canvas);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            int i3 = this.bitmapX;
            canvas.drawRect(i3, this.bitmapY, i3 + this.bitmapWidth, this.rectY, this.halfPaint);
            float f = this.bitmapX;
            float f2 = this.rectY;
            canvas.drawRect(f, f2, this.rectX, f2 + this.rectSizeY, this.halfPaint);
            float f3 = this.rectX + this.rectSizeX;
            float f4 = this.rectY;
            canvas.drawRect(f3, f4, this.bitmapX + this.bitmapWidth, f4 + this.rectSizeY, this.halfPaint);
            int i4 = this.bitmapX;
            canvas.drawRect(i4, this.rectY + this.rectSizeY, i4 + this.bitmapWidth, this.bitmapY + this.bitmapHeight, this.halfPaint);
            float f5 = this.rectX;
            float f6 = this.rectY;
            canvas.drawRect(f5, f6, f5 + this.rectSizeX, f6 + this.rectSizeY, this.rectPaint);
            int iDp = AndroidUtilities.dp(1.0f);
            float f7 = iDp;
            float f8 = this.rectX + f7;
            float f9 = iDp * 3;
            canvas.drawRect(f8, this.rectY + f7, f8 + AndroidUtilities.dp(20.0f), this.rectY + f9, this.circlePaint);
            float f10 = this.rectX;
            float f11 = this.rectY + f7;
            canvas.drawRect(f10 + f7, f11, f10 + f9, f11 + AndroidUtilities.dp(20.0f), this.circlePaint);
            float fDp = ((this.rectX + this.rectSizeX) - f7) - AndroidUtilities.dp(20.0f);
            float f12 = this.rectY;
            canvas.drawRect(fDp, f12 + f7, (this.rectX + this.rectSizeX) - f7, f12 + f9, this.circlePaint);
            float f13 = this.rectX + this.rectSizeX;
            float f14 = this.rectY + f7;
            canvas.drawRect(f13 - f9, f14, f13 - f7, f14 + AndroidUtilities.dp(20.0f), this.circlePaint);
            canvas.drawRect(this.rectX + f7, ((this.rectY + this.rectSizeY) - f7) - AndroidUtilities.dp(20.0f), this.rectX + f9, (this.rectY + this.rectSizeY) - f7, this.circlePaint);
            float f15 = this.rectX + f7;
            canvas.drawRect(f15, (this.rectY + this.rectSizeY) - f9, f15 + AndroidUtilities.dp(20.0f), (this.rectY + this.rectSizeY) - f7, this.circlePaint);
            float fDp2 = ((this.rectX + this.rectSizeX) - f7) - AndroidUtilities.dp(20.0f);
            float f16 = this.rectY + this.rectSizeY;
            canvas.drawRect(fDp2, f16 - f9, (this.rectX + this.rectSizeX) - f7, f16 - f7, this.circlePaint);
            canvas.drawRect((this.rectX + this.rectSizeX) - f9, ((this.rectY + this.rectSizeY) - f7) - AndroidUtilities.dp(20.0f), (this.rectX + this.rectSizeX) - f7, (this.rectY + this.rectSizeY) - f7, this.circlePaint);
            for (int i5 = 1; i5 < 3; i5++) {
                float f17 = this.rectX;
                float f18 = i5;
                float f19 = (this.rectSizeX / 3.0f) * f18;
                float f20 = this.rectY;
                canvas.drawRect(f17 + f19, f20 + f7, f17 + f7 + f19, (f20 + this.rectSizeY) - f7, this.circlePaint);
                float f21 = this.rectX;
                float f22 = this.rectY + ((this.rectSizeY / 3.0f) * f18);
                canvas.drawRect(f21 + f7, f22, (f21 - f7) + this.rectSizeX, f22 + f7, this.circlePaint);
            }
        }
    }

    public PhotoCropActivity(Bundle bundle) {
        super(bundle);
        this.delegate = null;
        this.sameBitmap = false;
        this.doneButtonPressed = false;
    }

    @Override
    public boolean onFragmentCreate() {
        int iMax;
        if (this.imageToCrop == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !new File(string).exists()) {
                return false;
            }
            if (AndroidUtilities.isTablet()) {
                iMax = AndroidUtilities.dp(520.0f);
            } else {
                Point point = AndroidUtilities.displaySize;
                iMax = Math.max(point.x, point.y);
            }
            float f = iMax;
            Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(string, uri, f, f, true);
            this.imageToCrop = bitmapLoadBitmap;
            if (bitmapLoadBitmap == null) {
                return false;
            }
        }
        this.drawable = new BitmapDrawable(this.imageToCrop);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        Bitmap bitmap;
        super.onFragmentDestroy();
        if (this.bitmapKey != null && ImageLoader.getInstance().decrementUseCount(this.bitmapKey) && !ImageLoader.getInstance().isInMemCache(this.bitmapKey, false)) {
            this.bitmapKey = null;
        }
        if (this.bitmapKey == null && (bitmap = this.imageToCrop) != null && !this.sameBitmap) {
            bitmap.recycle();
            this.imageToCrop = null;
        }
        this.drawable = null;
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.setItemsBackgroundColor(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.setItemsColor(-1, false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.CropImage));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    PhotoCropActivity.this.finishFragment();
                    return;
                }
                if (i == 1) {
                    if (PhotoCropActivity.this.delegate != null && !PhotoCropActivity.this.doneButtonPressed) {
                        Bitmap bitmap = PhotoCropActivity.this.view.getBitmap();
                        if (bitmap == PhotoCropActivity.this.imageToCrop) {
                            PhotoCropActivity.this.sameBitmap = true;
                        }
                        PhotoCropActivity.this.delegate.didFinishEdit(bitmap);
                        PhotoCropActivity.this.doneButtonPressed = true;
                    }
                    PhotoCropActivity.this.finishFragment();
                }
            }
        });
        this.actionBar.createMenu().addItemWithWidth(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
        PhotoCropView photoCropView = new PhotoCropView(context);
        this.view = photoCropView;
        this.fragmentView = photoCropView;
        photoCropView.freeform = getArguments().getBoolean("freeform", false);
        this.fragmentView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return this.fragmentView;
    }

    public void setDelegate(PhotoEditActivityDelegate photoEditActivityDelegate) {
        this.delegate = photoEditActivityDelegate;
    }
}
