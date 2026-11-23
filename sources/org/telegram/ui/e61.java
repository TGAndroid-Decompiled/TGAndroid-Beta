package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public final class e61 extends org.telegram.ui.Components.dk0 {
    public final Context f47459c;
    public boolean d = true;
    public final ThemeActivity f47460e;

    public e61(ThemeActivity themeActivity, Context context) {
        this.f47460e = themeActivity;
        this.f47459c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 == 0 || i7 == 1 || i7 == 4 || i7 == 7 || i7 == 10 || i7 == 11 || i7 == 12 || i7 == 14 || i7 == 18 || i7 == 20 || i7 == 21) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f47460e.L0;
    }

    @Override
    public final int d(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        ThemeActivity themeActivity = this.f47460e;
        if (i7 != themeActivity.f43959b0 && i7 != themeActivity.L && i7 != themeActivity.f43961c0 && i7 != themeActivity.Z && i7 != themeActivity.Q && i7 != themeActivity.R && i7 != themeActivity.N && i7 != themeActivity.M) {
            if (i7 != themeActivity.f43967g0 && i7 != themeActivity.f43957a0 && i7 != themeActivity.f43986w0 && i7 != themeActivity.C0 && i7 != themeActivity.I0) {
                if (i7 != themeActivity.f43981s0 && i7 != themeActivity.W && i7 != themeActivity.f43962d0 && i7 != themeActivity.P && i7 != themeActivity.f43969i0 && i7 != themeActivity.f43975o0 && i7 != themeActivity.f43972l0 && i7 != themeActivity.K && i7 != themeActivity.K0 && i7 != themeActivity.A0 && i7 != themeActivity.D0 && i7 != themeActivity.E0 && i7 != themeActivity.F0) {
                    if (i7 != themeActivity.S && i7 != themeActivity.T && i7 != themeActivity.U && i7 != themeActivity.V) {
                        if (i7 != themeActivity.X && i7 != themeActivity.f43964e0 && i7 != themeActivity.f43968h0 && i7 != themeActivity.f43989y && i7 != themeActivity.f43970j0 && i7 != themeActivity.f43987x && i7 != themeActivity.m0 && i7 != themeActivity.f43971k0 && i7 != themeActivity.f43983u0 && i7 != themeActivity.f43988x0 && i7 != themeActivity.J0 && i7 != themeActivity.G0 && i7 != themeActivity.H0) {
                            if (i7 == themeActivity.f43966f0) {
                                return 6;
                            }
                            if (i7 != themeActivity.Y && i7 != themeActivity.H && i7 != themeActivity.F) {
                                i10 = themeActivity.raiseToListenRow;
                                if (i7 != i10) {
                                    i11 = themeActivity.pauseOnRecordRow;
                                    if (i7 != i11 && i7 != themeActivity.E && i7 != themeActivity.f43982t0) {
                                        i12 = themeActivity.pauseOnMediaRow;
                                        if (i7 != i12 && i7 != themeActivity.G) {
                                            i13 = themeActivity.sensitiveContentRow;
                                            if (i7 != i13) {
                                                i14 = themeActivity.textSizeRow;
                                                if (i7 == i14) {
                                                    return 8;
                                                }
                                                if (i7 != themeActivity.f43974n0) {
                                                    i15 = themeActivity.nightThemeRow;
                                                    if (i7 != i15) {
                                                        i16 = themeActivity.browserRow;
                                                        if (i7 != i16) {
                                                            if (i7 == themeActivity.f43976p0) {
                                                                return 11;
                                                            }
                                                            if (i7 != themeActivity.f43979r0) {
                                                                i17 = themeActivity.bubbleRadiusRow;
                                                                if (i7 != i17) {
                                                                    i18 = themeActivity.backgroundRow;
                                                                    if (i7 != i18 && i7 != themeActivity.f43991z0) {
                                                                        i19 = themeActivity.createNewThemeRow;
                                                                        if (i7 != i19) {
                                                                            i20 = themeActivity.liteModeRow;
                                                                            if (i7 != i20) {
                                                                                i21 = themeActivity.stickersRow;
                                                                                if (i7 != i21 && i7 != themeActivity.B0) {
                                                                                    if (i7 == themeActivity.f43984v0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i7 == themeActivity.f43990y0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i7 == themeActivity.f43977q0) {
                                                                                        return 17;
                                                                                    }
                                                                                    if (i7 != themeActivity.I && i7 != themeActivity.J) {
                                                                                        i22 = themeActivity.appIconSelectorRow;
                                                                                        if (i7 != i22) {
                                                                                            i23 = themeActivity.changeUserColor;
                                                                                            if (i7 == i23) {
                                                                                                return 21;
                                                                                            }
                                                                                            return 1;
                                                                                        }
                                                                                        return 20;
                                                                                    }
                                                                                    return 19;
                                                                                }
                                                                                return 14;
                                                                            }
                                                                            return 14;
                                                                        }
                                                                        return 14;
                                                                    }
                                                                    return 14;
                                                                }
                                                                return 13;
                                                            }
                                                            return 12;
                                                        }
                                                        return 10;
                                                    }
                                                    return 10;
                                                }
                                                return 9;
                                            }
                                            return 7;
                                        }
                                        return 7;
                                    }
                                    return 7;
                                }
                                return 7;
                            }
                            return 7;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        String N0;
        String N02;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        String N03;
        String N04;
        int i23 = f1Var.f59249f;
        View view = f1Var.f59245a;
        ThemeActivity themeActivity = this.f47460e;
        boolean z11 = false;
        boolean z12 = true;
        if (i23 != 1) {
            if (i23 != 2) {
                if (i23 != 4) {
                    if (i23 != 5) {
                        if (i23 != 6) {
                            if (i23 != 7) {
                                if (i23 != 14) {
                                    if (i23 != 17) {
                                        if (i23 != 19) {
                                            if (i23 != 21) {
                                                switch (i23) {
                                                    case 10:
                                                        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                                                        i21 = themeActivity.nightThemeRow;
                                                        if (i7 != i21) {
                                                            i22 = themeActivity.browserRow;
                                                            if (i7 == i22) {
                                                                i5Var.b(org.telegram.messenger.gd.N0(2131749016, null), org.telegram.messenger.gd.N0(2131749015, null), 2131232034, themeActivity.getMessagesController().S2(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (org.telegram.ui.ActionBar.n6.f29645o != 0) {
                                                            z11 = true;
                                                        }
                                                        if (z11) {
                                                            N03 = org.telegram.ui.ActionBar.n6.C0();
                                                        } else {
                                                            N03 = org.telegram.messenger.gd.N0(2131753780, "AutoNightThemeOff");
                                                        }
                                                        if (z11) {
                                                            int i24 = org.telegram.ui.ActionBar.n6.f29645o;
                                                            if (i24 == 1) {
                                                                N04 = org.telegram.messenger.gd.N0(2131753784, "AutoNightScheduled");
                                                            } else if (i24 == 3) {
                                                                N04 = org.telegram.messenger.gd.N0(2131753783, "AutoNightSystemDefault");
                                                            } else {
                                                                N04 = org.telegram.messenger.gd.N0(2131753793, "AutoNightAdaptive");
                                                            }
                                                            N03 = a8.p0.E(N04, " ", N03);
                                                        }
                                                        i5Var.b(org.telegram.messenger.gd.N0(2131753781, "AutoNightTheme"), N03, 2131231847, z11, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.f43960c.A1(themeActivity.f43958b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        org.telegram.ui.Components.ek0 ek0Var = (org.telegram.ui.Components.ek0) view;
                                                        g61 g61Var = (g61) ek0Var.getAdapter();
                                                        g61Var.f();
                                                        int indexOf = g61Var.f48119e.indexOf(g61Var.d.k(false));
                                                        if (indexOf == -1) {
                                                            indexOf = g61Var.b() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((v4.c0) ek0Var.getLayoutManager()).h1(indexOf, (themeActivity.f43958b.getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((pl0) view).set(themeActivity.getUserConfig().f());
                                            return;
                                        }
                                        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                                        if (i7 == themeActivity.I) {
                                            h6Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            h6Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((wt) view).a();
                                    return;
                                }
                                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                                m8Var.f31181w = 48;
                                i16 = themeActivity.backgroundRow;
                                if (i7 == i16) {
                                    m8Var.setSubtitle(null);
                                    int i25 = org.telegram.ui.ActionBar.n6.f29691q6;
                                    m8Var.g(i25, i25);
                                    String N05 = org.telegram.messenger.gd.N0(2131752538, null);
                                    i20 = themeActivity.changeUserColor;
                                    if (i20 >= 0) {
                                        z11 = true;
                                    }
                                    m8Var.o(2131232071, N05, z11);
                                    return;
                                } else if (i7 != themeActivity.f43991z0) {
                                    i17 = themeActivity.createNewThemeRow;
                                    if (i7 != i17) {
                                        i18 = themeActivity.liteModeRow;
                                        if (i7 != i18) {
                                            i19 = themeActivity.stickersRow;
                                            if (i7 == i19) {
                                                m8Var.g(org.telegram.ui.ActionBar.n6.J5, org.telegram.ui.ActionBar.n6.G6);
                                                m8Var.o(2131232043, org.telegram.messenger.gd.N0(2131744616, null), true);
                                                m8Var.setSubtitle(org.telegram.messenger.gd.N0(2131744615, null));
                                                m8Var.f31180s = 64;
                                                m8Var.f31181w = 60;
                                                m8Var.f31182x = 20;
                                                return;
                                            } else if (i7 == themeActivity.B0) {
                                                m8Var.g(org.telegram.ui.ActionBar.n6.J5, org.telegram.ui.ActionBar.n6.G6);
                                                m8Var.o(2131232042, org.telegram.messenger.gd.N0(2131745035, null), false);
                                                m8Var.setSubtitle(org.telegram.messenger.gd.N0(2131745036, null));
                                                m8Var.f31180s = 64;
                                                m8Var.f31181w = 60;
                                                m8Var.f31182x = 20;
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        m8Var.g(org.telegram.ui.ActionBar.n6.J5, org.telegram.ui.ActionBar.n6.G6);
                                        m8Var.o(2131232019, org.telegram.messenger.gd.N0(2131748673, null), true);
                                        m8Var.setSubtitle(org.telegram.messenger.gd.N0(2131748672, null));
                                        m8Var.f31181w = 60;
                                        m8Var.f31180s = 64;
                                        m8Var.f31182x = 20;
                                        return;
                                    }
                                    m8Var.setSubtitle(null);
                                    int i26 = org.telegram.ui.ActionBar.n6.f29691q6;
                                    m8Var.g(i26, i26);
                                    m8Var.o(2131232102, org.telegram.messenger.gd.N0(2131751700, null), false);
                                    return;
                                } else {
                                    m8Var.setSubtitle(null);
                                    int i27 = org.telegram.ui.ActionBar.n6.f29691q6;
                                    m8Var.g(i27, i27);
                                    m8Var.o(2131232405, org.telegram.messenger.gd.N0(2131751269, null), true);
                                    return;
                                }
                            }
                            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                            if (i7 == themeActivity.Y) {
                                r8Var.f(org.telegram.messenger.gd.N0(2131753788, "AutoNightLocation"), org.telegram.ui.ActionBar.n6.f29664p, true);
                                return;
                            } else if (i7 == themeActivity.O) {
                                r8Var.f(org.telegram.messenger.gd.N0(2131751145, "EnableAnimations"), org.telegram.messenger.mp.g1().getBoolean("view_animations", true), true);
                                return;
                            } else if (i7 == themeActivity.H) {
                                r8Var.f(org.telegram.messenger.gd.N0(2131745436, "SendByEnter"), org.telegram.messenger.mp.g1().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i7 != themeActivity.F) {
                                i12 = themeActivity.raiseToListenRow;
                                if (i7 == i12) {
                                    r8Var.g(org.telegram.messenger.gd.N0(2131746231, "RaiseToListen"), org.telegram.messenger.gd.N0(2131746230, "RaiseToListenInfo"), org.telegram.messenger.bz.f23320s0, true, true);
                                    return;
                                } else if (i7 != themeActivity.G) {
                                    i13 = themeActivity.pauseOnRecordRow;
                                    if (i7 != i13) {
                                        i14 = themeActivity.pauseOnMediaRow;
                                        if (i7 == i14) {
                                            r8Var.f(org.telegram.messenger.gd.N0(2131747238, null), org.telegram.messenger.bz.G0, true);
                                            return;
                                        } else if (i7 != themeActivity.E) {
                                            i15 = themeActivity.sensitiveContentRow;
                                            if (i7 == i15) {
                                                r8Var.g(org.telegram.messenger.gd.N0(2131745134, null), org.telegram.messenger.gd.N0(2131745133, null), themeActivity.getMessagesController().e5(), true, true);
                                                return;
                                            } else if (i7 == themeActivity.f43982t0) {
                                                r8Var.f(org.telegram.messenger.gd.N0(2131753672, "BlurInChat"), org.telegram.messenger.bz.f(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            r8Var.g(org.telegram.messenger.gd.N0(2131751426, "DirectShare"), org.telegram.messenger.gd.N0(2131751425, "DirectShareInfo"), org.telegram.messenger.bz.f23334x0, false, true);
                                            return;
                                        }
                                    }
                                    r8Var.g(org.telegram.messenger.gd.N0(2131747237, null), org.telegram.messenger.gd.N0(2131747236, "PauseMusicOnRecordInfo"), org.telegram.messenger.bz.F0, true, true);
                                    return;
                                } else {
                                    r8Var.g(org.telegram.messenger.gd.N0(2131748056, "NextMediaTap"), org.telegram.messenger.gd.N0(2131748055, "NextMediaTapInfo"), org.telegram.messenger.bz.f23323t0, true, true);
                                    return;
                                }
                            } else {
                                r8Var.g(org.telegram.messenger.gd.N0(2131746229, "RaiseToSpeak"), org.telegram.messenger.gd.N0(2131746228, "RaiseToSpeakInfo"), org.telegram.messenger.bz.f23317r0, true, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.j0) view).setProgress(org.telegram.ui.ActionBar.n6.f29684q);
                        return;
                    }
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                    if (i7 == themeActivity.X) {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131753785, "AutoNightSchedule"));
                        return;
                    } else if (i7 == themeActivity.f43964e0) {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131753792, "AutoNightBrightness"));
                        return;
                    } else if (i7 == themeActivity.f43968h0) {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131753786, "AutoNightPreferred"));
                        return;
                    } else if (i7 == themeActivity.f43989y) {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131745787, "SETTINGS"));
                        return;
                    } else if (i7 == themeActivity.f43970j0) {
                        if (themeActivity.f43965f == 3) {
                            o4Var.setText(org.telegram.messenger.gd.N0(2131752827, "BuildMyOwnTheme"));
                            return;
                        } else {
                            o4Var.setText(org.telegram.messenger.gd.N0(2131751999, "ColorTheme"));
                            return;
                        }
                    } else if (i7 == themeActivity.f43987x) {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131743946, "TextSizeHeader"));
                        return;
                    } else if (i7 == themeActivity.m0) {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131752213, "ChatList"));
                        return;
                    } else if (i7 == themeActivity.f43971k0) {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131752828, "BubbleRadius"));
                        return;
                    } else if (i7 == themeActivity.f43983u0) {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131752210, "ChatListSwipeGesture"));
                        return;
                    } else if (i7 == themeActivity.f43988x0) {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131745455, "SelectTheme"));
                        return;
                    } else if (i7 == themeActivity.J0) {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131754237, null));
                        return;
                    } else if (i7 == themeActivity.H0) {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131747571, "OtherSettings"));
                        return;
                    } else if (i7 == themeActivity.G0) {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131748467, "MediaAndSoundSettings"));
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                if (i7 == themeActivity.S) {
                    String N06 = org.telegram.messenger.gd.N0(2131753790, "AutoNightDisabled");
                    if (org.telegram.ui.ActionBar.n6.f29645o == 0) {
                        z11 = true;
                    }
                    caVar.a(N06, z11, true);
                    return;
                } else if (i7 == themeActivity.T) {
                    String N07 = org.telegram.messenger.gd.N0(2131753784, "AutoNightScheduled");
                    if (org.telegram.ui.ActionBar.n6.f29645o == 1) {
                        z11 = true;
                    }
                    caVar.a(N07, z11, true);
                    return;
                } else if (i7 == themeActivity.U) {
                    String N08 = org.telegram.messenger.gd.N0(2131753793, "AutoNightAdaptive");
                    if (org.telegram.ui.ActionBar.n6.f29645o == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (themeActivity.V != -1) {
                        z11 = true;
                    }
                    caVar.a(N08, z10, z11);
                    return;
                } else if (i7 == themeActivity.V) {
                    String N09 = org.telegram.messenger.gd.N0(2131753783, "AutoNightSystemDefault");
                    if (org.telegram.ui.ActionBar.n6.f29645o != 3) {
                        z12 = false;
                    }
                    caVar.a(N09, z12, false);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setFixedSize(0);
            if (i7 == themeActivity.f43967g0) {
                z8Var.setText(org.telegram.messenger.gd.a0("AutoNightBrightnessInfo", null, 2131753791, Integer.valueOf((int) (org.telegram.ui.ActionBar.n6.f29684q * 100.0f))));
                return;
            } else if (i7 == themeActivity.f43957a0) {
                z8Var.setText(ThemeActivity.D0());
                return;
            } else if (i7 == themeActivity.f43986w0) {
                z8Var.setText(org.telegram.messenger.gd.N0(2131752209, "ChatListSwipeGestureInfo"));
                return;
            } else if (i7 == themeActivity.I0) {
                z8Var.setText(org.telegram.messenger.gd.N0(2131748672, "LiteModeInfo"));
                return;
            } else {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            }
        }
        org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
        i10 = themeActivity.nightThemeRow;
        if (i7 == i10) {
            if (org.telegram.ui.ActionBar.n6.f29645o != 0 && org.telegram.ui.ActionBar.n6.J != null) {
                w9Var.c(org.telegram.messenger.gd.N0(2131753781, null), org.telegram.ui.ActionBar.n6.C0(), false, false);
            } else {
                w9Var.c(org.telegram.messenger.gd.N0(2131753781, null), org.telegram.messenger.gd.N0(2131753780, null), false, false);
            }
        } else if (i7 == themeActivity.f43959b0) {
            int i28 = org.telegram.ui.ActionBar.n6.f29703r;
            int i29 = i28 / 60;
            w9Var.c(org.telegram.messenger.gd.N0(2131753789, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i29), Integer.valueOf(i28 - (i29 * 60))), false, true);
        } else if (i7 == themeActivity.f43961c0) {
            int i30 = org.telegram.ui.ActionBar.n6.f29723s;
            int i31 = i30 / 60;
            w9Var.c(org.telegram.messenger.gd.N0(2131753779, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i31), Integer.valueOf(i30 - (i31 * 60))), false, false);
        } else if (i7 == themeActivity.Z) {
            w9Var.c(org.telegram.messenger.gd.N0(2131753778, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.n6.f29798w, false, false);
        } else if (i7 == themeActivity.R) {
            int i32 = org.telegram.messenger.mp.g1().getInt("sortContactsBy", 0);
            if (i32 == 0) {
                N02 = org.telegram.messenger.gd.N0(2131751588, "Default");
            } else if (i32 == 1) {
                N02 = org.telegram.messenger.gd.N0(2131745091, "FirstName");
            } else {
                N02 = org.telegram.messenger.gd.N0(2131745090, "LastName");
            }
            w9Var.c(org.telegram.messenger.gd.N0(2131745095, "SortBy"), N02, false, true);
        } else if (i7 == themeActivity.Q) {
            w9Var.b(org.telegram.messenger.gd.N0(2131749071, "ImportContacts"), true);
        } else if (i7 == themeActivity.L) {
            int i33 = org.telegram.messenger.bz.f23321s1;
            if (i33 == 0) {
                N0 = org.telegram.messenger.gd.N0(2131751354, "DistanceUnitsAutomatic");
            } else if (i33 == 1) {
                N0 = org.telegram.messenger.gd.N0(2131751353, "DistanceUnitsKilometers");
            } else {
                N0 = org.telegram.messenger.gd.N0(2131751352, "DistanceUnitsMiles");
            }
            String N010 = org.telegram.messenger.gd.N0(2131751355, "DistanceUnits");
            boolean z13 = themeActivity.Q0;
            if (themeActivity.F0 < 0) {
                z12 = false;
            }
            w9Var.c(N010, N0, z13, z12);
            themeActivity.Q0 = false;
        } else if (i7 == themeActivity.M) {
            w9Var.c(org.telegram.messenger.gd.N0(2131745603, null), org.telegram.ui.web.e1.a().f53361a, themeActivity.R0, false);
        } else if (i7 == themeActivity.N) {
            String N011 = org.telegram.messenger.gd.N0(2131748246, null);
            if (org.telegram.messenger.bz.f23326u0) {
                i11 = 2131748244;
            } else {
                i11 = 2131748245;
            }
            w9Var.c(N011, org.telegram.messenger.gd.N0(i11, null), themeActivity.P0, false);
            themeActivity.P0 = false;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ?? frameLayout;
        int i10;
        int i11;
        float f10;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        d61 i5Var;
        int i14;
        org.telegram.ui.ActionBar.r4 r4Var;
        int i15;
        int i16;
        int i17 = 3;
        float f11 = 21.0f;
        ThemeActivity themeActivity = this.f47460e;
        Context context = this.f47459c;
        switch (i7) {
            case 1:
                i5Var = new org.telegram.ui.Cells.w9(context);
                break;
            case 2:
                i5Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 3:
                i5Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 4:
                frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.f30577a = textView;
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
                org.telegram.messenger.m10.q(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (org.telegram.messenger.gd.f24314a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 16);
                boolean z12 = org.telegram.messenger.gd.f24314a0;
                if (z12) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                int i18 = i11 | 48;
                if (z12) {
                    f10 = 71.0f;
                } else {
                    f10 = 21.0f;
                }
                if (!z12) {
                    f11 = 23.0f;
                }
                frameLayout.addView(textView, c8.na.d(-1, -1.0f, i18, f10, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.f30578b = imageView;
                org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Di, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131232760);
                if (!org.telegram.messenger.gd.f24314a0) {
                    i17 = 5;
                }
                frameLayout.addView(imageView, c8.na.d(19, 14.0f, i17 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                i5Var = frameLayout;
                break;
            case 5:
                i5Var = new org.telegram.ui.Cells.o4(context);
                break;
            case 6:
                i5Var = new a61(this, context);
                break;
            case 7:
                i5Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                i5Var = new f61(themeActivity, context);
                break;
            case 9:
                frameLayout = new b61(context, 0);
                frameLayout.f45965b = new org.telegram.ui.Cells.x0[2];
                frameLayout.setOrientation(0);
                frameLayout.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), 0);
                int i19 = 0;
                while (true) {
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) frameLayout.f45965b;
                    if (i19 >= x0VarArr.length) {
                        i5Var = frameLayout;
                        break;
                    } else {
                        if (i19 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(context, 0);
                        x0Var.f32380b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        x0Var.f32382e = textPaint;
                        x0Var.setWillNotDraw(false);
                        x0Var.f32381c = z10;
                        if (z10) {
                            i12 = 2131752211;
                        } else {
                            i12 = 2131752212;
                        }
                        x0Var.setContentDescription(org.telegram.messenger.gd.N0(i12, null));
                        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(x0Var, context);
                        x0Var.d = w0Var;
                        w0Var.setSize(org.telegram.messenger.g0.L(20.0f));
                        x0Var.addView(w0Var, c8.na.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        if ((z10 && org.telegram.messenger.bz.f23312p1) || (!z10 && !org.telegram.messenger.bz.f23312p1)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        w0Var.a(z11, false);
                        x0VarArr[i19] = x0Var;
                        org.telegram.ui.Cells.x0 x0Var2 = ((org.telegram.ui.Cells.x0[]) frameLayout.f45965b)[i19];
                        if (i19 == 1) {
                            i13 = 10;
                        } else {
                            i13 = 0;
                        }
                        frameLayout.addView(x0Var2, c8.na.m(0.5f, -1, -1, i13, 0, 0));
                        ((org.telegram.ui.Cells.x0[]) frameLayout.f45965b)[i19].setOnClickListener(new fi.v1(3, frameLayout, z10));
                        i19++;
                    }
                }
                break;
            case 10:
                i5Var = new org.telegram.ui.Cells.i5(this.f47459c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                c61 c61Var = new c61(this, this.f47459c, themeActivity, themeActivity.f43965f, themeActivity.f43963e, themeActivity.d);
                themeActivity.f43960c = c61Var;
                c61Var.setDrawDivider(themeActivity.f43985w);
                themeActivity.f43960c.setFocusable(false);
                View view = themeActivity.f43960c;
                view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(148.0f)));
                i5Var = view;
                break;
            case 12:
                d61 d61Var = new d61(0, context, null);
                d61Var.setFocusable(false);
                d61Var.setItemAnimator(null);
                d61Var.setLayoutAnimation(null);
                d61Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
                d61Var.setClipToPadding(false);
                v4.c0 c0Var = new v4.c0();
                c0Var.j1(0);
                d61Var.setLayoutManager(c0Var);
                g61 g61Var = new g61(themeActivity, context);
                d61Var.setAdapter(g61Var);
                d61Var.setOnItemClickListener(new y51(this, g61Var, d61Var, 0));
                d61Var.setOnItemLongClickListener(new yi0(20, this, g61Var));
                d61Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(62.0f)));
                i5Var = d61Var;
                break;
            case 13:
                i5Var = new v51(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                i5Var = new org.telegram.ui.Cells.m8(context);
                break;
            case 15:
                i14 = ((org.telegram.ui.ActionBar.g2) themeActivity).currentAccount;
                i5Var = new org.telegram.ui.Components.fx0(context, i14);
                break;
            case 16:
                r4Var = ((org.telegram.ui.ActionBar.g2) themeActivity).parentLayout;
                View yl0Var = new yl0(context, r4Var, 0);
                yl0Var.setImportantForAccessibility(4);
                i5Var = yl0Var;
                break;
            case 17:
                View wtVar = new wt(themeActivity.f43965f, context, themeActivity);
                wtVar.setFocusable(false);
                wtVar.setLayoutParams(new v4.q0(-1, -2));
                i5Var = wtVar;
                break;
            case 19:
                i5Var = new org.telegram.ui.Cells.h6(context, false);
                break;
            case 20:
                i15 = ((org.telegram.ui.ActionBar.g2) themeActivity).currentAccount;
                ?? ek0Var = new org.telegram.ui.Components.ek0(context, null);
                ek0Var.f31887f3 = new ArrayList();
                ek0Var.f31889h3 = i15;
                ek0Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                ek0Var.setFocusable(false);
                ek0Var.setItemAnimator(null);
                ek0Var.setLayoutAnimation(null);
                v4.c0 c0Var2 = new v4.c0(0, false);
                ek0Var.f31888g3 = c0Var2;
                ek0Var.setLayoutManager(c0Var2);
                ek0Var.setAdapter(new z7(ek0Var, 1));
                ek0Var.i(new ai.f0(ek0Var, 2));
                ek0Var.setOnItemClickListener(new bi.u1(ek0Var, themeActivity, context, 4));
                ek0Var.z1();
                i5Var = ek0Var;
                break;
            case 21:
                i16 = ((org.telegram.ui.ActionBar.g2) themeActivity).currentAccount;
                frameLayout = new pl0(i16, 0L, this.f47459c, themeActivity.getResourceProvider());
                i5Var = frameLayout;
                break;
        }
        return new v4.f1(i5Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        boolean z10;
        if (f1Var.f59249f == 4) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) f1Var.f59245a;
            if (f1Var.b() == org.telegram.ui.ActionBar.n6.f29645o) {
                z10 = true;
            } else {
                z10 = false;
            }
            caVar.setTypeChecked(z10);
        }
    }
}
