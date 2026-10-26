package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.md;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.zp;
public final class p8 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final TextView E;
    public final tg.p0 F;
    public final ImageView G;
    public AnimatorSet H;
    public final int f24770a;
    public final md f24771b;
    public final TextView f24772c;
    public final org.telegram.ui.Components.y9 d;
    public final zp e;
    public boolean f24773f;
    public final ImageView h;
    public final ImageView f24774n;
    public TLRPC.TL_messages_stickerSet f24775r;
    public boolean f24776s;
    public final Rect v;
    public boolean f24777w;
    public final FrameLayout f24778x;
    public final TextView f24779y;

    public p8(Context context, int i10) {
        super(context);
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f11;
        float f12;
        int i17;
        int i18;
        int i19;
        this.v = new Rect();
        this.f24770a = i10;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        y9Var.setAspectFit(true);
        y9Var.setLayerNum(1);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i20 = i11 | 48;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 13.0f;
        }
        if (z10) {
            f10 = 13.0f;
        } else {
            f10 = 0.0f;
        }
        addView(y9Var, gb1.h(40, 40.0f, i20, f7, 9.0f, f10, 0.0f));
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i10 != 3) {
                int i21 = org.telegram.ui.ActionBar.y6.Vh;
                y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i21, false), 1, -1);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i21);
                imageView.setBackground(g02);
                org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, null);
            }
            if (i10 == 1) {
                int i22 = org.telegram.ui.ActionBar.y6.Uh;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.f7.t(imageView, i22, null, mode);
                imageView.setImageResource(R.drawable.msg_actions);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                if (LocaleController.isRTL) {
                    i19 = 3;
                } else {
                    i19 = 5;
                }
                addView(imageView, gb1.i(40, 40, i19 | 16));
                ImageView imageView2 = new ImageView(context);
                this.f24774n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.list_reorder);
                org.telegram.ui.ActionBar.f7.t(imageView2, i22, null, mode);
                addView(imageView2, gb1.l(58.0f, 58.0f, 8388613));
                zp zpVar = new zp(context, 21, null);
                this.e = zpVar;
                zpVar.b(-1, org.telegram.ui.ActionBar.y6.f23356d6, org.telegram.ui.ActionBar.y6.f23485k7);
                zpVar.setDrawUnchecked(false);
                zpVar.setDrawBackgroundAsArc(3);
                addView(zpVar, gb1.m(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i10 == 3) {
                org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.Mh, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.floating_check);
                boolean z11 = LocaleController.isRTL;
                if (z11) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                int i23 = i17 | 48;
                if (z11) {
                    i18 = 10;
                } else {
                    i18 = 0;
                }
                addView(imageView, gb1.h(40, 40.0f, i23, i18, 9.0f, z11 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f24778x = frameLayout;
        TextView textView = new TextView(context);
        this.f24779y = textView;
        ic.a.o(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.Add));
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, null);
        int i24 = org.telegram.ui.ActionBar.y6.Oh;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i24, false);
        int i25 = org.telegram.ui.ActionBar.y6.Qh;
        y d = org.telegram.ui.ActionBar.o6.d(new float[]{14.0f}, x02, org.telegram.ui.ActionBar.y6.x0(null, i25, false));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i24);
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i25);
        textView.setBackground(d);
        org.telegram.ui.ActionBar.f7.k(textView, d, N2, N3, null);
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new j8(this, 0));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(textView, gb1.l(-2.0f, 28.0f, i12 | 16));
        gb1.b(textView);
        TextView textView2 = new TextView(context);
        this.E = textView2;
        ic.a.o(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.StickersRemove));
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.Rh, null);
        y d10 = org.telegram.ui.ActionBar.o6.d(new float[]{14.0f}, 0, org.telegram.ui.ActionBar.y6.x0(null, i24, false) & 452984831);
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i24, 26);
        textView2.setBackground(d10);
        org.telegram.ui.ActionBar.f7.k(textView2, d10, null, h, null);
        textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new j8(this, 0));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout.addView(textView2, gb1.m(-2.0f, 32.0f, i13 | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        gb1.b(textView2);
        tg.p0 p0Var = new tg.p0(AndroidUtilities.dp(4.0f), context, null, false);
        this.F = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.a(LocaleController.getString(R.string.Unlock), new j8(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ((ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
            p0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        FrameLayout frameLayout2 = this.f24778x;
        tg.p0 p0Var2 = this.F;
        if (LocaleController.isRTL) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        frameLayout2.addView(p0Var2, gb1.l(-2.0f, 28.0f, i14 | 16));
        gb1.b(this.F);
        this.f24778x.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        View view = this.f24778x;
        if (LocaleController.isRTL) {
            i15 = 3;
        } else {
            i15 = 5;
        }
        addView(view, gb1.h(-2, -1.0f, i15, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f24778x.setOnClickListener(new j8(this, 1));
        md mdVar = new md(context, 9);
        this.f24771b = mdVar;
        NotificationCenter.listenEmojiLoading(mdVar);
        org.telegram.ui.ActionBar.f7.V(mdVar, org.telegram.ui.ActionBar.y6.G6, null);
        mdVar.setTextSize(1, 16.0f);
        mdVar.setTypeface(AndroidUtilities.bold());
        mdVar.setLines(1);
        mdVar.setMaxLines(1);
        mdVar.setSingleLine(true);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        mdVar.setGravity(gb1.E());
        addView(mdVar, gb1.m(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f24772c = textView3;
        org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.f23767z6, null);
        vh.r(textView3, 1, 13.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setGravity(gb1.E());
        addView(textView3, gb1.m(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i10 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.G = imageView3;
            imageView3.setImageResource(R.drawable.msg_close);
            imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            org.telegram.ui.ActionBar.f7.t(imageView3, org.telegram.ui.ActionBar.y6.f23748y6, null, PorterDuff.Mode.SRC_IN);
            int i26 = org.telegram.ui.ActionBar.y6.f23448i6;
            y g03 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i26, false), 1, -1);
            org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i26);
            imageView3.setBackground(g03);
            org.telegram.ui.ActionBar.f7.k(imageView3, g03, null, N4, null);
            imageView3.setVisibility(8);
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i16 = 3;
            } else {
                i16 = 5;
            }
            int i27 = i16 | 16;
            if (z12) {
                f11 = 4.0f;
            } else {
                f11 = 0.0f;
            }
            if (z12) {
                f12 = 0.0f;
            } else {
                f12 = 4.0f;
            }
            addView(imageView3, gb1.h(-2, -2.0f, i27, f11, 0.0f, f12, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        int i10 = this.f24770a;
        if (i10 == 1) {
            return this.e.f35382a.f26089q;
        }
        if (i10 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.f24777w || this.f24778x.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23520m6));
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        float f10;
        int i10 = this.f24770a;
        if (i10 == 1) {
            this.e.a(z10, z11);
            return;
        }
        int i11 = 4;
        float f11 = 0.0f;
        float f12 = 0.1f;
        if (i10 == 3) {
            ImageView imageView = this.h;
            if (z11) {
                imageView.animate().cancel();
                ViewPropertyAnimator listener = imageView.animate().setListener(new m8(this, z10, 0));
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha = listener.alpha(f11);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.1f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                if (z10) {
                    f12 = 1.0f;
                }
                scaleX.scaleY(f12).setDuration(150L).start();
                return;
            }
            if (z10) {
                i11 = 0;
            }
            imageView.setVisibility(i11);
            if (!z10) {
                imageView.setAlpha(0.0f);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                return;
            }
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        } else if (this.f24777w) {
            FrameLayout frameLayout = this.f24778x;
            if (z11) {
                frameLayout.animate().cancel();
                ViewPropertyAnimator listener2 = frameLayout.animate().setListener(new m8(this, z10, 1));
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = listener2.alpha(f11);
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.1f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f7);
                if (z10) {
                    f12 = 1.0f;
                }
                scaleX2.scaleY(f12).setDuration(150L).start();
                return;
            }
            if (z10) {
                i11 = 0;
            }
            frameLayout.setVisibility(i11);
            if (!z10) {
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleX(0.1f);
                frameLayout.setScaleY(0.1f);
                return;
            }
            frameLayout.setAlpha(1.0f);
            frameLayout.setScaleX(1.0f);
            frameLayout.setScaleY(1.0f);
        }
    }

    public final void c(final boolean z10) {
        float f7;
        float f10;
        if (this.f24770a == 1) {
            float f11 = 0.0f;
            float f12 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (!z10) {
                f11 = 1.0f;
            }
            float[] fArr = {f7, f11};
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.66f;
            }
            if (z10) {
                f12 = 0.66f;
            }
            float[] fArr2 = {f10, f12};
            ImageView imageView = this.f24774n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            ds dsVar = ut.f33491a;
            duration.setInterpolator(dsVar).withEndAction(new Runnable(this) {
                public final p8 f24351b;

                {
                    this.f24351b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            p8 p8Var = this.f24351b;
                            if (!z11) {
                                p8Var.f24774n.setVisibility(8);
                                return;
                            } else {
                                p8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            p8 p8Var2 = this.f24351b;
                            if (z12) {
                                p8Var2.f24778x.setVisibility(8);
                                return;
                            } else {
                                p8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            p8 p8Var3 = this.f24351b;
                            if (z13) {
                                p8Var3.h.setVisibility(8);
                                return;
                            } else {
                                p8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            if (this.f24777w) {
                FrameLayout frameLayout = this.f24778x;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(dsVar).withEndAction(new Runnable(this) {
                    public final p8 f24351b;

                    {
                        this.f24351b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z11 = z10;
                                p8 p8Var = this.f24351b;
                                if (!z11) {
                                    p8Var.f24774n.setVisibility(8);
                                    return;
                                } else {
                                    p8Var.getClass();
                                    return;
                                }
                            case 1:
                                boolean z12 = z10;
                                p8 p8Var2 = this.f24351b;
                                if (z12) {
                                    p8Var2.f24778x.setVisibility(8);
                                    return;
                                } else {
                                    p8Var2.getClass();
                                    return;
                                }
                            default:
                                boolean z13 = z10;
                                p8 p8Var3 = this.f24351b;
                                if (z13) {
                                    p8Var3.h.setVisibility(8);
                                    return;
                                } else {
                                    p8Var3.getClass();
                                    return;
                                }
                        }
                    }
                }).start();
                return;
            }
            ImageView imageView2 = this.h;
            imageView2.setVisibility(0);
            imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(dsVar).withEndAction(new Runnable(this) {
                public final p8 f24351b;

                {
                    this.f24351b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            p8 p8Var = this.f24351b;
                            if (!z11) {
                                p8Var.f24774n.setVisibility(8);
                                return;
                            } else {
                                p8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            p8 p8Var2 = this.f24351b;
                            if (z12) {
                                p8Var2.f24778x.setVisibility(8);
                                return;
                            } else {
                                p8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            p8 p8Var3 = this.f24351b;
                            if (z13) {
                                p8Var3.h.setVisibility(8);
                                return;
                            } else {
                                p8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
        }
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        int i10;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        String str;
        ImageLocation forSticker;
        int i11;
        String str2;
        this.f24773f = z10;
        this.f24775r = tL_messages_stickerSet;
        this.f24776s = z11;
        org.telegram.ui.Components.y9 y9Var = this.d;
        y9Var.setVisibility(0);
        md mdVar = this.f24771b;
        mdVar.setTranslationY(0.0f);
        mdVar.setText(this.f24775r.set.title);
        boolean z12 = this.f24775r.set.archived;
        TextView textView = this.f24772c;
        if (z12) {
            mdVar.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            y9Var.setAlpha(0.5f);
        } else {
            mdVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            y9Var.setAlpha(1.0f);
        }
        boolean z13 = tL_messages_stickerSet.set.emojis;
        this.f24777w = z13;
        int i12 = 8;
        if (z13) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f24778x.setVisibility(i10);
        if (!this.f24777w) {
            i12 = 0;
        }
        this.h.setVisibility(i12);
        TLRPC.Document document = null;
        y9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        String str3 = "Stickers";
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.f24777w) {
                str3 = "EmojiCount";
            }
            textView.setText(LocaleController.formatPluralString(str3, arrayList.size(), new Object[0]));
            int i13 = 0;
            while (true) {
                if (i13 < arrayList.size()) {
                    TLRPC.Document document2 = arrayList.get(i13);
                    if (document2 != null && document2.f22033id == tL_messages_stickerSet.set.thumb_document_id) {
                        document = document2;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (document == null) {
                document = arrayList.get(0);
            }
            LiteMode.isEnabled(1);
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messages_stickerSet.set.thumbs, 90);
            if (closestPhotoSizeWithSize == null) {
                closestPhotoSizeWithSize = document;
            }
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.y6.f23299a7, 1.0f);
            boolean z14 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            if (z14) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document);
            } else {
                forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, tL_messages_stickerSet.set.thumb_version);
            }
            if (this.f24777w) {
                i11 = 16388;
            } else {
                i11 = 1;
            }
            if (!LiteMode.isEnabled(i11)) {
                str2 = "_firstframe";
            } else {
                str2 = "";
            }
            String concat = "50_50".concat(str2);
            if (!z14 || (!MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isVideoSticker(document))) {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (forSticker != null && forSticker.imageType == 1) {
                    y9Var.i(forSticker, concat, "tgs", svgThumb, tL_messages_stickerSet2);
                } else {
                    y9Var.i(forSticker, concat, "webp", svgThumb, tL_messages_stickerSet2);
                }
            } else {
                if (svgThumb != null) {
                    y9Var.n(ImageLocation.getForDocument(document), concat, svgThumb, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    y9Var.j(ImageLocation.getForDocument(document), concat, forSticker, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (MessageObject.isTextColorEmoji(document)) {
                    y9Var.setColorFilter(org.telegram.ui.ActionBar.y6.f23689v3);
                }
            }
        } else {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet2.set.emojis) {
                str3 = "EmojiCount";
            }
            textView.setText(LocaleController.formatPluralString(str3, 0, new Object[0]));
            y9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.t5.h(UserConfig.selectedAccount).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.q5() {
                    @Override
                    public final void a(TLRPC.Document document3) {
                        AndroidUtilities.runOnUIThread(new pa(7, p8.this, document3));
                    }
                });
            }
        }
        if (this.f24776s) {
            StringBuilder sb2 = new StringBuilder();
            if (tL_messages_stickerSet2.set.emojis) {
                str = "t.me/addemoji/";
            } else {
                str = "t.me/addstickers/";
            }
            sb2.append(str);
            sb2.append(tL_messages_stickerSet2.set.short_name);
            textView.setText(sb2.toString());
        }
    }

    public final void e(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        float f14;
        int i12;
        float f15;
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H = null;
        }
        int i13 = 0;
        tg.p0 p0Var = this.F;
        if (i10 == 1) {
            p0Var.a(LocaleController.getString(R.string.Unlock), new j8(this, 0), false);
        } else if (i10 == 2) {
            p0Var.a(LocaleController.getString(R.string.Restore), new j8(this, 0), false);
        }
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        p0Var.setEnabled(z10);
        if (i10 == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        TextView textView = this.f24779y;
        textView.setEnabled(z11);
        if (i10 == 4) {
            z12 = true;
        } else {
            z12 = false;
        }
        TextView textView2 = this.E;
        textView2.setEnabled(z12);
        float f16 = 0.0f;
        float f17 = 1.0f;
        if (i10 != 1 && i10 != 2) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        p0Var.setAlpha(f7);
        if (i10 != 1 && i10 != 2) {
            f10 = 0.6f;
        } else {
            f10 = 1.0f;
        }
        p0Var.setScaleX(f10);
        if (i10 != 1 && i10 != 2) {
            f11 = 0.6f;
        } else {
            f11 = 1.0f;
        }
        p0Var.setScaleY(f11);
        if (i10 != 1 && i10 != 2) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        p0Var.setVisibility(i11);
        if (i10 == 3) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        textView.setAlpha(f12);
        if (i10 == 3) {
            f13 = 1.0f;
        } else {
            f13 = 0.6f;
        }
        textView.setScaleX(f13);
        if (i10 == 3) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        textView.setScaleY(f14);
        if (i10 == 3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        if (i10 == 4) {
            f16 = 1.0f;
        }
        textView2.setAlpha(f16);
        if (i10 == 4) {
            f15 = 1.0f;
        } else {
            f15 = 0.6f;
        }
        textView2.setScaleX(f15);
        if (i10 != 4) {
            f17 = 0.6f;
        }
        textView2.setScaleY(f17);
        if (i10 != 4) {
            i13 = 8;
        }
        textView2.setVisibility(i13);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824);
        FrameLayout frameLayout = this.f24778x;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + AndroidUtilities.dp(26.0f);
        boolean z13 = LocaleController.isRTL;
        TextView textView3 = this.f24772c;
        md mdVar = this.f24771b;
        if (z13) {
            ((ViewGroup.MarginLayoutParams) mdVar.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
            return;
        }
        ((ViewGroup.MarginLayoutParams) mdVar.getLayoutParams()).rightMargin = measuredWidth;
        ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.f24775r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.f24773f) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(71.0f);
            }
            float f7 = dp;
            float height = getHeight() - 1;
            int width = getWidth() - getPaddingRight();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(71.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, height, width - i10, getHeight() - 1, org.telegram.ui.ActionBar.y6.f23478k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        zp zpVar = this.e;
        if (zpVar != null && zpVar.f35382a.f26089q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f) + (this.f24773f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        Drawable background = getBackground();
        Rect rect = this.v;
        if (background != null && (imageView = this.h) != null) {
            imageView.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (getBackground() != null && this.f24777w && (frameLayout = this.f24778x) != null) {
            frameLayout.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z10) {
        b(z10, true);
    }

    public void setDeleteAction(View.OnClickListener onClickListener) {
        int i10;
        ImageView imageView = this.G;
        if (imageView != null) {
            if (onClickListener == null) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            imageView.setVisibility(i10);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f24773f = z10;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f24774n.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z10) {
        c(z10);
    }

    @Override
    public final void updateColors() {
    }
}
