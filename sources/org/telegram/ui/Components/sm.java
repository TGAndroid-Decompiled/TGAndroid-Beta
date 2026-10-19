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
public final class sm extends ql0 {
    public final Context f30281c;
    public final boolean d;
    public boolean e;
    public boolean f30282f;
    public final ArrayList h = new ArrayList(8);
    public int f30283n;
    public int f30284r;
    public boolean f30285s;
    public final ChatAttachAlertPhotoLayout v;

    public sm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.v = chatAttachAlertPhotoLayout;
        this.f30281c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final boolean E(im0 im0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f24075r1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if ((!isEmpty || ((albumEntry = chatAttachAlertPhotoLayout.T0) != null && !albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.f28223b.R && h() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry M = M(i10);
        if (M == null) {
            int i11 = this.f30284r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f24075r1;
                if (!arrayList2.isEmpty()) {
                    M = (MediaController.PhotoEntry) arrayList2.get(0);
                } else {
                    MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
                    if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                        M = arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.T0.photos.isEmpty()) {
                M = (MediaController.PhotoEntry) i2.e.h(1, chatAttachAlertPhotoLayout.T0.photos);
            }
        }
        if (M != null) {
            long j10 = M.dateTaken;
            if (Build.VERSION.SDK_INT <= 28) {
                j10 /= 1000;
            }
            return LocaleController.formatYearMont(j10, true);
        }
        return "";
    }

    @Override
    public final void G(im0 im0Var, float f7, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = im0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h() / chatAttachAlertPhotoLayout.M0) * measuredHeight)) - (im0Var.getMeasuredHeight() - currentActionBarHeight)) * f7;
        float f10 = measuredHeight;
        iArr[0] = ((int) (ceil / f10)) * chatAttachAlertPhotoLayout.M0;
        int paddingTop = im0Var.getPaddingTop() + ((int) (ceil % f10)) + ((int) ((1.0f - f7) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(im0 im0Var) {
        int i10 = this.v.M0;
        int ceil = (int) Math.ceil(this.f30283n / i10);
        if (im0Var.getChildCount() != 0) {
            int measuredHeight = im0Var.getChildAt(0).getMeasuredHeight();
            View childAt = im0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.clamp((((R / i10) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (im0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(im0 im0Var) {
        this.f30285s = false;
        int childCount = im0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            im0Var.getChildAt(i10).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f30285s = true;
    }

    public final sl0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(this.f30281c, chatAttachAlertPhotoLayout.f28222a);
        if (this == chatAttachAlertPhotoLayout.G) {
            s5Var.setOutlineProvider(new qm(this));
            s5Var.setClipToOutline(true);
        }
        s5Var.setFastScrollDelegate(new s(this, 22));
        s5Var.setDelegate(new q2(10, this, s5Var));
        return new s4.b1(s5Var);
    }

    public final MediaController.PhotoEntry M(int i10) {
        boolean z10 = this.f30282f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z10 && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f24074q1;
        return chatAttachAlertPhotoLayout.b0(i10);
    }

    @Override
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        sm smVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.f24117v0) {
            return 1;
        }
        int i10 = 0;
        this.e = false;
        this.f30282f = false;
        boolean z10 = chatAttachAlertPhotoLayout.P0;
        if (z10 && this == smVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            this.e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.f24092g1) {
            i10++;
        }
        if (z10 && this == smVar) {
            i10++;
        }
        this.f30284r = i10;
        if (!z10) {
            i10 += ChatAttachAlertPhotoLayout.f24075r1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
            if (albumEntry != null) {
                i10 += albumEntry.photos.size();
            }
        }
        if (this.e && i10 > chatAttachAlertPhotoLayout.M0 && !chatAttachAlertPhotoLayout.O0) {
            this.f30282f = true;
            i10++;
        }
        if (this == smVar) {
            i10++;
        }
        this.f30283n = i10;
        return i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        sm smVar = chatAttachAlertPhotoLayout.G;
        if (chatAttachAlertPhotoLayout.f24117v0) {
            boolean z10 = chatAttachAlertPhotoLayout.P0;
            if (z10 && this == smVar) {
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
            boolean z12 = this.f30282f;
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
            if (chatAttachAlertPhotoLayout.f24092g1 && i11 == 0) {
                return 4;
            }
            if (this == smVar && i10 == this.f30283n - 1) {
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
            vz vzVar = chatAttachAlertPhotoLayout.H;
            if ((h() == 1 && !chatAttachAlertPhotoLayout.P0 && chatAttachAlertPhotoLayout.T0 == null) || !chatAttachAlertPhotoLayout.f24117v0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            vzVar.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ti tiVar = chatAttachAlertPhotoLayout.f28223b;
        int i11 = b1Var.f45915f;
        View view = b1Var.f45912a;
        boolean z15 = this.d;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 7) {
                        ((p20) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f24092g1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.m5 m5Var = (org.telegram.ui.Cells.m5) view;
                m5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
                if (!z15 || !chatAttachAlertPhotoLayout.O0 || i10 != 0) {
                    i12 = 1;
                }
                m5Var.setType(i12);
                return;
            }
            ((org.telegram.ui.Cells.l5) view).setItemSize(chatAttachAlertPhotoLayout.K0);
            return;
        }
        if (this.f30282f && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.f24092g1) {
            i10--;
        }
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        if (this == chatAttachAlertPhotoLayout.G) {
            s5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
        } else {
            if (chatAttachAlertPhotoLayout.f24113s.f45900o == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            s5Var.setIsVertical(z10);
        }
        if (tiVar.T0 == 0 && !tiVar.W0 && !tiVar.H) {
            s5Var.getCheckBox().setVisibility(0);
        } else {
            s5Var.getCheckBox().setVisibility(8);
        }
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24076s1;
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
        if (tiVar != null && tiVar.f30543i0) {
            z14 = true;
        } else {
            z14 = false;
        }
        s5Var.d(b02, z11, z12, z13, z14);
        if ((tiVar.f30534f0 instanceof org.telegram.ui.qn) && tiVar.W1) {
            s5Var.b(ChatAttachAlertPhotoLayout.f24077t1.indexOf(Integer.valueOf(b02.imageId)), hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        } else {
            s5Var.b(-1, hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.f24119w0 && b02.isVideo) {
            s5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f24121x0 && !b02.isVideo) {
            s5Var.setAlpha(0.3f);
        } else {
            s5Var.setAlpha(1.0f);
        }
        s5Var.getImageView().setTag(Integer.valueOf(i10));
        s5Var.setTag(Integer.valueOf(i10));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ti tiVar = chatAttachAlertPhotoLayout.f28223b;
        org.telegram.ui.ActionBar.d6 d6Var = chatAttachAlertPhotoLayout.f28222a;
        if (i10 != 0) {
            Context context = this.f30281c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f22581a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20932aa, d6Var);
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                                    frameLayout.addView(imageView, w7.z5.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f22582b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20952ba, d6Var), mode));
                                    frameLayout.addView(imageView2, w7.z5.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f22583c = textView;
                                    org.telegram.messenger.kk.o(org.telegram.ui.ActionBar.h6.f20972ca, d6Var, textView, 1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = AndroidUtilities.dp(80.0f);
                                    return new s4.b1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                                ei.d dVar = new ei.d(context, d6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.e();
                                dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new yq(R.drawable.camera, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
                                dVar.g(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, w7.z5.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new s4.b1(frameLayout2);
                            }
                            p20 p20Var = new p20(context, tiVar.M1);
                            p20Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(400.0f)));
                            p20Var.setGravity(17);
                            p20Var.isClickable();
                            p20Var.f29147b.setOnClickListener(new f0(new wl(chatAttachAlertPhotoLayout, 5), 17));
                            p20Var.f29146a.setOnClickListener(new f0(new wl(chatAttachAlertPhotoLayout, 6), 18));
                            p20Var.f29148c.setOnClickListener(new ca(15, p20Var, new z2(this, 2)));
                            return new s4.b1(p20Var);
                        }
                        return new s4.b1(new View(context));
                    }
                    tiVar.getClass();
                    return new s4.b1(new rm(this, context));
                }
                return new s4.b1(new ai.ic(this, context, 14));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f22535a = AndroidUtilities.dp(0.0f);
            return new s4.b1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            sl0 sl0Var = (sl0) arrayList.get(0);
            arrayList.remove(0);
            return sl0Var;
        }
        return L();
    }

    @Override
    public final void y(s4.b1 b1Var) {
        if (b1Var.f45912a instanceof org.telegram.ui.Cells.l5) {
            this.v.Q.g();
        }
    }
}
