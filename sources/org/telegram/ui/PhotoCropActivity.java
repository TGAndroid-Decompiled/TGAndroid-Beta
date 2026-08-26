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
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import java.io.FileNotFoundException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;

public class PhotoCropActivity extends BaseFragment {
    private static final int done_button = 1;
    private String bitmapKey;
    private PhotoEditActivityDelegate delegate;
    private boolean doneButtonPressed;
    private BitmapDrawable drawable;
    private Bitmap imageToCrop;
    private boolean sameBitmap;
    private PhotoCropView view;

    public class PhotoCropView extends FrameLayout {
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
            setOnTouchListener(new TodoItemMenu$$ExternalSyntheticLambda4(this, 1));
        }

        public boolean lambda$init$0(View view, MotionEvent motionEvent) {
            int i;
            float f;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int iDp = AndroidUtilities.dp(14.0f);
            if (motionEvent.getAction() == 0) {
                float f2 = this.rectX;
                float f3 = iDp;
                float f4 = f2 - f3;
                if (f4 >= x || f2 + f3 <= x) {
                    float f5 = this.rectSizeX;
                    f = f4 + f5;
                    if (f >= x && f2 + f3 + f5 > x) {
                        float f6 = this.rectY;
                        if (f6 - f3 < y && f6 + f3 > y) {
                            this.draggingState = 2;
                        } else if (f4 >= x) {
                            if (f >= x) {
                                if (f2 < x) {
                                    this.draggingState = 0;
                                } else {
                                    this.draggingState = 0;
                                }
                            } else if (f2 < x) {
                                this.draggingState = 0;
                            } else {
                                this.draggingState = 0;
                            }
                        } else if (f >= x) {
                            if (f2 < x) {
                                this.draggingState = 0;
                            } else {
                                this.draggingState = 0;
                            }
                        } else if (f2 < x) {
                            this.draggingState = 0;
                        } else {
                            this.draggingState = 0;
                        }
                    } else if (f4 >= x && f2 + f3 > x) {
                        float f7 = this.rectY;
                        float f8 = this.rectSizeY;
                        if ((f7 - f3) + f8 < y && f7 + f3 + f8 > y) {
                            this.draggingState = 3;
                        } else if (f >= x) {
                            if (f2 < x) {
                                this.draggingState = 0;
                            } else {
                                this.draggingState = 0;
                            }
                        } else if (f2 < x) {
                            this.draggingState = 0;
                        } else {
                            this.draggingState = 0;
                        }
                    } else if (f >= x && f2 + f3 + f5 > x) {
                        float f9 = this.rectY;
                        float f10 = this.rectSizeY;
                        if ((f9 - f3) + f10 < y && f9 + f3 + f10 > y) {
                            this.draggingState = 4;
                        } else if (f2 < x) {
                            this.draggingState = 0;
                        } else {
                            this.draggingState = 0;
                        }
                    } else if (f2 < x || f2 + f5 <= x) {
                        this.draggingState = 0;
                    } else {
                        float f11 = this.rectY;
                        if (f11 >= y || f11 + this.rectSizeY <= y) {
                            this.draggingState = 0;
                        } else {
                            this.draggingState = 5;
                        }
                    }
                } else {
                    float f12 = this.rectY;
                    if (f12 - f3 >= y || f12 + f3 <= y) {
                        float f13 = this.rectSizeX;
                        f = f4 + f13;
                        if (f >= x) {
                            if (f4 >= x) {
                                if (f >= x) {
                                    if (f2 < x) {
                                        this.draggingState = 0;
                                    } else {
                                        this.draggingState = 0;
                                    }
                                } else if (f2 < x) {
                                    this.draggingState = 0;
                                } else {
                                    this.draggingState = 0;
                                }
                            } else if (f >= x) {
                                if (f2 < x) {
                                    this.draggingState = 0;
                                } else {
                                    this.draggingState = 0;
                                }
                            } else if (f2 < x) {
                                this.draggingState = 0;
                            } else {
                                this.draggingState = 0;
                            }
                        } else if (f4 >= x) {
                            if (f >= x) {
                                if (f2 < x) {
                                    this.draggingState = 0;
                                } else {
                                    this.draggingState = 0;
                                }
                            } else if (f2 < x) {
                                this.draggingState = 0;
                            } else {
                                this.draggingState = 0;
                            }
                        } else if (f >= x) {
                            if (f2 < x) {
                                this.draggingState = 0;
                            } else {
                                this.draggingState = 0;
                            }
                        } else if (f2 < x) {
                            this.draggingState = 0;
                        } else {
                            this.draggingState = 0;
                        }
                    } else {
                        this.draggingState = 1;
                    }
                }
                if (this.draggingState != 0) {
                    requestDisallowInterceptTouchEvent(true);
                }
                this.oldX = x;
                this.oldY = y;
            } else if (motionEvent.getAction() == 1) {
                this.draggingState = 0;
            } else if (motionEvent.getAction() == 2 && (i = this.draggingState) != 0) {
                float f14 = x - this.oldX;
                float f15 = y - this.oldY;
                if (i == 5) {
                    float f16 = this.rectX + f14;
                    this.rectX = f16;
                    float f17 = this.rectY + f15;
                    this.rectY = f17;
                    int i2 = this.bitmapX;
                    float f18 = i2;
                    if (f16 < f18) {
                        this.rectX = f18;
                    } else {
                        float f19 = this.rectSizeX;
                        float f20 = f16 + f19;
                        float f21 = i2 + this.bitmapWidth;
                        if (f20 > f21) {
                            this.rectX = f21 - f19;
                        }
                    }
                    int i3 = this.bitmapY;
                    float f22 = i3;
                    if (f17 < f22) {
                        this.rectY = f22;
                    } else {
                        float f23 = this.rectSizeY;
                        float f24 = f17 + f23;
                        float f25 = i3 + this.bitmapHeight;
                        if (f24 > f25) {
                            this.rectY = f25 - f23;
                        }
                    }
                } else if (i == 1) {
                    float f26 = this.rectSizeX;
                    if (f26 - f14 < 160.0f) {
                        f14 = f26 - 160.0f;
                    }
                    float f27 = this.rectX;
                    float f28 = f27 + f14;
                    float f29 = this.bitmapX;
                    if (f28 < f29) {
                        f14 = f29 - f27;
                    }
                    if (this.freeform) {
                        float f30 = this.rectSizeY;
                        if (f30 - f15 < 160.0f) {
                            f15 = f30 - 160.0f;
                        }
                        float f31 = this.rectY;
                        float f32 = f31 + f15;
                        float f33 = this.bitmapY;
                        if (f32 < f33) {
                            f15 = f33 - f31;
                        }
                        this.rectX = f27 + f14;
                        this.rectY = f31 + f15;
                        this.rectSizeX = f26 - f14;
                        this.rectSizeY = f30 - f15;
                    } else {
                        float f34 = this.rectY;
                        float f35 = f34 + f14;
                        float f36 = this.bitmapY;
                        if (f35 < f36) {
                            f14 = f36 - f34;
                        }
                        this.rectX = f27 + f14;
                        this.rectY = f34 + f14;
                        this.rectSizeX = f26 - f14;
                        this.rectSizeY -= f14;
                    }
                } else if (i == 2) {
                    float f37 = this.rectSizeX;
                    if (f37 + f14 < 160.0f) {
                        f14 = -(f37 - 160.0f);
                    }
                    float f38 = this.rectX;
                    float f39 = f38 + f37 + f14;
                    float f40 = this.bitmapX + this.bitmapWidth;
                    if (f39 > f40) {
                        f14 = (f40 - f38) - f37;
                    }
                    if (this.freeform) {
                        float f41 = this.rectSizeY;
                        if (f41 - f15 < 160.0f) {
                            f15 = f41 - 160.0f;
                        }
                        float f42 = this.rectY;
                        float f43 = f42 + f15;
                        float f44 = this.bitmapY;
                        if (f43 < f44) {
                            f15 = f44 - f42;
                        }
                        this.rectY = f42 + f15;
                        this.rectSizeX = f37 + f14;
                        this.rectSizeY = f41 - f15;
                    } else {
                        float f45 = this.rectY;
                        float f46 = f45 - f14;
                        float f47 = this.bitmapY;
                        if (f46 < f47) {
                            f14 = f45 - f47;
                        }
                        this.rectY = f45 - f14;
                        this.rectSizeX = f37 + f14;
                        this.rectSizeY += f14;
                    }
                } else if (i == 3) {
                    float f48 = this.rectSizeX;
                    if (f48 - f14 < 160.0f) {
                        f14 = f48 - 160.0f;
                    }
                    float f49 = this.rectX;
                    float f50 = f49 + f14;
                    float f51 = this.bitmapX;
                    if (f50 < f51) {
                        f14 = f51 - f49;
                    }
                    if (this.freeform) {
                        float f52 = this.rectY;
                        float f53 = this.rectSizeY;
                        float f54 = f52 + f53 + f15;
                        float f55 = this.bitmapY + this.bitmapHeight;
                        if (f54 > f55) {
                            f15 = (f55 - f52) - f53;
                        }
                        this.rectX = f49 + f14;
                        this.rectSizeX = f48 - f14;
                        float f56 = f53 + f15;
                        this.rectSizeY = f56;
                        if (f56 < 160.0f) {
                            this.rectSizeY = 160.0f;
                        }
                    } else {
                        float f57 = this.rectY + f48;
                        float f58 = f57 - f14;
                        int i4 = this.bitmapY;
                        int i5 = this.bitmapHeight;
                        if (f58 > i4 + i5) {
                            f14 = (f57 - i4) - i5;
                        }
                        this.rectX = f49 + f14;
                        this.rectSizeX = f48 - f14;
                        this.rectSizeY -= f14;
                    }
                } else if (i == 4) {
                    float f59 = this.rectX;
                    float f60 = this.rectSizeX;
                    float f61 = f59 + f60 + f14;
                    float f62 = this.bitmapX + this.bitmapWidth;
                    if (f61 > f62) {
                        f14 = (f62 - f59) - f60;
                    }
                    if (this.freeform) {
                        float f63 = this.rectY;
                        float f64 = this.rectSizeY;
                        float f65 = f63 + f64 + f15;
                        float f66 = this.bitmapY + this.bitmapHeight;
                        if (f65 > f66) {
                            f15 = (f66 - f63) - f64;
                        }
                        this.rectSizeX = f60 + f14;
                        this.rectSizeY = f64 + f15;
                    } else {
                        float f67 = this.rectY;
                        float f68 = f67 + f60 + f14;
                        float f69 = this.bitmapY + this.bitmapHeight;
                        if (f68 > f69) {
                            f14 = (f69 - f67) - f60;
                        }
                        this.rectSizeX = f60 + f14;
                        this.rectSizeY += f14;
                    }
                    if (this.rectSizeX < 160.0f) {
                        this.rectSizeX = 160.0f;
                    }
                    if (this.rectSizeY < 160.0f) {
                        this.rectSizeY = 160.0f;
                    }
                }
                this.oldX = x;
                this.oldY = y;
                invalidate();
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
            this.bitmapX = AndroidUtilities.dp(14.0f) + ((this.viewWidth - this.bitmapWidth) / 2);
            int iDp = AndroidUtilities.dp(14.0f) + ((this.viewHeight - this.bitmapHeight) / 2);
            this.bitmapY = iDp;
            if (this.rectX != -1.0f || this.rectY != -1.0f) {
                float f11 = this.bitmapWidth;
                this.rectX = (f3 * f11) + this.bitmapX;
                float f12 = this.bitmapHeight;
                this.rectY = (f6 * f12) + iDp;
                this.rectSizeX = f7 * f11;
                this.rectSizeY = f8 * f12;
            } else if (this.freeform) {
                this.rectY = iDp;
                this.rectX = this.bitmapX;
                this.rectSizeX = this.bitmapWidth;
                this.rectSizeY = this.bitmapHeight;
            } else {
                int i3 = this.bitmapWidth;
                int i4 = this.bitmapHeight;
                if (i3 > i4) {
                    this.rectY = iDp;
                    this.rectX = AndroidUtilities.dp(14.0f) + ((this.viewWidth - i4) / 2);
                    float f13 = this.bitmapHeight;
                    this.rectSizeX = f13;
                    this.rectSizeY = f13;
                } else {
                    this.rectX = this.bitmapX;
                    this.rectY = AndroidUtilities.dp(14.0f) + ((this.viewHeight - i3) / 2);
                    float f14 = this.bitmapWidth;
                    this.rectSizeX = f14;
                    this.rectSizeY = f14;
                }
            }
            invalidate();
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
        public void onDraw(Canvas canvas) {
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
                float f18 = this.rectSizeX;
                float f19 = i5;
                float f20 = this.rectY;
                canvas.drawRect(((f18 / 3.0f) * f19) + f17, f20 + f7, zzir.m(f18, 3.0f, f19, f17 + f7), (f20 + this.rectSizeY) - f7, this.circlePaint);
                float f21 = this.rectX;
                float f22 = this.rectY;
                float f23 = this.rectSizeY;
                canvas.drawRect(f21 + f7, zzir.m(f23, 3.0f, f19, f22), this.rectSizeX + (f21 - f7), ((f23 / 3.0f) * f19) + f22 + f7, this.circlePaint);
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            this.viewWidth = (i3 - i) - AndroidUtilities.dp(28.0f);
            this.viewHeight = (i4 - i2) - AndroidUtilities.dp(28.0f);
            updateBitmapSize();
        }
    }

    public interface PhotoEditActivityDelegate {
        void didFinishEdit(Bitmap bitmap);
    }

    public PhotoCropActivity(Bundle bundle) {
        super(bundle);
        this.delegate = null;
        this.sameBitmap = false;
        this.doneButtonPressed = false;
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
        this.actionBar.createMenu().addItemWithWidth(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        PhotoCropView photoCropView = new PhotoCropView(context);
        this.view = photoCropView;
        this.fragmentView = photoCropView;
        photoCropView.freeform = getArguments().getBoolean("freeform", false);
        this.fragmentView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return this.fragmentView;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onFragmentCreate() throws FileNotFoundException {
        int iMax;
        if (this.imageToCrop == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !Theme.ResourcesProvider.CC.m(string)) {
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

    public void setDelegate(PhotoEditActivityDelegate photoEditActivityDelegate) {
        this.delegate = photoEditActivityDelegate;
    }
}
