package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
public class cv0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public MessageObject D;
    public yu0 E;
    public zu0 F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public int M;
    public int N;
    public float O;
    public float P;
    public final float[] Q;
    public boolean R;
    public ColorMatrixColorFilter S;
    public final ViewGroup f38534a;
    public final ViewGroup f38535b;
    public final boolean f38536c;
    public bv0 d;
    public View e;
    public ImageReceiver f38537f;
    public ImageReceiver f38538g;
    public ImageReceiver h;
    public boolean f38539i;
    public final xh.g f38540j;
    public xh.f f38541k;
    public final Path f38542l;
    public final float[] f38543m;
    public boolean f38544n;
    public float f38545o;
    public float f38546p;
    public float f38547q;
    public float f38548r;
    public float f38549s;
    public float f38550t;
    public float f38551u;
    public float v;
    public float f38552w;
    public float f38553x;
    public float f38554y;
    public float f38555z;

    public cv0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f38538g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f38540j = new xh.g();
        this.f38542l = new Path();
        this.f38543m = new float[8];
        this.Q = new float[2];
        this.f38534a = viewGroup;
        this.f38535b = viewGroup2;
        this.f38536c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, MessageObject messageObject, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        if (!j(viewGroup, imageReceiver)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.L) {
                int i15 = -1;
                int i16 = -1;
                for (int i17 = 0; i17 < motionEvent.getPointerCount(); i17++) {
                    if (this.M == motionEvent.getPointerId(i17)) {
                        i15 = i17;
                    }
                    if (this.N == motionEvent.getPointerId(i17)) {
                        i16 = i17;
                    }
                }
                if (i15 != -1 && i16 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15))) / this.I;
                    this.O = hypot;
                    if (hypot > 1.005f && !this.f38544n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15));
                        float x9 = (motionEvent.getX(i16) + motionEvent.getX(i15)) / 2.0f;
                        this.f38549s = x9;
                        this.G = x9;
                        float y3 = (motionEvent.getY(i16) + motionEvent.getY(i15)) / 2.0f;
                        this.f38550t = y3;
                        this.H = y3;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.e = viewGroup;
                        this.D = messageObject;
                        bv0 bv0Var = this.d;
                        ViewGroup viewGroup2 = this.f38534a;
                        boolean z11 = this.f38536c;
                        if (bv0Var == null && !z11) {
                            i13 = -1;
                            bv0 bv0Var2 = new bv0(this, viewGroup2.getContext());
                            this.d = bv0Var2;
                            bv0Var2.setFocusable(false);
                            this.d.setFocusableInTouchMode(false);
                            this.d.setEnabled(false);
                        } else {
                            i13 = -1;
                        }
                        if (this.f38538g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver();
                            this.f38538g = imageReceiver2;
                            imageReceiver2.setCrossfadeAlpha((byte) 2);
                            this.f38538g.setCrossfadeWithOldImage(false);
                            this.f38538g.onAttachedToWindow();
                            ImageReceiver imageReceiver3 = new ImageReceiver();
                            this.h = imageReceiver3;
                            imageReceiver3.setCrossfadeAlpha((byte) 2);
                            this.h.setCrossfadeWithOldImage(false);
                            this.h.onAttachedToWindow();
                        }
                        this.f38544n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z11) {
                            viewGroup2.addView(this.d);
                            if (messageObject != null && messageObject.hasMediaSpoilers() && !messageObject.isMediaSpoilersRevealed) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f38539i = z10;
                            if (z10 && this.f38541k == null) {
                                xh.f e = xh.f.e(this.d);
                                this.f38541k = e;
                                if (e != null) {
                                    e.f51857k.put(this.d, Integer.valueOf(i10));
                                }
                            }
                            ImageLocation imageLocation = null;
                            if (this.h.getBitmap() != null) {
                                this.h.getBitmap().recycle();
                                this.h.setImageBitmap((Bitmap) null);
                            }
                            if (imageReceiver.getBitmap() != null && !imageReceiver.getBitmap().isRecycled() && this.f38539i) {
                                this.h.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
                                ImageReceiver imageReceiver4 = this.h;
                                if (this.S == null) {
                                    ColorMatrix colorMatrix = new ColorMatrix();
                                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                                    this.S = new ColorMatrixColorFilter(colorMatrix);
                                }
                                imageReceiver4.setColorFilter(this.S);
                            } else {
                                this.h.setColorFilter(null);
                            }
                            if (messageObject == null || !messageObject.isPhoto()) {
                                i14 = i15;
                                i11 = i16;
                            } else {
                                int[] iArr = new int[1];
                                TLRPC.Message message = messageObject.messageOwner;
                                if (message instanceof TLRPC.TL_messageService) {
                                    if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                                        if (closestPhotoSizeWithSize != null) {
                                            int i18 = closestPhotoSizeWithSize.size;
                                            iArr[0] = i18;
                                            if (i18 == 0) {
                                                iArr[0] = i13;
                                            }
                                            imageLocation = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject);
                                        } else {
                                            iArr[0] = i13;
                                        }
                                    }
                                } else {
                                    TLRPC.MessageMedia messageMedia = message.media;
                                    if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null) || ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia.webpage != null)) {
                                        if (messageObject.isGif()) {
                                            imageLocation = ImageLocation.getForDocument(messageObject.getDocument());
                                        } else {
                                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize(), false, null, true);
                                            if (closestPhotoSizeWithSize2 != null) {
                                                int i19 = closestPhotoSizeWithSize2.size;
                                                iArr[0] = i19;
                                                if (i19 == 0) {
                                                    iArr[0] = i13;
                                                }
                                                imageLocation = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                            } else {
                                                iArr[0] = i13;
                                            }
                                        }
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                        imageLocation = ImageLocation.getForWebFile(WebFile.createWithWebDocument(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                    } else if (messageObject.getDocument() != null) {
                                        TLRPC.Document document = messageObject.getDocument();
                                        if (MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                                            int i20 = closestPhotoSizeWithSize3.size;
                                            iArr[0] = i20;
                                            if (i20 == 0) {
                                                iArr[0] = i13;
                                            }
                                            imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize3, document);
                                        }
                                    }
                                }
                                if (imageLocation != null) {
                                    i11 = i16;
                                    i14 = i15;
                                    this.f38538g.setImage(imageLocation, null, null, null, null, iArr[0], null, messageObject, messageObject.isWebpage() ? 1 : 0);
                                    this.f38538g.setCrossfadeAlpha((byte) 2);
                                } else {
                                    i14 = i15;
                                    i11 = i16;
                                }
                                i();
                            }
                            this.f38551u = imageReceiver.getImageX();
                            this.v = imageReceiver.getImageY() + viewGroup.getPaddingTop();
                            this.f38552w = imageReceiver.getImageHeight();
                            this.f38553x = imageReceiver.getImageWidth();
                            this.f38554y = imageReceiver.getBitmapHeight();
                            float bitmapWidth = imageReceiver.getBitmapWidth();
                            this.f38555z = bitmapWidth;
                            float f7 = this.f38554y;
                            float f10 = f7 / bitmapWidth;
                            float f11 = this.f38552w;
                            float f12 = this.f38553x;
                            float f13 = f11 / f12;
                            if (f10 != f13) {
                                if (f10 < f13) {
                                    this.f38555z = (bitmapWidth / f7) * f11;
                                    this.f38554y = f11;
                                } else {
                                    this.f38554y = f10 * f12;
                                    this.f38555z = f12;
                                }
                            } else {
                                this.f38554y = f11;
                                this.f38555z = f12;
                            }
                            if (messageObject != null && messageObject.isVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                                this.R = true;
                                MediaController mediaController = MediaController.getInstance();
                                bv0 bv0Var3 = this.d;
                                mediaController.setTextureView(bv0Var3.f38176b, bv0Var3.f38177c, bv0Var3.f38175a, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.f38175a.getLayoutParams();
                                this.d.f38175a.setTag(R.id.parent_tag, imageReceiver);
                                if (layoutParams.width != imageReceiver.getImageWidth() || layoutParams.height != imageReceiver.getImageHeight()) {
                                    this.d.f38177c.setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.getImageWidth();
                                    layoutParams.height = (int) imageReceiver.getImageHeight();
                                    this.d.f38175a.setLayoutParams(layoutParams);
                                }
                                this.d.f38176b.setScaleX(1.0f);
                                this.d.f38176b.setScaleY(1.0f);
                                yu0 yu0Var = this.E;
                                if (yu0Var != null) {
                                    this.d.d.setImageBitmap(yu0Var.f0().getBitmap((int) this.f38555z, (int) this.f38554y));
                                    this.d.d.s((int) this.f38555z, (int) this.f38554y);
                                    this.d.d.getImageReceiver().setRoundRadius(imageReceiver.getRoundRadius(true));
                                }
                                this.d.f38175a.setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver();
                                this.f38537f = imageReceiver5;
                                imageReceiver5.onAttachedToWindow();
                                Drawable drawable = imageReceiver.getDrawable();
                                this.f38537f.setImageBitmap(drawable);
                                if (drawable instanceof org.telegram.ui.Components.g6) {
                                    org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) drawable;
                                    g6Var.f(this.d);
                                    g6Var.R = true;
                                }
                                this.f38537f.setImageCoords(this.f38551u, this.v, this.f38553x, this.f38552w);
                                this.f38537f.setAspectFit(imageReceiver.isAspectFit());
                                this.f38537f.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f38538g.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f38538g.setAspectFit(imageReceiver.isAspectFit());
                                this.d.f38175a.setVisibility(8);
                            }
                        } else {
                            i14 = i15;
                            i11 = i16;
                        }
                        yu0 yu0Var2 = this.E;
                        if (yu0Var2 != null) {
                            yu0Var2.B0(messageObject);
                        }
                        this.P = 0.0f;
                        i12 = i14;
                    } else {
                        i11 = i16;
                        i12 = i15;
                    }
                    float x10 = motionEvent.getX(i12);
                    int i21 = i11;
                    float y10 = motionEvent.getY(i12);
                    float x11 = this.G - ((motionEvent.getX(i21) + x10) / 2.0f);
                    float y11 = this.H - ((motionEvent.getY(i21) + y10) / 2.0f);
                    float f14 = -x11;
                    float f15 = this.O;
                    this.J = f14 / f15;
                    this.K = (-y11) / f15;
                    e();
                } else {
                    this.L = false;
                    viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                    d();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.M == motionEvent.getPointerId(0) && this.N == motionEvent.getPointerId(1)) || (this.M == motionEvent.getPointerId(1) && this.N == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.L) {
                this.L = false;
                if (viewGroup != null && viewGroup.getParent() != null) {
                    viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                }
                d();
            }
        } else if (!this.L && motionEvent.getPointerCount() == 2) {
            this.I = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
            float x12 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.f38549s = x12;
            this.G = x12;
            float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f38550t = y12;
            this.H = y12;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f38544n) {
            yu0 yu0Var = this.E;
            if (yu0Var != null) {
                yu0Var.E(this.D);
            }
            this.f38544n = false;
        }
        bv0 bv0Var = this.d;
        if (bv0Var != null && bv0Var.getParent() != null) {
            this.f38534a.removeView(this.d);
            this.d.d.getImageReceiver().clearImage();
            xh.f fVar = this.f38541k;
            if (fVar != null) {
                fVar.b(this.d);
                this.f38541k = null;
            }
            ImageReceiver imageReceiver = this.f38537f;
            if (imageReceiver != null) {
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof org.telegram.ui.Components.g6) {
                    ((org.telegram.ui.Components.g6) drawable).w(this.d);
                }
            }
        }
        View view = this.e;
        if (view != null) {
            view.invalidate();
            this.e = null;
        }
        ImageReceiver imageReceiver2 = this.f38537f;
        if (imageReceiver2 != null) {
            imageReceiver2.onDetachedFromWindow();
            this.f38537f.clearImage();
            this.f38537f = null;
        }
        ImageReceiver imageReceiver3 = this.f38538g;
        if (imageReceiver3 != null) {
            imageReceiver3.onDetachedFromWindow();
            this.f38538g.clearImage();
            this.f38538g = null;
        }
        ImageReceiver imageReceiver4 = this.h;
        if (imageReceiver4 != null) {
            imageReceiver4.onDetachedFromWindow();
            this.h.clearImage();
            this.h = null;
        }
        this.D = null;
    }

    public final void d() {
        if (this.C == null && this.f38544n) {
            if (!this.f38536c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 24));
            this.C.addListener(new i50(this, 19));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.ds.f27586f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f38536c && (view = this.e) != null) {
            view.invalidate();
        }
        bv0 bv0Var = this.d;
        if (bv0Var != null) {
            bv0Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f38544n && view == this.e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.e != null) {
            motionEvent.offsetLocation(-this.f38547q, -this.f38548r);
            return this.e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void h(ph phVar) {
        this.F = phVar;
    }

    public final boolean i() {
        float f7 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (View view = this.e; view != this.f38534a; view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            f10 += view.getLeft();
            f11 += view.getTop();
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        float f12 = 0.0f;
        for (View view2 = this.e; view2 != this.f38535b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f7 += view2.getLeft();
            f12 += view2.getTop();
        }
        this.f38547q = f7;
        this.f38548r = f12;
        this.f38545o = f10;
        this.f38546p = f11;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f38536c) {
            if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.g6) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.g6) imageReceiver.getDrawable()).f28460u0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.isWaitingForLoad()) {
                    return false;
                }
                return true;
            }
            return imageReceiver.hasNotThumbOrOnlyStaticThumb();
        }
        return true;
    }

    public cv0() {
        this.f38538g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f38540j = new xh.g();
        this.f38542l = new Path();
        this.f38543m = new float[8];
        this.Q = new float[2];
        this.f38534a = null;
        this.f38535b = null;
        this.f38536c = true;
    }

    public void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
    }
}
