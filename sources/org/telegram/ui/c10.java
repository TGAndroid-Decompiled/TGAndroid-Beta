package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class c10 extends og.b {
    public final Context d;
    public final f10 e;

    public c10(f10 f10Var, Context context) {
        this.e = f10Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42932f;
        if (i10 != 3 && i10 != 0 && i10 != 2 && i10 != 5 && i10 != 9 && i10 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.P.size();
    }

    @Override
    public final int j(int i10) {
        w00 w00Var = (w00) this.e.P.get(i10);
        if (w00Var == null) {
            return 3;
        }
        return w00Var.f15672a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        f10 f10Var = this.e;
        ArrayList arrayList = f10Var.P;
        w00 w00Var = (w00) arrayList.get(i10);
        if (w00Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((w00) arrayList.get(i14)).f15672a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = c1Var.f42932f;
            View view = c1Var.f42929a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.e9) view).setText(w00Var.d);
                                return;
                            case 7:
                                ((y00) view).e(w00Var.f38657m, z10);
                                return;
                            case 8:
                                m00 m00Var = (m00) view;
                                if (m00Var.f35485c != z10) {
                                    m00Var.f35485c = z10;
                                    m00Var.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                t00 t00Var = (t00) view;
                                f10Var.I = t00Var;
                                t00Var.e(org.telegram.ui.Components.z5.cloneSpans(f10Var.f33397w, -1, t00Var.f37526s.getPaint().getFontMetricsInt(), 0.5f), false);
                                t00 t00Var2 = f10Var.I;
                                if (f10Var.getUserConfig().isPremium()) {
                                    i16 = f10Var.E;
                                }
                                t00Var2.d(i16, false);
                                f10Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                zp0 zp0Var = (zp0) view;
                                zp0Var.setCloseAsLock(!f10Var.getUserConfig().isPremium());
                                if (f10Var.getUserConfig().isPremium()) {
                                    i16 = f10Var.E;
                                }
                                zp0Var.a(i16, false);
                                zp0Var.setOnColorClick(new of(26, this, zp0Var));
                                return;
                            case 11:
                                u00 u00Var = (u00) view;
                                f10Var.J = u00Var;
                                u00Var.setText(w00Var.d);
                                org.telegram.ui.Cells.u3 u3Var = u00Var.f37842r;
                                u3Var.setText(w00Var.e);
                                u3Var.setOnClickListener(w00Var.f38650c);
                                return;
                            default:
                                return;
                        }
                    }
                    k00 k00Var = (k00) view;
                    boolean z12 = w00Var.f38656l;
                    ImageView imageView = k00Var.f34964a;
                    TextView textView = k00Var.f34965b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.j6.f19301q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.f19264o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.j6.f19283p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.j6.q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    int i17 = w00Var.f38655k;
                    CharSequence charSequence = w00Var.d;
                    ImageView imageView2 = k00Var.f34964a;
                    if (!LocaleController.isRTL) {
                        i16 = 1;
                    }
                    if (i17 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i17);
                    }
                    float f7 = 72.0f;
                    if (LocaleController.isRTL) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i17 == 0) {
                            f7 = 24.0f;
                        }
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(f7);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i17 == 0) {
                            f7 = 24.0f;
                        }
                        marginLayoutParams2.leftMargin = AndroidUtilities.dp(f7);
                    }
                    textView.setText(charSequence);
                    if (!z10 && i17 != 0) {
                        z11 = true;
                    }
                    Boolean bool = k00Var.e;
                    if (bool == null || bool.booleanValue() != z11) {
                        k00Var.e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (k00Var.f34966c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f10).setDuration(180L).setInterpolator(org.telegram.ui.Components.qr.h).start();
                        } else {
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f10);
                        }
                    }
                    k00Var.d = z10;
                    k00Var.setWillNotDraw(!z10);
                    k00Var.f34966c = i17;
                    return;
                }
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                String str = w00Var.f38653i;
                if (str != null) {
                    zaVar.d(str, w00Var.d, null, z10);
                    return;
                }
                long j3 = w00Var.h;
                if (j3 > 0) {
                    TLRPC.User user = f10Var.getMessagesController().getUser(Long.valueOf(j3));
                    if (user != null) {
                        if (user.bot) {
                            string2 = LocaleController.getString(R.string.Bot);
                        } else if (user.contact) {
                            string2 = LocaleController.getString(R.string.FilterContact);
                        } else {
                            string2 = LocaleController.getString(R.string.FilterNonContact);
                        }
                        zaVar.d(user, null, string2, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = f10Var.getMessagesController().getChat(Long.valueOf(-j3));
                if (chat != null) {
                    if (ChatObject.isCommunity(chat)) {
                        string = LocaleController.getString(R.string.Community);
                    } else if (chat.participants_count != 0) {
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            string = LocaleController.formatPluralStringComma("Subscribers", chat.participants_count);
                        } else {
                            string = LocaleController.formatPluralStringComma("Members", chat.participants_count);
                        }
                    } else if (!ChatObject.isPublic(chat)) {
                        if (ChatObject.isChannel(chat) && !chat.megagroup) {
                            string = LocaleController.getString(R.string.ChannelPrivate);
                        } else {
                            string = LocaleController.getString(R.string.MegaPrivate);
                        }
                    } else if (ChatObject.isChannel(chat) && !chat.megagroup) {
                        string = LocaleController.getString(R.string.ChannelPublic);
                    } else {
                        string = LocaleController.getString(R.string.MegaPublic);
                    }
                    zaVar.d(chat, null, string, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (w00Var.f38651f) {
                m4Var.setText(f10.x0(0, w00Var.d, false));
            } else {
                m4Var.setText(w00Var.d);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.za zaVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i11;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        Context context = this.d;
        f10 f10Var = this.e;
        switch (i10) {
            case 0:
                zaVar = new org.telegram.ui.Cells.m4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.za zaVar2 = new org.telegram.ui.Cells.za(context, 6, 0, false);
                zaVar2.setSelfAsSavedMessages(true);
                zaVar = zaVar2;
                break;
            case 2:
                org.telegram.ui.Components.bw0 bw0Var = (org.telegram.ui.Components.bw0) f10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                e6Var = ((org.telegram.ui.ActionBar.n2) f10Var).resourceProvider;
                ?? g3Var = new org.telegram.ui.Cells.g3(this.d, bw0Var, string, false, 12, e6Var);
                f10Var.K = g3Var;
                g3Var.f20295n = false;
                org.telegram.ui.Cells.e3 e3Var = g3Var.f20292b;
                e3Var.getEditText().setEmojiColor(Integer.valueOf(f10Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
                e3Var.setEmojiViewCacheType(25);
                e3Var.setText(f10Var.f33397w);
                i11 = ((org.telegram.ui.ActionBar.n2) f10Var).currentAccount;
                org.telegram.ui.Components.q5.s(i11, f10Var.f33398x);
                org.telegram.ui.Components.bu editText = e3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.i3());
                editText.addTextChangedListener(new a10(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                e3Var.getEditText().setImeOptions(268435462);
                zaVar = g3Var;
                break;
            case 3:
                zaVar = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f34964a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, w7.y5.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f34965b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                int i17 = 24;
                if (z10) {
                    i13 = 24;
                } else {
                    i13 = 0;
                }
                if (z10) {
                    i17 = 0;
                }
                textView.setPadding(i13, 0, i17, 0);
                if (LocaleController.isRTL) {
                    i16 = 5;
                }
                textView.setGravity(i16);
                boolean z11 = LocaleController.isRTL;
                if (z11) {
                    f7 = 0.0f;
                } else {
                    f7 = 72.0f;
                }
                if (z11) {
                    f10 = 72.0f;
                } else {
                    f10 = 0.0f;
                }
                frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
                zaVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f38267a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, w7.y5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout2, 24));
                zaVar = frameLayout2;
                break;
            case 6:
            default:
                zaVar = new org.telegram.ui.Cells.e9(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.n2) f10Var).currentAccount;
                zaVar = new b10(this, this.d, f10Var, i14, f10Var.f33395r.f15790id);
                break;
            case 8:
                zaVar = new m00(context);
                break;
            case 9:
                zaVar = new t00(f10Var, context);
                break;
            case 10:
                Activity parentActivity = f10Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.n2) f10Var).currentAccount;
                e6Var2 = ((org.telegram.ui.ActionBar.n2) f10Var).resourceProvider;
                zaVar = new zp0(2, i15, parentActivity, e6Var2);
                break;
            case 11:
                e6Var3 = ((org.telegram.ui.ActionBar.n2) f10Var).resourceProvider;
                zaVar = new u00(context, e6Var3);
                break;
        }
        return new s4.c1(zaVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f42932f;
        if (i10 != 2 && i10 == 9) {
            f10 f10Var = this.e;
            ((t00) c1Var.f42929a).e(org.telegram.ui.Components.z5.cloneSpans(f10Var.f33397w, -1, f10Var.I.f37526s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        if (c1Var.f42932f == 2) {
            org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) c1Var.f42929a;
            g3Var.f20292b.k(true);
            g3Var.f20292b.d();
        }
    }
}
