package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class j90 extends i7.t {
    public int f29626a;
    public final TL_iv.PageBlock f29627b;
    public TL_iv.textConcat f29628c = new TL_iv.textConcat();

    public j90(TL_iv.PageBlock pageBlock) {
        this.f29627b = pageBlock;
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
    public final void a(le.b bVar) {
        int i10 = this.f29626a;
        if (i10 >= 64) {
            return;
        }
        this.f29626a = i10 + 1;
        try {
            v(bVar);
        } finally {
            this.f29626a--;
        }
    }

    @Override
    public final void b(le.c cVar) {
        int i10 = this.f29626a;
        if (i10 >= 64) {
            return;
        }
        this.f29626a = i10 + 1;
        try {
            v(cVar);
        } finally {
            this.f29626a--;
        }
    }

    @Override
    public final void c(le.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = m90.j(dVar.h);
        w(textfixed);
    }

    @Override
    public final void d(le.e eVar) {
        if (eVar instanceof ee.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof jc.d) {
            w(m90.c(((jc.d) eVar).f11442g));
        } else {
            v(eVar);
        }
    }

    @Override
    public final void e(le.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override
    public final void i(le.k kVar) {
        w(y(kVar));
    }

    @Override
    public final void k(le.n nVar) {
        if (nVar instanceof jc.a) {
            if (!this.f29628c.texts.isEmpty()) {
                w(m90.j("\n"));
            }
            w(m90.c(((jc.a) nVar).f11437g));
            w(m90.j("\n"));
            return;
        }
        v(nVar);
    }

    @Override
    public final void l(le.o oVar) {
        int i10 = this.f29626a;
        if (i10 >= 64) {
            return;
        }
        this.f29626a = i10 + 1;
        try {
            v(oVar);
        } finally {
            this.f29626a--;
        }
    }

    @Override
    public final void m(le.q qVar) {
        int i10 = this.f29626a;
        if (i10 >= 64) {
            return;
        }
        this.f29626a = i10 + 1;
        try {
            v(qVar);
        } finally {
            this.f29626a--;
        }
    }

    @Override
    public final void n(le.r rVar) {
        if (!this.f29628c.texts.isEmpty()) {
            w(m90.j("\n\n"));
        }
        v(rVar);
    }

    @Override
    public final void o(le.s sVar) {
        w(m90.j(sVar.f15210g));
    }

    @Override
    public final void q(le.d dVar) {
        w(m90.j(dVar.h));
    }

    @Override
    public final void r(le.g gVar) {
        w(m90.j("\n"));
    }

    @Override
    public final void s(le.k kVar) {
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
    public final void t(le.g gVar) {
        String str;
        if (this.f29627b instanceof TL_iv.pageBlockBlockquote) {
            str = "\n";
        } else {
            str = " ";
        }
        w(m90.j(str));
    }

    @Override
    public final void u(le.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.f29628c.texts.add(richText);
    }

    public final TL_iv.RichText y(le.p pVar) {
        TL_iv.textConcat textconcat = this.f29628c;
        this.f29628c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x4 = x(this.f29628c);
        this.f29628c = textconcat;
        return x4;
    }
}
