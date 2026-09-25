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
public class hv0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public MessageObject D;
    public dv0 E;
    public ev0 F;
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
    public final ViewGroup f34296a;
    public final ViewGroup f34297b;
    public final boolean f34298c;
    public gv0 d;
    public View e;
    public ImageReceiver f34299f;
    public ImageReceiver f34300g;
    public ImageReceiver h;
    public boolean f34301i;
    public final vh.g f34302j;
    public vh.f f34303k;
    public final Path f34304l;
    public final float[] f34305m;
    public boolean f34306n;
    public float f34307o;
    public float f34308p;
    public float f34309q;
    public float f34310r;
    public float f34311s;
    public float f34312t;
    public float f34313u;
    public float v;
    public float f34314w;
    public float f34315x;
    public float f34316y;
    public float f34317z;

    public hv0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f34300g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f34302j = new vh.g();
        this.f34304l = new Path();
        this.f34305m = new float[8];
        this.Q = new float[2];
        this.f34296a = viewGroup;
        this.f34297b = viewGroup2;
        this.f34298c = false;
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
                    if (hypot > 1.005f && !this.f34306n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15));
                        float x10 = (motionEvent.getX(i16) + motionEvent.getX(i15)) / 2.0f;
                        this.f34311s = x10;
                        this.G = x10;
                        float y3 = (motionEvent.getY(i16) + motionEvent.getY(i15)) / 2.0f;
                        this.f34312t = y3;
                        this.H = y3;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.e = viewGroup;
                        this.D = messageObject;
                        gv0 gv0Var = this.d;
                        ViewGroup viewGroup2 = this.f34296a;
                        boolean z11 = this.f34298c;
                        if (gv0Var == null && !z11) {
                            i13 = -1;
                            gv0 gv0Var2 = new gv0(this, viewGroup2.getContext());
                            this.d = gv0Var2;
                            gv0Var2.setFocusable(false);
                            this.d.setFocusableInTouchMode(false);
                            this.d.setEnabled(false);
                        } else {
                            i13 = -1;
                        }
                        if (this.f34300g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver();
                            this.f34300g = imageReceiver2;
                            imageReceiver2.setCrossfadeAlpha((byte) 2);
                            this.f34300g.setCrossfadeWithOldImage(false);
                            this.f34300g.onAttachedToWindow();
                            ImageReceiver imageReceiver3 = new ImageReceiver();
                            this.h = imageReceiver3;
                            imageReceiver3.setCrossfadeAlpha((byte) 2);
                            this.h.setCrossfadeWithOldImage(false);
                            this.h.onAttachedToWindow();
                        }
                        this.f34306n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z11) {
                            viewGroup2.addView(this.d);
                            if (messageObject != null && messageObject.hasMediaSpoilers() && !messageObject.isMediaSpoilersRevealed) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f34301i = z10;
                            if (z10 && this.f34303k == null) {
                                vh.f e = vh.f.e(this.d);
                                this.f34303k = e;
                                if (e != null) {
                                    e.f44682k.put(this.d, Integer.valueOf(i10));
                                }
                            }
                            ImageLocation imageLocation = null;
                            if (this.h.getBitmap() != null) {
                                this.h.getBitmap().recycle();
                                this.h.setImageBitmap((Bitmap) null);
                            }
                            if (imageReceiver.getBitmap() != null && !imageReceiver.getBitmap().isRecycled() && this.f34301i) {
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
                                    this.f34300g.setImage(imageLocation, null, null, null, null, iArr[0], null, messageObject, messageObject.isWebpage() ? 1 : 0);
                                    this.f34300g.setCrossfadeAlpha((byte) 2);
                                } else {
                                    i14 = i15;
                                    i11 = i16;
                                }
                                i();
                            }
                            this.f34313u = imageReceiver.getImageX();
                            this.v = imageReceiver.getImageY() + viewGroup.getPaddingTop();
                            this.f34314w = imageReceiver.getImageHeight();
                            this.f34315x = imageReceiver.getImageWidth();
                            this.f34316y = imageReceiver.getBitmapHeight();
                            float bitmapWidth = imageReceiver.getBitmapWidth();
                            this.f34317z = bitmapWidth;
                            float f7 = this.f34316y;
                            float f10 = f7 / bitmapWidth;
                            float f11 = this.f34314w;
                            float f12 = this.f34315x;
                            float f13 = f11 / f12;
                            if (f10 != f13) {
                                if (f10 < f13) {
                                    this.f34317z = (bitmapWidth / f7) * f11;
                                    this.f34316y = f11;
                                } else {
                                    this.f34316y = f10 * f12;
                                    this.f34317z = f12;
                                }
                            } else {
                                this.f34316y = f11;
                                this.f34317z = f12;
                            }
                            if (messageObject != null && messageObject.isVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                                this.R = true;
                                MediaController mediaController = MediaController.getInstance();
                                gv0 gv0Var3 = this.d;
                                mediaController.setTextureView(gv0Var3.f34068b, gv0Var3.f34069c, gv0Var3.f34067a, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.f34067a.getLayoutParams();
                                this.d.f34067a.setTag(R.id.parent_tag, imageReceiver);
                                if (layoutParams.width != imageReceiver.getImageWidth() || layoutParams.height != imageReceiver.getImageHeight()) {
                                    this.d.f34069c.setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.getImageWidth();
                                    layoutParams.height = (int) imageReceiver.getImageHeight();
                                    this.d.f34067a.setLayoutParams(layoutParams);
                                }
                                this.d.f34068b.setScaleX(1.0f);
                                this.d.f34068b.setScaleY(1.0f);
                                dv0 dv0Var = this.E;
                                if (dv0Var != null) {
                                    this.d.d.setImageBitmap(dv0Var.j0().getBitmap((int) this.f34317z, (int) this.f34316y));
                                    this.d.d.s((int) this.f34317z, (int) this.f34316y);
                                    this.d.d.getImageReceiver().setRoundRadius(imageReceiver.getRoundRadius(true));
                                }
                                this.d.f34067a.setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver();
                                this.f34299f = imageReceiver5;
                                imageReceiver5.onAttachedToWindow();
                                Drawable drawable = imageReceiver.getDrawable();
                                this.f34299f.setImageBitmap(drawable);
                                if (drawable instanceof org.telegram.ui.Components.d6) {
                                    org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) drawable;
                                    d6Var.f(this.d);
                                    d6Var.R = true;
                                }
                                this.f34299f.setImageCoords(this.f34313u, this.v, this.f34315x, this.f34314w);
                                this.f34299f.setAspectFit(imageReceiver.isAspectFit());
                                this.f34299f.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f34300g.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f34300g.setAspectFit(imageReceiver.isAspectFit());
                                this.d.f34067a.setVisibility(8);
                            }
                        } else {
                            i14 = i15;
                            i11 = i16;
                        }
                        dv0 dv0Var2 = this.E;
                        if (dv0Var2 != null) {
                            dv0Var2.E0(messageObject);
                        }
                        this.P = 0.0f;
                        i12 = i14;
                    } else {
                        i11 = i16;
                        i12 = i15;
                    }
                    float x11 = motionEvent.getX(i12);
                    int i21 = i11;
                    float y10 = motionEvent.getY(i12);
                    float x12 = this.G - ((motionEvent.getX(i21) + x11) / 2.0f);
                    float y11 = this.H - ((motionEvent.getY(i21) + y10) / 2.0f);
                    float f14 = -x12;
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
            float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.f34311s = x13;
            this.G = x13;
            float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f34312t = y12;
            this.H = y12;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f34306n) {
            dv0 dv0Var = this.E;
            if (dv0Var != null) {
                dv0Var.H(this.D);
            }
            this.f34306n = false;
        }
        gv0 gv0Var = this.d;
        if (gv0Var != null && gv0Var.getParent() != null) {
            this.f34296a.removeView(this.d);
            this.d.d.getImageReceiver().clearImage();
            vh.f fVar = this.f34303k;
            if (fVar != null) {
                fVar.b(this.d);
                this.f34303k = null;
            }
            ImageReceiver imageReceiver = this.f34299f;
            if (imageReceiver != null) {
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof org.telegram.ui.Components.d6) {
                    ((org.telegram.ui.Components.d6) drawable).w(this.d);
                }
            }
        }
        View view = this.e;
        if (view != null) {
            view.invalidate();
            this.e = null;
        }
        ImageReceiver imageReceiver2 = this.f34299f;
        if (imageReceiver2 != null) {
            imageReceiver2.onDetachedFromWindow();
            this.f34299f.clearImage();
            this.f34299f = null;
        }
        ImageReceiver imageReceiver3 = this.f34300g;
        if (imageReceiver3 != null) {
            imageReceiver3.onDetachedFromWindow();
            this.f34300g.clearImage();
            this.f34300g = null;
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
        if (this.C == null && this.f34306n) {
            if (!this.f34298c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 25));
            this.C.addListener(new xo0(this, 11));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.rr.f28031f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f34298c && (view = this.e) != null) {
            view.invalidate();
        }
        gv0 gv0Var = this.d;
        if (gv0Var != null) {
            gv0Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f34306n && view == this.e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.e != null) {
            motionEvent.offsetLocation(-this.f34309q, -this.f34310r);
            return this.e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void h(vh vhVar) {
        this.F = vhVar;
    }

    public final boolean i() {
        float f7 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (View view = this.e; view != this.f34296a; view = (View) view.getParent()) {
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
        for (View view2 = this.e; view2 != this.f34297b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f7 += view2.getLeft();
            f12 += view2.getTop();
        }
        this.f34309q = f7;
        this.f34310r = f12;
        this.f34307o = f10;
        this.f34308p = f11;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f34298c) {
            if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.d6) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.d6) imageReceiver.getDrawable()).f23500u0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.isWaitingForLoad()) {
                    return false;
                }
                return true;
            }
            return imageReceiver.hasNotThumbOrOnlyStaticThumb();
        }
        return true;
    }

    public hv0() {
        this.f34300g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f34302j = new vh.g();
        this.f34304l = new Path();
        this.f34305m = new float[8];
        this.Q = new float[2];
        this.f34296a = null;
        this.f34297b = null;
        this.f34298c = true;
    }

    public void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
    }
}
