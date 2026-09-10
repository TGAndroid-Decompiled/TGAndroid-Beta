package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class nm extends dl0 {
    public final Context f25555c;
    public final boolean d;
    public boolean e;
    public boolean f25556f;
    public final ArrayList h = new ArrayList(8);
    public int f25557n;
    public int f25558r;
    public boolean f25559s;
    public final ChatAttachAlertPhotoLayout v;

    public nm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.v = chatAttachAlertPhotoLayout;
        this.f25555c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(vl0 vl0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f20984r1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if ((!isEmpty || ((albumEntry = chatAttachAlertPhotoLayout.T0) != null && !albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.f26422b.R && h() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry M = M(i10);
        if (M == null) {
            int i11 = this.f25558r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f20984r1;
                if (!arrayList2.isEmpty()) {
                    M = (MediaController.PhotoEntry) arrayList2.get(0);
                } else {
                    MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
                    if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                        M = arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.T0.photos.isEmpty()) {
                M = (MediaController.PhotoEntry) hc.b.i(1, chatAttachAlertPhotoLayout.T0.photos);
            }
        }
        if (M != null) {
            long j3 = M.dateTaken;
            if (Build.VERSION.SDK_INT <= 28) {
                j3 /= 1000;
            }
            return LocaleController.formatYearMont(j3, true);
        }
        return "";
    }

    @Override
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        int measuredHeight = vl0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h() / chatAttachAlertPhotoLayout.M0) * measuredHeight)) - (vl0Var.getMeasuredHeight() - currentActionBarHeight)) * f7;
        float f10 = measuredHeight;
        iArr[0] = ((int) (ceil / f10)) * chatAttachAlertPhotoLayout.M0;
        int paddingTop = vl0Var.getPaddingTop() + ((int) (ceil % f10)) + ((int) ((1.0f - f7) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(vl0 vl0Var) {
        int i10 = this.v.M0;
        int ceil = (int) Math.ceil(this.f25557n / i10);
        if (vl0Var.getChildCount() != 0) {
            int measuredHeight = vl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = vl0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.clamp((((R / i10) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (vl0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(vl0 vl0Var) {
        this.f25559s = false;
        int childCount = vl0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            vl0Var.getChildAt(i10).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f25559s = true;
    }

    public final fl0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(this.f25555c, chatAttachAlertPhotoLayout.f26421a);
        if (this == chatAttachAlertPhotoLayout.G) {
            t5Var.setOutlineProvider(new lm(this));
            t5Var.setClipToOutline(true);
        }
        t5Var.setFastScrollDelegate(new t(this, 22));
        t5Var.setDelegate(new km(0, this, t5Var));
        return new s4.c1(t5Var);
    }

    public final MediaController.PhotoEntry M(int i10) {
        boolean z10 = this.f25556f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z10 && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f20983q1;
        return chatAttachAlertPhotoLayout.b0(i10);
    }

    @Override
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        nm nmVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.f21026v0) {
            return 1;
        }
        int i10 = 0;
        this.e = false;
        this.f25556f = false;
        boolean z10 = chatAttachAlertPhotoLayout.P0;
        if (z10 && this == nmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            this.e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.f21001g1) {
            i10++;
        }
        if (z10 && this == nmVar) {
            i10++;
        }
        this.f25558r = i10;
        if (!z10) {
            i10 += ChatAttachAlertPhotoLayout.f20984r1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
            if (albumEntry != null) {
                i10 += albumEntry.photos.size();
            }
        }
        if (this.e && i10 > chatAttachAlertPhotoLayout.M0 && !chatAttachAlertPhotoLayout.O0) {
            this.f25556f = true;
            i10++;
        }
        if (this == nmVar) {
            i10++;
        }
        this.f25557n = i10;
        return i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        nm nmVar = chatAttachAlertPhotoLayout.G;
        if (chatAttachAlertPhotoLayout.f21026v0) {
            boolean z10 = chatAttachAlertPhotoLayout.P0;
            if (z10 && this == nmVar) {
                if (i10 == 0) {
                    return 7;
                }
                return 2;
            }
            boolean z11 = this.d;
            if (z11 && i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                if (!chatAttachAlertPhotoLayout.O0) {
                    return 1;
                }
                return 8;
            }
            boolean z12 = this.f25556f;
            if (z12 && i10 == chatAttachAlertPhotoLayout.M0) {
                return 5;
            }
            if (z12 && i10 > chatAttachAlertPhotoLayout.M0) {
                i11 = i10 - 1;
            } else {
                i11 = i10;
            }
            if (z11) {
                i11--;
            }
            if (chatAttachAlertPhotoLayout.f21001g1 && i11 == 0) {
                return 4;
            }
            if (this == nmVar && i10 == this.f25557n - 1) {
                return 2;
            }
            if (z10) {
                return 3;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void l() {
        int i10;
        super.l();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (this == chatAttachAlertPhotoLayout.G) {
            tz tzVar = chatAttachAlertPhotoLayout.H;
            if ((h() == 1 && !chatAttachAlertPhotoLayout.P0 && chatAttachAlertPhotoLayout.T0 == null) || !chatAttachAlertPhotoLayout.f21026v0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            tzVar.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        yi yiVar = chatAttachAlertPhotoLayout.f26422b;
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        boolean z15 = this.d;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 7) {
                        ((p20) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f21001g1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
                n5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
                n5Var.setType((z15 && chatAttachAlertPhotoLayout.O0 && i10 == 0) ? 1 : 1);
                return;
            }
            ((org.telegram.ui.Cells.m5) view).setItemSize(chatAttachAlertPhotoLayout.K0);
            return;
        }
        if (this.f25556f && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.f21001g1) {
            i10--;
        }
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        if (this == chatAttachAlertPhotoLayout.G) {
            t5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
        } else {
            if (chatAttachAlertPhotoLayout.f21022s.f41598o == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            t5Var.setIsVertical(z10);
        }
        if (yiVar.Q0 == 0 && !yiVar.T0 && !yiVar.H) {
            t5Var.getCheckBox().setVisibility(0);
        } else {
            t5Var.getCheckBox().setVisibility(8);
        }
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f20985s1;
        if (hashMap.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i10 == h() - 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (yiVar != null && yiVar.f29375i0) {
            z14 = true;
        } else {
            z14 = false;
        }
        t5Var.d(b02, z11, z12, z13, z14);
        if ((yiVar.f29366f0 instanceof org.telegram.ui.eo) && yiVar.T1) {
            t5Var.b(ChatAttachAlertPhotoLayout.f20986t1.indexOf(Integer.valueOf(b02.imageId)), hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        } else {
            t5Var.b(-1, hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.f21028w0 && b02.isVideo) {
            t5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f21030x0 && !b02.isVideo) {
            t5Var.setAlpha(0.3f);
        } else {
            t5Var.setAlpha(1.0f);
        }
        t5Var.getImageView().setTag(Integer.valueOf(i10));
        t5Var.setTag(Integer.valueOf(i10));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        yi yiVar = chatAttachAlertPhotoLayout.f26422b;
        org.telegram.ui.ActionBar.f6 f6Var = chatAttachAlertPhotoLayout.f26421a;
        if (i10 != 0) {
            Context context = this.f25555c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f19569a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17875aa, f6Var);
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
                                    frameLayout.addView(imageView, w7.a6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f19570b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17895ba, f6Var), mode));
                                    frameLayout.addView(imageView2, w7.a6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f19571c = textView;
                                    org.telegram.messenger.em.n(org.telegram.ui.ActionBar.j6.f17914ca, f6Var, textView, 1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = AndroidUtilities.dp(80.0f);
                                    return new s4.c1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                                bi.d dVar = new bi.d(context, f6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.e();
                                dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new uq(R.drawable.camera, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
                                dVar.g(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, w7.a6.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new s4.c1(frameLayout2);
                            }
                            p20 p20Var = new p20(context, yiVar.J1);
                            p20Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(400.0f)));
                            p20Var.setGravity(17);
                            p20Var.isClickable();
                            p20Var.f25988b.setOnClickListener(new h0(new ql(chatAttachAlertPhotoLayout, 5), 18));
                            p20Var.f25987a.setOnClickListener(new h0(new ql(chatAttachAlertPhotoLayout, 6), 19));
                            p20Var.f25989c.setOnClickListener(new u10(2, p20Var, new y2(this, 2)));
                            return new s4.c1(p20Var);
                        }
                        return new s4.c1(new View(context));
                    }
                    yiVar.getClass();
                    return new s4.c1(new mm(this, context));
                }
                return new s4.c1(new bi.nc(this, context, 13));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f19528a = AndroidUtilities.dp(0.0f);
            return new s4.c1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            fl0 fl0Var = (fl0) arrayList.get(0);
            arrayList.remove(0);
            return fl0Var;
        }
        return L();
    }

    @Override
    public final void y(s4.c1 c1Var) {
        if (c1Var.f41610a instanceof org.telegram.ui.Cells.m5) {
            this.v.Q.f();
        }
    }
}
