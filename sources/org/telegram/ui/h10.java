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
public final class h10 extends pg.b {
    public final Context d;
    public final k10 e;

    public h10(k10 k10Var, Context context) {
        this.e = k10Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
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
        b10 b10Var = (b10) this.e.P.get(i10);
        if (b10Var == null) {
            return 3;
        }
        return b10Var.f42904a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        k10 k10Var = this.e;
        ArrayList arrayList = k10Var.P;
        b10 b10Var = (b10) arrayList.get(i10);
        if (b10Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((b10) arrayList.get(i14)).f42904a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = b1Var.f44841f;
            View view = b1Var.f44838a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.e9) view).setText(b10Var.d);
                                return;
                            case 7:
                                ((d10) view).e(b10Var.f34147m, z10);
                                return;
                            case 8:
                                r00 r00Var = (r00) view;
                                if (r00Var.f39252c != z10) {
                                    r00Var.f39252c = z10;
                                    r00Var.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                y00 y00Var = (y00) view;
                                k10Var.I = y00Var;
                                y00Var.e(org.telegram.ui.Components.b6.cloneSpans(k10Var.f37205w, -1, y00Var.f41699s.getPaint().getFontMetricsInt(), 0.5f), false);
                                y00 y00Var2 = k10Var.I;
                                if (k10Var.getUserConfig().isPremium()) {
                                    i16 = k10Var.E;
                                }
                                y00Var2.d(i16, false);
                                k10Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                                return;
                            case 10:
                                bq0 bq0Var = (bq0) view;
                                bq0Var.setCloseAsLock(!k10Var.getUserConfig().isPremium());
                                if (k10Var.getUserConfig().isPremium()) {
                                    i16 = k10Var.E;
                                }
                                bq0Var.a(i16, false);
                                bq0Var.setOnColorClick(new mt(3, this, bq0Var));
                                return;
                            case 11:
                                z00 z00Var = (z00) view;
                                k10Var.J = z00Var;
                                z00Var.setText(b10Var.d);
                                org.telegram.ui.Cells.u3 u3Var = z00Var.f42123r;
                                u3Var.setText(b10Var.e);
                                u3Var.setOnClickListener(b10Var.f34140c);
                                return;
                            default:
                                return;
                        }
                    }
                    p00 p00Var = (p00) view;
                    boolean z12 = b10Var.f34146l;
                    ImageView imageView = p00Var.f38785a;
                    TextView textView = p00Var.f38786b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.g6.f19839q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.g6.f19804o6;
                    }
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.g6.f19822p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.g6.q6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
                    int i17 = b10Var.f34145k;
                    CharSequence charSequence = b10Var.d;
                    ImageView imageView2 = p00Var.f38785a;
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
                    Boolean bool = p00Var.e;
                    if (bool == null || bool.booleanValue() != z11) {
                        p00Var.e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (p00Var.f38787c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            animate.translationX(f10).setDuration(180L).setInterpolator(org.telegram.ui.Components.es.h).start();
                        } else {
                            if (z11) {
                                f10 = AndroidUtilities.dp(i16 * (-7));
                            }
                            textView.setTranslationX(f10);
                        }
                    }
                    p00Var.d = z10;
                    p00Var.setWillNotDraw(!z10);
                    p00Var.f38787c = i17;
                    return;
                }
                org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
                String str = b10Var.f34143i;
                if (str != null) {
                    xaVar.e(str, b10Var.d, null, z10);
                    return;
                }
                long j10 = b10Var.h;
                if (j10 > 0) {
                    TLRPC.User user = k10Var.getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        if (user.bot) {
                            string2 = LocaleController.getString(R.string.Bot);
                        } else if (user.contact) {
                            string2 = LocaleController.getString(R.string.FilterContact);
                        } else {
                            string2 = LocaleController.getString(R.string.FilterNonContact);
                        }
                        xaVar.e(user, null, string2, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = k10Var.getMessagesController().getChat(Long.valueOf(-j10));
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
                    xaVar.e(chat, null, string, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (b10Var.f34141f) {
                m4Var.setText(k10.x0(0, b10Var.d, false));
            } else {
                m4Var.setText(b10Var.d);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.xa xaVar;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        Context context = this.d;
        k10 k10Var = this.e;
        switch (i10) {
            case 0:
                xaVar = new org.telegram.ui.Cells.m4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.xa xaVar2 = new org.telegram.ui.Cells.xa(6, 0, context, false);
                xaVar2.setSelfAsSavedMessages(true);
                xaVar = xaVar2;
                break;
            case 2:
                org.telegram.ui.Components.ow0 ow0Var = (org.telegram.ui.Components.ow0) k10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                c6Var = ((org.telegram.ui.ActionBar.m2) k10Var).resourceProvider;
                ?? g3Var = new org.telegram.ui.Cells.g3(this.d, ow0Var, string, false, 12, c6Var);
                k10Var.K = g3Var;
                g3Var.f20908n = false;
                org.telegram.ui.Cells.e3 e3Var = g3Var.f20905b;
                e3Var.getEditText().setEmojiColor(Integer.valueOf(k10Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oh)));
                e3Var.setEmojiViewCacheType(25);
                e3Var.setText(k10Var.f37205w);
                i11 = ((org.telegram.ui.ActionBar.m2) k10Var).currentAccount;
                org.telegram.ui.Components.s5.s(i11, k10Var.f37206x);
                org.telegram.ui.Components.nu editText = e3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.i3());
                editText.addTextChangedListener(new f10(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                e3Var.getEditText().setImeOptions(268435462);
                xaVar = g3Var;
                break;
            case 3:
                xaVar = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f38785a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, w7.z5.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, 24, i12 | 16));
                TextView textView = new TextView(context);
                frameLayout.f38786b = textView;
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
                frameLayout.addView(textView, w7.z5.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, 23));
                xaVar = frameLayout;
                break;
            case 5:
                ?? frameLayout2 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout2.f33717a = imageView2;
                imageView2.f(R.raw.filter_new, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                frameLayout2.addView(imageView2, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 100, 17));
                imageView2.setOnClickListener(new a(frameLayout2, 23));
                xaVar = frameLayout2;
                break;
            case 6:
            default:
                xaVar = new org.telegram.ui.Cells.e9(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.m2) k10Var).currentAccount;
                xaVar = new g10(this, this.d, k10Var, i14, k10Var.f37203r.f16400id);
                break;
            case 8:
                xaVar = new r00(context);
                break;
            case 9:
                xaVar = new y00(k10Var, context);
                break;
            case 10:
                Activity parentActivity = k10Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.m2) k10Var).currentAccount;
                c6Var2 = ((org.telegram.ui.ActionBar.m2) k10Var).resourceProvider;
                xaVar = new bq0(2, i15, parentActivity, c6Var2);
                break;
            case 11:
                c6Var3 = ((org.telegram.ui.ActionBar.m2) k10Var).resourceProvider;
                xaVar = new z00(context, c6Var3);
                break;
        }
        return new s4.b1(xaVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 2 && i10 == 9) {
            k10 k10Var = this.e;
            ((y00) b1Var.f44838a).e(org.telegram.ui.Components.b6.cloneSpans(k10Var.f37205w, -1, k10Var.I.f41699s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        if (b1Var.f44841f == 2) {
            org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) b1Var.f44838a;
            g3Var.f20905b.k(true);
            g3Var.f20905b.d();
        }
    }
}
