package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class r90 extends k7.h0 {
    public int f30700a;
    public final TL_iv.PageBlock f30701b;
    public TL_iv.textConcat f30702c = new TL_iv.textConcat();

    public r90(TL_iv.PageBlock pageBlock) {
        this.f30701b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        if (textconcat.texts.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        if (textconcat.texts.size() == 1) {
            return textconcat.texts.get(0);
        }
        return textconcat;
    }

    @Override
    public final void a(ne.b bVar) {
        int i10 = this.f30700a;
        if (i10 >= 64) {
            return;
        }
        this.f30700a = i10 + 1;
        try {
            v(bVar);
        } finally {
            this.f30700a--;
        }
    }

    @Override
    public final void b(ne.c cVar) {
        int i10 = this.f30700a;
        if (i10 >= 64) {
            return;
        }
        this.f30700a = i10 + 1;
        try {
            v(cVar);
        } finally {
            this.f30700a--;
        }
    }

    @Override
    public final void c(ne.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = u90.j(dVar.h);
        w(textfixed);
    }

    @Override
    public final void d(ne.e eVar) {
        if (eVar instanceof ge.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof lc.d) {
            w(u90.c(((lc.d) eVar).f12278g));
        } else {
            v(eVar);
        }
    }

    @Override
    public final void e(ne.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override
    public final void i(ne.k kVar) {
        w(y(kVar));
    }

    @Override
    public final void k(ne.n nVar) {
        if (nVar instanceof lc.a) {
            if (!this.f30702c.texts.isEmpty()) {
                w(u90.j("\n"));
            }
            w(u90.c(((lc.a) nVar).f12273g));
            w(u90.j("\n"));
            return;
        }
        v(nVar);
    }

    @Override
    public final void l(ne.o oVar) {
        int i10 = this.f30700a;
        if (i10 >= 64) {
            return;
        }
        this.f30700a = i10 + 1;
        try {
            v(oVar);
        } finally {
            this.f30700a--;
        }
    }

    @Override
    public final void m(ne.q qVar) {
        int i10 = this.f30700a;
        if (i10 >= 64) {
            return;
        }
        this.f30700a = i10 + 1;
        try {
            v(qVar);
        } finally {
            this.f30700a--;
        }
    }

    @Override
    public final void n(ne.r rVar) {
        if (!this.f30702c.texts.isEmpty()) {
            w(u90.j("\n\n"));
        }
        v(rVar);
    }

    @Override
    public final void o(ne.s sVar) {
        w(u90.j(sVar.f15981g));
    }

    @Override
    public final void q(ne.d dVar) {
        w(u90.j(dVar.h));
    }

    @Override
    public final void r(ne.g gVar) {
        w(u90.j("\n"));
    }

    @Override
    public final void s(ne.k kVar) {
        String str = kVar.h;
        if (str == null) {
            str = "";
        }
        String trim = str.trim();
        if (trim.startsWith("mailto:")) {
            TL_iv.RichText textemail = new TL_iv.textEmail();
            textemail.text = y(kVar);
            textemail.email = trim.substring(7);
            w(textemail);
        } else if (trim.startsWith("tel:")) {
            TL_iv.textPhone textphone = new TL_iv.textPhone();
            textphone.text = y(kVar);
            textphone.phone = trim.substring(4);
            w(textphone);
        } else {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = y(kVar);
            texturl.url = trim;
            w(texturl);
        }
    }

    @Override
    public final void t(ne.g gVar) {
        String str;
        if (this.f30701b instanceof TL_iv.pageBlockBlockquote) {
            str = "\n";
        } else {
            str = " ";
        }
        w(u90.j(str));
    }

    @Override
    public final void u(ne.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.f30702c.texts.add(richText);
    }

    public final TL_iv.RichText y(ne.p pVar) {
        TL_iv.textConcat textconcat = this.f30702c;
        this.f30702c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.f30702c);
        this.f30702c = textconcat;
        return x10;
    }
}
